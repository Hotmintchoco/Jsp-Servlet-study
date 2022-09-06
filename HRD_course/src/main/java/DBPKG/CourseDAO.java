package DBPKG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CourseDAO {
	PreparedStatement ps = null;
	
	public static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection
		 ("jdbc:oracle:thin:@//localhost:1521/xe","system","1234");
		return con;
	}
	
	public void disconnect() {
		if(ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public List<Course> getCourseList() {
		List<Course> list = new ArrayList<>();
		String sql = "select C.id,C.name as \"courseName\", C.credit, L.name as \"lecturerName\", "
				+ "C.week, C.start_hour,C.end_end "
				+ "from course_tbl C, lecturer_tbl L "
				+ "where C.lecturer = L.idx";
		
		try {
			Connection conn = getConnection();
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Course course = new Course();
				
				course.setId(rs.getString(1));
				course.setCourseName(rs.getString(2));
				course.setCredit(rs.getInt(3));
				course.setLecturerName(rs.getString(4));
				course.setWeek(rs.getInt(5));
				course.setStartHour(rs.getInt(6));
				course.setEnd(rs.getInt(7));
				
				list.add(course);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
	
	public List<Course> getLecturerList() {
		List<Course> list = new ArrayList<>();
		String sql = "select * from lecturer_tbl";
		
		try {
			Connection conn = getConnection();
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Course course = new Course();
				
				course.setIdx(rs.getInt(1));
				course.setLecturerName(rs.getString(2));
				course.setMajor(rs.getString(3));
				course.setField(rs.getString(4));
				
				list.add(course);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
	
	public String getLecturer(String lecturerName) {
		Course course = new Course();
		String sql = "select idx from lecturer_tbl where name=?";
		
		try {
			Connection conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, lecturerName);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				course.setLecturer(rs.getString(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return course.getLecturer();
	}
	
	public String getLecturerName(String lecturer) {
		Course course = new Course();
		String sql = "select name from lecturer_tbl where idx=?";
		
		try {
			Connection conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, lecturer);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				course.setLecturerName(rs.getString(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return course.getLecturerName();
	}
	
	
	public void insertCourse(Course course) {
		String sql = "insert into course_tbl "
				+ "values(?, ?, ?, ?, ?, ?, ?)";
		
		String lecturer = getLecturer(course.getLecturerName());
		
		
		try {
			Connection conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, course.getId());
			ps.setString(2, course.getCourseName());
			ps.setInt(3, course.getCredit());
			ps.setString(4, lecturer);
			ps.setInt(5, course.getWeek());
			ps.setInt(6, course.getStartHour());
			ps.setInt(7, course.getEnd());
			
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	public Course getCourse(String id) {
		Course course = new Course();
		String sql = "select * from course_tbl where id=?";
		
		try {
			Connection conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				course.setId(rs.getString(1));
				course.setCourseName(rs.getString(2));
				course.setCredit(rs.getInt(3));
				
				String lecturerName = getLecturerName(rs.getString(4));
				course.setLecturerName(lecturerName);
				course.setWeek(rs.getInt(5));
				course.setStartHour(rs.getInt(6));
				course.setEnd(rs.getInt(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return course;
	}
	
	public void updateCourse(Course course) {
		String sql = "update course_tbl set name=?, credit=?, "
				+ " lecturer=?, week=?, start_hour=?, end_end=? "
				+ "where id=?";
		
		String lecturer = getLecturer(course.getLecturerName());
		
		try {
			Connection conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, course.getCourseName());
			ps.setInt(2, course.getCredit());
			ps.setString(3, lecturer);
			ps.setInt(4, course.getWeek());
			ps.setInt(5, course.getStartHour());
			ps.setInt(6, course.getEnd());
			ps.setString(7, course.getId());
			
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	public void deleteCourse(String id) {
		String sql = "delete course_tbl where id=?";
		
		try {
			Connection conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	
}
