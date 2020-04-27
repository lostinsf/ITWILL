package com.itwill.team1;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/*.xml"}
		)
public class MyBatisTest {
	@Inject
	private SqlSessionFactory sqlFactory;
	
	@Test
	public void testFactory() {
		System.out.println("testFactory()를 사용해서"
				+ "SqlSessionFactory 정보 확인"
				);
		System.out.println("---------------------"
				+ "------------------------"
				);
		System.out.println("의존 주입된 객체: " + sqlFactory);
	}
	
	@Test
	public void testSession() throws Exception{
		
		try(SqlSession session = 
				sqlFactory.openSession()
				){
			System.out.println("성공!! testSession() 세션연결 ");
		}catch(Exception e) {
			System.out.println("실패TT testSession() 세션연결 ");
			e.printStackTrace();
		}
	}
}
