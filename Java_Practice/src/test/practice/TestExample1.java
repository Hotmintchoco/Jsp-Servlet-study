package test.practice;

public class TestExample1 {
	String name;
	int age;
	double height;
	double weight;
	char sex;
	String phone;
	String email;

	public static void main(String[] args) {
		TestExample1 te = new TestExample1();
		te.name = "김정민";
		te.age = 24;
		te.height = 181.37;
		te.weight = 68.425;
		te.sex = 'M';
		te.email = "abc@naver.com";
		
		te.example();
	}
	
	public void example() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(Math.round(height*10)/10.0);
		System.out.println(Math.round(weight*10)/10.0);
		System.out.println(sex);
		System.out.println(phone);
		System.out.println(email);
	}

}
