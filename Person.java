package advance.dev;

public class Person {
	String name;
	int age;
	double dtb;
	String Address;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		if(age < 0) age = 1;
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void setDtb(double dtb) {
		this.dtb = dtb;
	}
	public double getDtb() {
		return this.dtb = dtb;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public String getAddress() {
		return this.Address = Address;
	}
    public static void main(String[] args) {
    	
    }
}
