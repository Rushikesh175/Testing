
public class Student {
	
	private String name;
	private int age;
	private String school;
	
	public Student(String name, int age, String school) {
		this.name = name;
		this.age = age;
		this.school = school;
	}
	
	public void displayDetails() {
		System.out.printf("%s is %d years old and is stydunig in %s school.", name, age, school);
	}
	
	public static void main(String[] args) {
		Student st1 = new Student("Sreekar", 13, "TIME");
		st1.displayDetails();
	}

}
