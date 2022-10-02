package DBPKG;

import java.util.Date;

/*
create table TBL_VOTE_202005(
    V_JUMIN CHAR(13) NOT NULL,
    V_NAME VARCHAR2(20),
    M_NO CHAR(1),
    V_TIME CHAR(4),
    V_AREA CHAR(20),
    V_CONFIRM CHAR(1),
    primary key(V_JUMIN)
);

create table TBL_MEMBER_202005(
    M_NO CHAR(1),
    M_NAME VARCHAR2(20),
    P_CODE CHAR(2),
    P_SCHOOL CHAR(1),
    M_JUMIN CHAR(13),
    M_CITY VARCHAR2(20),
    primary key(M_NO)
);

create table TBL_PARTY_202005(
    P_CODE CHAR(2) NOT NULL,
    P_NAME VARCHAR2(20),
    P_INDATE DATE,
    P_PEADER VARCHAR2(20),
    P_TEL1 CHAR(3),
    P_TEL2 CHAR(4),
    P_TEL3 CHAR(4),
    primary key(P_CODE)
);
*/

public class VoteVO {
	
	private String V_JUMIN, V_NAME, M_NO, V_TIME, V_AREA, V_CONFIRM,
	M_NAME, P_CODE, P_SCHOOL, M_JUMIN, M_CITY,
	P_NAME, P_PEADER, P_TEL1, P_TEL2, P_TEL3, tel;
	
	private Date P_INDATE;

	
	public String getV_JUMIN() {
		return V_JUMIN;
	}

	public void setV_JUMIN(String v_JUMIN) {
		V_JUMIN = v_JUMIN;
	}

	public String getV_NAME() {
		return V_NAME;
	}

	public void setV_NAME(String v_NAME) {
		V_NAME = v_NAME;
	}

	public String getM_NO() {
		return M_NO;
	}

	public void setM_NO(String m_NO) {
		M_NO = m_NO;
	}

	public String getV_TIME() {
		return V_TIME;
	}

	public void setV_TIME(String v_TIME) {
		V_TIME = v_TIME;
	}

	public String getV_AREA() {
		return V_AREA;
	}

	public void setV_AREA(String v_AREA) {
		V_AREA = v_AREA;
	}

	public String getV_CONFIRM() {
		return V_CONFIRM;
	}

	public void setV_CONFIRM(String v_CONFIRM) {
		V_CONFIRM = v_CONFIRM;
	}

	public String getM_NAME() {
		return M_NAME;
	}

	public void setM_NAME(String m_NAME) {
		M_NAME = m_NAME;
	}

	public String getP_CODE() {
		return P_CODE;
	}

	public void setP_CODE(String p_CODE) {
		P_CODE = p_CODE;
	}

	public String getP_SCHOOL() {
		return P_SCHOOL;
	}

	public void setP_SCHOOL(String p_SCHOOL) {
		P_SCHOOL = p_SCHOOL;
	}

	public String getM_JUMIN() {
		return M_JUMIN;
	}

	public void setM_JUMIN(String m_JUMIN) {
		M_JUMIN = m_JUMIN;
	}

	public String getM_CITY() {
		return M_CITY;
	}

	public void setM_CITY(String m_CITY) {
		M_CITY = m_CITY;
	}

	public String getP_NAME() {
		return P_NAME;
	}

	public void setP_NAME(String p_NAME) {
		P_NAME = p_NAME;
	}

	public String getP_PEADER() {
		return P_PEADER;
	}

	public void setP_PEADER(String p_PEADER) {
		P_PEADER = p_PEADER;
	}

	public String getP_TEL1() {
		return P_TEL1;
	}

	public void setP_TEL1(String p_TEL1) {
		P_TEL1 = p_TEL1;
	}

	public String getP_TEL2() {
		return P_TEL2;
	}

	public void setP_TEL2(String p_TEL2) {
		P_TEL2 = p_TEL2;
	}

	public String getP_TEL3() {
		return P_TEL3;
	}

	public void setP_TEL3(String p_TEL3) {
		P_TEL3 = p_TEL3;
	}

	public Date getP_INDATE() {
		return P_INDATE;
	}

	public void setP_INDATE(Date p_INDATE) {
		P_INDATE = p_INDATE;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
