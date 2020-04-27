package com.itwill.team1;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// @RunWith : 테스트 코드를 스프링으로 처리할 수 있도록 준비
// @ContextConfiguration : 해당 경로에 있는 xml파일을 사용하여 스프링으로 처리할 수 있도록 함
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/*.xml"}
		)
public class DataSourceTest {
	
	// @@Inject : 객체가 주입되어 값이 생성됨
	@Inject
	private DataSource ds;
	
	// 디비 연결 상태를 체크 테스트 동작
	@Test
	public void testConn() throws Exception{
		try(Connection con = ds.getConnection()){
			System.out.println("성공!! testConn() DB연결 ");
		}catch(Exception e) {
			System.out.println("실패TT testConn() DB연결 ");
			e.printStackTrace();
		}
	}

}
