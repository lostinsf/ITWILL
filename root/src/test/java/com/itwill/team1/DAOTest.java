package com.itwill.team1;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itwill.team1.Persistence.DAO;

// @RunWith : 일반 클래스 파일을 스프링 테스트 파일로 사용하겠다.
// @ContextConfiguration : 스프링 테스트에 필요한 설정 파일경로 지정.

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/*.xml"}
		)
public class DAOTest {

	@Inject
	private DAO dao;
	
	@Test
	public void testSelectDao() throws Exception{
		System.out.println("DAO 객체 호출 : "+ dao.selectDao());
	}

}