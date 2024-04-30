public class Task8{
	public static void main(String[] args){
		int[] number = {1, 2, 9, 6, 5, 8};
		int minimum = 0;
		int min = 0;
		int counter = 0;
		minimum = number[counter];
		min = number[counter];
		for(; counter < number.length; counter++){
			if(number[counter] < min){
				min = number[counter];
			}
			if(number[counter] < minimum && minimum > min){
				minimum = number[counter];
			}
		}
	System.out.print("The second minimum number is: " + min);
	}
}