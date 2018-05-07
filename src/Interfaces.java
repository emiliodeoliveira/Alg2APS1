import java.util.Scanner;

public class Interfaces {
	
	public static String readString(String msg) {
		Scanner input = new Scanner(System.in);
		System.out.println(msg);
		return input.nextLine();
	}
	
	public static double readDouble(String msg) {
		Scanner input = new Scanner(System.in);
		System.out.println(msg);
		return input.nextDouble();
	}
	
	public static int readInteger(String msg) {
		Scanner input = new Scanner(System.in);
		System.out.println(msg);
		return input.nextInt();
	}

}
