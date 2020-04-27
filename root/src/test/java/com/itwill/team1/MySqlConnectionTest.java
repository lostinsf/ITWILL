package com.itwill.team1;


import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySqlConnectionTest {
	
	/* 1. DB 연결 멤버변수 */
	// DRIVER: 드라이버 주소
	private static final String DRIVER
		= "com.mysql.jdbc.Driver";
	// DBURL: DB 접속주소
	private static final String DBURL
		= "jdbc:mysql://127.0.0.1:3306/db";
	// DBID: DB 접속 ID
	private static final String DBID
		= "db";
	// DBPW: DB 접속 PW
	private static final String DBPW
		= "lostinsf1984@gmail.com";
	
	/* 2. DB 연결 테스트 */	
	@Test
	public void testCon() throws Exception{
			
		Class.forName(DRIVER);
		
		try{
			Connection con
				= DriverManager.getConnection(DBURL,DBID,DBPW);
			System.out.println("성공!! testCon() DB 연결 객체주소정보: " + con);
			
		}catch(Exception e) {
			System.out.println("실패TT testCon()");
			e.printStackTrace();
		}
	}

	
}
