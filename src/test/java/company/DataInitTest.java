package company;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wrq.bean.Company;
import com.wrq.bean.MoneyType;
import com.wrq.common.util.DateUtil;
import com.wrq.common.util.StringUtil;
import com.wrq.service.ComanyService;

// 通过  测试类完成数据的初始化操作
public class DataInitTest {

	@Test
	// 通过测试类操作数据库完成数据的添加
	public void test1() {
		ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext("applicationContext.xml");
		ComanyService service = cpa.getBean(ComanyService.class);
		// 通过循环10000次将数据 添加到数据库中
		for(int i=0;i<10000;i++) {
			// 通过工具类获取随机的名称
			int day=(int)(Math.random()*100);
			String cn = StringUtil.getStrRandom(3); // 3个长度的汉字
			Date  time=DateUtil.getRoundTime(day);
			int mid=(int)(Math.random()*(4-1+1)+1);
			Company company = new Company(null,cn,time,new MoneyType(mid));
			int j=service.addCompany(company);
		}
		
	}
}
