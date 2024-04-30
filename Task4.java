import java.util.Scanner;
	public class Task4{
		public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
			int num = 1;
			for(int counter = number; counter >= 1; counter--){
				num *= counter;
			}
			System.out.print(num);

		}
	}