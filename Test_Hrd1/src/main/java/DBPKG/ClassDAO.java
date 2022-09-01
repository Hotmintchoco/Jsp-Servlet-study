package DBPKG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClassDAO {

	PreparedStatement ps = null;
	
	public static Connection getConnection() throws Exception {
		 Class.forName("oracle.jdbc.OracleDriver");
		 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@"
		 		+ "//localhost:1521/xe","system","1234");
		 return con;
	}
	
	public void disConnction() {
		if(ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 과정 리스트 출력
	public List<ClassVO> getClassList() {
		List<ClassVO> list = new ArrayList<ClassVO>();
		String sql = "select * from TBL_CLASS_202201 order by class_seq";
		try {
			Connection conn = getConnection();
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				ClassVO vo = new ClassVO();
				
				vo.setClassSeq(rs.getInt(1));
				vo.setRegistMonth(rs.getString(2));
				vo.setcNo(rs.getString(3));
				vo.setClassArea(rs.getString(4));
				vo.setTution(rs.getInt(5));
				vo.setTeacherCode(rs.getString(6));
				
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnction();
		}
		return list;
	}
	
	//과정 마지막 순번 출력
	public int lastSeq() {
		int seq = 0;
		String sql = "select max(class_seq) from tbl_class_202201";
		try {
			Connection conn = getConnection();
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			rs.next();
			
			seq = rs.getInt(1);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnction();
		}
		return seq;
	}
	
	public void insertClass(ClassVO vo) {
		String sql = "insert into TBL_CLASS_202201"
				+ "(class_seq, regist_month, c_no, class_area, tution, teacher_code)"
				+ "values(?, ?, ?, ?, ?, ?)";
		try {
			Connection conn = getConnection();
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, vo.getClassSeq());
			ps.setString(2, vo.getRegistMonth());
			ps.setString(3, vo.getcNo());
			ps.setString(4, vo.getClassArea());
			ps.setInt(5, vo.getTution());
			ps.setString(6, vo.getTeacherCode());
			
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnction();
		}
	}
	
	
	// 과정 리스트 출력
	public DetailClassVO getDetail(String no) {
		DetailClassVO detail = new DetailClassVO();
		String sql = "select t1.regist_month, t1.c_no, t1.class_area, t1.tution,"
				+ " t2.teacher_code, t2.teacher_name, t2.class_name"
				+ " from tbl_class_202201 t1, tbl_teacher_202201 t2"
				+ " where t1.teacher_code = t2.teacher_code and c_no=?"
				+ " GROUP BY t1.regist_month, t1.c_no, t1.class_area, t1.tution, "
				+ " t2.teacher_code, t2.teacher_name, t2.class_name";
		try {
			System.out.println(no);
			Connection conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, no);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString(1));
				detail.setRegistMonth(rs.getString(1));
				detail.setcNo(rs.getString(2));
				detail.setClassArea(rs.getString(3));
				detail.setTution(rs.getInt(4));
				detail.setTeacherCode(rs.getString(5));
				detail.setTeacherName(rs.getString(6));
				detail.setClassName(rs.getString(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnction();
		}
		return detail;
	}
		
	// 과정 정보 출력
	public ClassVO get(int seq) {
		ClassVO vo = new ClassVO();
		String sql = "select * from TBL_CLASS_202201 where class_seq = ?";
		try {
			Connection conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, seq);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				vo.setClassSeq(rs.getInt(1));
				vo.setRegistMonth(rs.getString(2));
				vo.setcNo(rs.getString(3));
				vo.setClassArea(rs.getString(4));
				vo.setTution(rs.getInt(5));
				vo.setTeacherCode(rs.getString(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnction();
		}
		return vo;
	}
	
	
	public void updateClass(ClassVO vo) {
		String sql = "update TBL_CLASS_202201 set regist_month=?, c_no=?, class_area=?, tution=?, teacher_code=? "
				+ "where class_seq = ?";
		try {
			Connection conn = getConnection();
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, vo.getRegistMonth());
			ps.setString(2, vo.getcNo());
			ps.setString(3, vo.getClassArea());
			ps.setInt(4, vo.getTution());
			ps.setString(5, vo.getTeacherCode());
			ps.setInt(6, vo.getClassSeq());
			
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnction();
		}
	}
	
	public void deleteClass(int seq) {
		String sql = "delete tbl_class_202201 where class_seq = ?";
		try {
			Connection conn = getConnection();
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, seq);
			
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnction();
		}
	}
		
}
