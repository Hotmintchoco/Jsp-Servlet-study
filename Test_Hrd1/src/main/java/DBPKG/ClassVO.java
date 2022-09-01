package DBPKG;

/*
create table tbl_class_202201 (
    class_seq number(4) not null,
    regist_month char(8) not null,
    c_no char(5) not null,
    class_area varchar2(15),
    tution number(8),
    teacher_code char(3),
    constraint pk_class_seq primary key(class_seq, regist_month)
); 
*/

public class ClassVO {
	private int classSeq, tution;
	private String registMonth, cNo, classArea, teacherCode;
	
	
	public int getClassSeq() {
		return classSeq;
	}
	public void setClassSeq(int classSeq) {
		this.classSeq = classSeq;
	}
	public int getTution() {
		return tution;
	}
	public void setTution(int tution) {
		this.tution = tution;
	}
	public String getRegistMonth() {
		return registMonth;
	}
	public void setRegistMonth(String registMonth) {
		this.registMonth = registMonth;
	}
	public String getcNo() {
		return cNo;
	}
	public void setcNo(String cNo) {
		this.cNo = cNo;
	}
	public String getClassArea() {
		return classArea;
	}
	public void setClassArea(String classArea) {
		this.classArea = classArea;
	}
	public String getTeacherCode() {
		return teacherCode;
	}
	public void setTeacherCode(String teacherCode) {
		this.teacherCode = teacherCode;
	}
	
}
