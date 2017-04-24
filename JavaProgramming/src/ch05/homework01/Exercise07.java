package ch05.homework01;

public class Exercise07 {

	public static void main(String[] args) {
		int max = 0;
		//int[] array = { 1, 5, 3, 8, 2};
		//int[] array = { 8, 1, 2, 3, 4};
		//int[] array = { 1, 2, 3, 4, 5};
		int[] array = { 5, 4, 3, 2, 1};
		
		/* *********************************** */
		for(int i = 0 ; i < array.length ; i++){
			if(max <= array[i]){
				max = array[i];
			}
		}
		/* *********************************** */
		
		System.out.println("max : " + max);

	}

}
