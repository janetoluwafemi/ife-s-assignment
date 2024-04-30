import java.util.Arrays;
	public static String array1(int[] number){
		int counter = 0;
		String max = "";
		int[] maximum = new int[1];
		int count = 0;
		for(; counter < number.length; counter++){
			if(number[counter] > maximum[count]){
				maximum[count] = number[counter];
			}
		}
		max = Arrays.toString(maximum);
		return max;
	}

}