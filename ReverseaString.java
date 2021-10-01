import java.util.Scanner;

public class ReverseaString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		
		char[] arr2 = new char[arr.length];
		for(int i = 0;i<arr.length;i++){
			arr2[(arr.length-1) - i] = arr[i];
		}

		System.out.println(arr2);
	}
}

