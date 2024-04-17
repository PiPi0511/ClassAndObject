package advance.dev;
import java.util.Scanner;

public class Student {
	private String name;
	private int age;
	private double dtb;
	private String Address;
	
	public Student(String name, int age, double dtb, String Address) {
		this.name = name;
		this.age = age;
		this.dtb = dtb;
		this.Address = Address;
	}
	
	public String toString() {
		return "name: "+name+"\nage: "+age+"\ndtb: "+dtb+"\nAddress: "+Address;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student("A", 20, 8, "TP Hue");
		System.out.println(student);
	}

}
