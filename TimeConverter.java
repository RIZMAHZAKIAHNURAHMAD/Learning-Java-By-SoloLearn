import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {

		long days;

		Scanner in = new Scanner(System.in);

		days = in.nextLong();

		long seconds = days * 24 * 60 * 60;
    
		System.out.println(seconds);
	}
}
