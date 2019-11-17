<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/bootstrap-3.3.7/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="/font-awesome-4.7.0/css/font-awesome.min.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
	function fenye(cpage){
		$("[name='cpage']").val(cpage);
		$("form").submit();
	}
</script>
</head>
<body>
	<form action="list.do" method="post">
		<input type="hidden" name="cpage" >
		公司名称<input type="text"name="mohu1" value="${map.mohu1 }">
		注册时间<input type="date" name="mohu2" value="${map.mohu2 }">--<input type="date" name="mohu3" value="${map.mohu3 }">
		<input type="submit" value="搜索">
	</form>
	<table class="table">
		<tr>
		<td>编号</td>
		<td>公司名称</td>
		<td>注册日期</td>
		<td>经济类型</td>
		<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="c">
				<tr>
					<td>${c.id }</td>
					<td>${c.name }</td>
					<td>${c.time }</td>
					<td>${c.tname }</td>
					<td>
						<a class="btn btn-success" href="/getCompanyInfo.do?id=${c.id}">详情</a>
					</td>
					</tr>
		</c:forEach>
		<tr>
			<td colspan="11">
				<nav aria-label="Page navigation">
				  <ul class="pagination">
				  	<li>
				      <a href="#" aria-label="Next" onclick="fenye(1)">
				        <span aria-hidden="true">&laquo;&laquo;</span>
				      </a>
				    </li>
				    <li>
				      <a href="#" aria-label="Previous" onclick="fenye(${pi.isIsFirstPage()?1:pi.getPrePage()})">
				        <span aria-hidden="true">&laquo;</span>
				      </a>
				    </li>
				    <c:forEach items="${pi.getNavigatepageNums()}" var="i">
				    
				    	<li
				    		<c:if test="${pi.getPageNum()==i }">class='active'</c:if>
				    	><a href="#" onclick="fenye(${i})">${i}</a></li>
				    </c:forEach>
				    <li>
				      <a href="#" aria-label="Next" onclick="fenye(${pi.isIsLastPage()?	pi.getPages():pi.getNextPage()})">
				        <span aria-hidden="true">&raquo;</span>
				      </a>
				    </li>
				    <li>
				      <a href="#" aria-label="Next" onclick="fenye(${pi.getPages()})">
				        <span aria-hidden="true">&raquo;&raquo;</span>
				      </a>
				    </li>
				  </ul>
				</nav>
			</td>
		
		</tr>
	</table>
</body>
</html>