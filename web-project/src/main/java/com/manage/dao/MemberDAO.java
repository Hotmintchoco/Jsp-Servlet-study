package com.manage.dao;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.manage.dao.MemberDAO;

public class MemberDAO {
	
	private MemberDAO() {}
	
	// 싱글톤 패턴으로 객체 생성
	private static MemberDAO instance = new MemberDAO();
	
	public static MemberDAO getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws Exception {
		Context initContext = new InitialContext();
		Context envContext = (Context) initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
		Connection conn = ds.getConnection();
		return conn;
	}
}
