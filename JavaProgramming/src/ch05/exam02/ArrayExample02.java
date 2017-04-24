package ch05.exam02;

public class ArrayExample02 {
	public static void main(String[] args){
		int[] v1 = {10, 20, 30};
		
		//int[] v2;
		//v2 = {10, 20, 30}; // complier는 배열을 선언할때 배열의 길이를 참조하는데, 이런 경우 컴파일러가 배열의 길이를 알 수 없다.
		// 문법으로 받아들이자. 
		
		int[] v2;
		v2 = new int[] {10, 20, 30}; // 새로운 배열객체를 만들어 항목을 준다.
		
		// v1 배열의 번지를 sum 메소드로 전달
		int result1 = sum(v1);
		// v2 배열의 번지를 sum 메소드로 전달
		int result2 = sum(v2);
		
		//sum({10, 20, 30}); // sum 메소드에 변수가 선언되어있으므로 나중에 목록을 대입할때는 new 가 필요하다.
		int result3 = sum(new int[] {10, 20, 30});
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
	public static int sum(int[] args){
		int sum = 0;
		//int sum; 초기화 하지 않으므로 아직 변수가 생성되지 않았다. 그러므로 에러가 발생(선언되지 않은 변수에 값을 저장할려고 하므로)
		for(int i=0 ; i<args.length ; i++){
			sum += args[i];
			// sum = sum + args[i]; 같은 뜻, 속도 차이는 컴파일러마다 차이가 있다.
		}
		return sum;
	}
}
