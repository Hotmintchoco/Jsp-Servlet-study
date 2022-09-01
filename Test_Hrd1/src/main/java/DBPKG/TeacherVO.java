package DBPKG;

/*
create table tbl_teacher_202201(
    teacher_seq number(4) not null,
    teacher_code char(3) not null primary key,
    class_name varchar2(12),
    teacher_name varchar2(12),
    class_price number(8),
    teacher_regist_date char(8)
); 
 */
public class TeacherVO {
	private int teacherSeq, price;
	private String teacherCode, className, teacherName, registDate;
	
	
	public int getTeacherSeq() {
		return teacherSeq;
	}
	public void setTeacherSeq(int teacherSeq) {
		this.teacherSeq = teacherSeq;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTeacherCode() {
		return teacherCode;
	}
	public void setTeacherCode(String teacherCode) {
		this.teacherCode = teacherCode;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getRegistDate() {
		return registDate;
	}
	public void setRegistDate(String registDate) {
		this.registDate = registDate;
	}
	
}
