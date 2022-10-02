package DBPKG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VoteDAO {
	
	PreparedStatement ps = null;
	
	public static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection
				("jdbc:oracle:thin:@//localhost:1521/xe", "system", "1234");
		return con;
	}
	
	public void disConncetion() {
		if(ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public List<VoteVO> getMemberList() {
		List<VoteVO> list = new ArrayList<VoteVO>();
		String sql = "select t1.M_NO, t1.M_NAME, t2.P_NAME, t1.P_SCHOOL, t1.M_JUMIN, t1.M_CITY, "
				+ "t2.P_TEL1, t2.P_TEL2, t2.P_TEL3   "
				+ "from TBL_MEMBER_202005 t1, TBL_PARTY_202005 t2 "
				+ "where t1.p_code = t2.p_code";
		
		try {
			Connection conn = getConnection();
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				VoteVO vo = new VoteVO();
				
				vo.setM_NO(rs.getString(1));
				vo.setM_NAME(rs.getString(2));
				vo.setP_NAME(rs.getString(3));
				vo.setP_SCHOOL(rs.getString(4));
				
				String jumin = rs.getString(5);
				String jumin1 = jumin.substring(0,6);
				String jumin2 = jumin.substring(6);
				vo.setM_JUMIN(jumin1 + "-" + jumin2);
				vo.setM_CITY(rs.getString(6));
				vo.setP_TEL1("0" + rs.getString(7));
				vo.setP_TEL2(rs.getString(8));
				vo.setP_TEL3(rs.getString(9));
				
				vo.setTel(vo.getP_TEL1() + "-" + vo.getP_TEL2()
				+ "-" + vo.getP_TEL3());
				
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConncetion();
		}
		return list;
	}
	
	public void insertVote(VoteVO vo) {
		String sql = "insert into TBL_VOTE_202005 "
				+ "values(?, ?, ?, ?, ?, ?)";
		System.out.println(vo.getV_TIME());
		
		try {
			Connection conn = getConnection();
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getV_JUMIN());
			ps.setString(2, vo.getV_NAME());
			ps.setString(3, vo.getM_NO());
			ps.setString(4, vo.getV_TIME());
			ps.setString(5, vo.getV_AREA());
			ps.setString(6, vo.getV_CONFIRM());
			
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConncetion();
		}
	}
}
