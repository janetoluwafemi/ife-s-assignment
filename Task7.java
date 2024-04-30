public class Task7{
	public static void main(String[] args){
		int[] number = {1, 2, 3, 4, 5};
		int sum = 0;
		for(int counter = 0; counter < number.length; counter++){
			sum += number[counter];
		}
		System.out.print("The sum is: " + sum);
	}

}
			