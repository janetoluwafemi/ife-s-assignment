import java.util.Scanner;
	public class Practice{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
		int total = 0;
	for(int counter = 1; counter <= 10; counter++){
	
		System.out.print("Enter ten numbers: ");
		int number = scanner.nextInt();

	if(number % 2 == 0){
		total += counter;
		System.out.println(counter + " ");
		}
	}

	System.out.print("total is: " + total);

}

}

		