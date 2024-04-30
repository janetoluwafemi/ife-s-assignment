public class Task2{
	public static void main(String[] args){
		int[] array = {4,2,9,7};
			int maximum = 0;
			int minimum = 0;
			int counter = 0;
			maximum = array[counter];
			minimum = array[counter];
		for(; counter < array.length; counter++){
			if(array[counter] > maximum){
				maximum = array[counter];
			}
			if(array[counter] < minimum){
				minimum = array[counter];
			}
		}
		System.out.println(maximum);
		System.out.println(minimum);
	}
}