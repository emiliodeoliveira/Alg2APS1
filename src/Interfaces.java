import java.util.Date;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Scanner;

public class Interfaces {

	public static String readString(String msg) {
		Scanner input = new Scanner(System.in);
		System.out.print(msg);
		return input.nextLine();
	}

	public static double readDouble(String msg) {
		Scanner input = new Scanner(System.in);
		System.out.print(msg);
		return input.nextDouble();
	}

	public static int readInteger(String msg) {
		Scanner input = new Scanner(System.in);
		System.out.print(msg);
		return input.nextInt();
	}

	public static String getDateTime() { 
		Date today = Calendar.getInstance().getTime();
		Format formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		String s = formatter.format(today);
		return s;
	}

}
