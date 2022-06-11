package DBPKG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class manageDAO {
	PreparedStatement ps = null;
	
	public static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection
		 ("jdbc:oracle:thin:@//localhost:1521/xe","system","1234");
		return con;
		}
	
	public void disConnetion() {
		try {
			if (ps != null) ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//2. 마지막회원번호
		public int lastCustNO() {
			int lastNO = 0;
			
			try {
				Connection conn = getConnection();
				String sql = "select MAX(custno) from member_tbl_02";
				
				ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				
				if (rs.next()) {
					lastNO = rs.getInt(1);
				}
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				disConnetion();
			}
			
			return lastNO;
		}
	
	public void customerInsert(manageVO vo) {
		String sql = "insert into member_tbl_02 values(?, ?, ?, ?, ?, ?, ?)";
		try {
			Connection conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, vo.getNo());
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getPhone());
			ps.setString(4, vo.getAddress());
			ps.setString(5, vo.getJoindate());
			ps.setString(6, vo.getGrade() + "");
			ps.setString(7, vo.getCity());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnetion();
		}
	}
	
	public List<manageVO> memberList() {
		List<manageVO> list = new ArrayList<manageVO>();
		try {
			//1. 연결
			Connection conn = getConnection();
			//2. SQL문장 작성
			String sql = "select * from member_TBL_02";
			
			//3. 전송
			ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				manageVO vo = new manageVO();
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setPhone(rs.getString(3));
				vo.setAddress(rs.getString(4));
				vo.setJoindate(rs.getString(5));
				vo.setGrade(rs.getString(6).charAt(0));
				vo.setCity(rs.getString(7));
				list.add(vo);
			}
			//6. 닫기
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnetion();
		}
		
		return list;
	}
	
	public List<SalesVO> salesList() {
		List<SalesVO> list = new ArrayList<SalesVO>();
		try {
			//1. 연결
			Connection conn = getConnection();
			//2. SQL문장 작성
			String sql = "select m2.custno, m1.custname, m1.grade, sum(m2.price) as sales "
					+ "from member_tbl_02 m1, money_tbl_02 m2 "
					+ "where m1.CUSTNO = m2.custno "
					+ "group by m2.custno, m1.custname, m1.grade "
					+ "order by sales desc";
			
			//3. 전송
			ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				SalesVO vo = new SalesVO();
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setGrade(rs.getString(3).charAt(0));
				vo.setSales(rs.getInt(4));
				list.add(vo);
			}
			//6. 닫기
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnetion();
		}
		
		return list;
	}
	
	public manageVO getMember(int no) {
		manageVO vo = new manageVO();
		
		try {
			//1. 연결
			Connection conn = getConnection();
			//2. SQL문장 작성
			String sql = "select * from member_tbl_02 where CUSTNO = ?";
			
			//3. 전송
			ps = conn.prepareStatement(sql);
			ps.setInt(1, no);
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setPhone(rs.getString(3));
				vo.setAddress(rs.getString(4));
				vo.setJoindate(rs.getString(5));
				vo.setGrade(rs.getString(6).charAt(0));
				vo.setCity(rs.getString(7));
			}
			//6. 닫기
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnetion();
		}
		return vo;
	}
	
	public void memberUpdate(manageVO vo) {
		String sql = "update member_tbl_02 set custname=?, "
				+ "phone=?, address=?, joindate=?, grade=?, city=? "
				+ "where custno=?";
		try {
			Connection conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getPhone());
			ps.setString(3, vo.getAddress());
			ps.setString(4, vo.getJoindate());
			ps.setString(5, vo.getGrade() + "");
			ps.setString(6, vo.getCity());
			ps.setInt(7, vo.getNo());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnetion();
		}
	}
	
	public List<manageVO> searchMemberList(String search) {
		List<manageVO> list = new ArrayList<manageVO>();
		try {
			//1. 연결
			Connection conn = getConnection();
			//2. SQL문장 작성
			String sql = "select * "
					+ "from member_tbl_02 "
					+ "where custname like ? OR "
					+ "address like ?";
			
			//3. 전송
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+ search +"%");
			ps.setString(2, "%"+ search +"%");
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				manageVO vo = new manageVO();
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setPhone(rs.getString(3));
				vo.setAddress(rs.getString(4));
				vo.setJoindate(rs.getString(5));
				vo.setGrade(rs.getString(6).charAt(0));
				vo.setCity(rs.getString(7));
				list.add(vo);
			}
			//6. 닫기
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnetion();
		}
		
		return list;
	}
}
