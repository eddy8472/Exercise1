import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Hello ASE2015 - how are you? :)");
		String name = in.nextLine();
		HelloUser HelloU = new HelloUser(name);
		System.out.println("Hello " + HelloU.uName);
	}
}


