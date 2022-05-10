
class Student1 implements Comparable{
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	Student1(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return (int)(Math.round(getTotal() / 3f)*10)/10f;
	}
	
	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + ","
				+ math + "," + getTotal() + "," + getAverage();
	}

	@Override
	public int compareTo(Object o) {
		return name.compareTo(((Student)o).name);
	}
}

public class Ex11_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
