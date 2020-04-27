package com.itwill.team1;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

// @RunWith + @ContextConfiguration => 스프링 테스트
// + @WebAppConfiguration => 스프링 MVC 테스트

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"}
		)

public class ControllerTest {
	// WAS 없이 Junit을 사용해서 테스트하기 (웹프로젝트 실행)
	
	// log 객체 준비
	private static final Logger logger
		= LoggerFactory.getLogger(ControllerTest.class);
	
	// 테스트 객체 생성
	// => 의존주입을 통한 객체 생성 및 초기화
	@Inject
	private WebApplicationContext wac;
	
	// 테스트 객체 선언
	// => 브라우저에서 요청, 응답정보를 처리하는 객체
	// => 테스트 할때 마다 가상의 요청, 응답에 대한 처리
	private MockMvc mockMvc = null;
	
	// 테스트 동작 이전 MockMvc 객체 생성
	// @Before : 테스트동작 이전에 해야할 동작을 구현
	@Before
	public void setUp() {
		this.mockMvc
			= MockMvcBuilders.webAppContextSetup(this.wac).build();
		logger.info("성공!! setUp() 객체생성 mockMvc : " + mockMvc);
	}
	
	// 테스트 동작
	@Test
	public void testDoa() throws Exception{
		logger.info("호출~~ testDoa() ");
		mockMvc.perform(MockMvcRequestBuilders.get("/doA"));
	}

}
