import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;


class Person2 implements Comparable<Person2>{
	String name;
	int age;
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " : " + age;
	}

	@Override
	public int compareTo(Person2 o) {		return this.age - o.age;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person2 p = (Person2)obj;
		
		return this.name.equals(p.name) && this.age == p.age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
}

class PersonComp implements Comparator<Person2> {

	@Override
	public int compare(Person2 o1, Person2 o2) {
		return (o1.name + o1.age).compareTo(o2.name + o2.age);
	}
	
}

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Person2> tree = new TreeSet<>(new PersonComp());
//								  기존의 () -> (new PersonComp()) 추가
		tree.add(new Person2("kim", 20));
		tree.add(new Person2("park", 50));
		tree.add(new Person2("Lee", 80));
		tree.add(new Person2("Lee", 80));
		tree.add(new Person2("kim", 80));
		tree.add(new Person2("kim", 29));
		
		for (Person2 n : tree) 
			System.out.println(n);
	}

}
