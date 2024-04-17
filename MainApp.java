package advance.dev;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		p.name = "A";
        p.age = 20;
        p.dtb = 8;
        p.Address = "TP Hue";
        System.out.println(p.name+"\n"+p.age+"\n"+p.dtb+"\n"+p.Address);
	}

}
