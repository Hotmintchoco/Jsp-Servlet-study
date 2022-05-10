import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student{
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
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
}

class BanNoAscending implements Comparator {
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Student&& o2 instanceof Student) {
			Integer stuBan1 = ((Student)o1).ban; 
			Integer stuBan2 = ((Student)o2).ban;
			
			if (stuBan1 == stuBan2) {
				Integer stuNo1 = ((Student)o1).no;
				Integer stuNo2 = ((Student)o2).no;
				
				return stuNo1.compareTo(stuNo2);
			}
			return stuBan1.compareTo(stuBan2);
			
		}
		return -1;
	}
}

public class Ex11_3 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("이자바", 2, 1, 70, 90, 70));
		list.add(new Student("안자바", 2, 2, 60, 100, 80));
		list.add(new Student("홍길동", 1, 3, 100, 100, 100));
		list.add(new Student("남궁성", 1, 1, 90, 70, 80));
		list.add(new Student("김자바", 1, 2, 80, 80, 90));
		
		Collections.sort(list, new BanNoAscending());
		Iterator it = list.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
