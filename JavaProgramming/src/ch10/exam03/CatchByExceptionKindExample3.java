package ch10.exam03;

public class CatchByExceptionKindExample3 {

	public static void main(String[] args) {
		try{
			String str = null;
			str="ab";
			System.out.println(str.length());
			
			int[] scores = {90, 85};
			for(int i = 0 ; i<2 ; i++){
				System.out.println(scores[i]);
			}
			String strNum = "a";
			int num = Integer.parseInt(strNum);
		}catch(NumberFormatException e){
			System.out.println("抗寇贸府 内靛 1"); 
		}catch(Exception e){
			System.out.println("抗寇贸府 内靛 2");
		}
	}

}
