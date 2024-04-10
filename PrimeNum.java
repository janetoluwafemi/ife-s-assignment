import java.util.Scanner;
public class PrimeNum{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter a number: ");
int number = scanner.nextInt();

	boolean prime = false;
	int count = 0;
	for(int counter = 1; counter <= number; counter++){
	
		if(number % counter == 0){
			count++;
		}

	}
		if(count == 2){prime = true;}
			System.out.print(prime);


}

}
			

	