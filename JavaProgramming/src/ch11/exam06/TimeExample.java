package ch11.exam06;

public class TimeExample {

	public static void main(String[] args) {
		int sum = 0;
		
		//for문이 동작하는 시간을 알고싶을때
		//시작전에 시간 측정하고 끝날때 시간과 비교하여 동작시간 산출
		//long startTime = System.currentTimeMillis(); // 1000분의 1초 -> 워낙 빨라서 측정안된다(10000번기준) (출력값 곱하기 0.001)
		long startTime = System.nanoTime(); // 10-9승
		for(int i = 0 ; i < 99910000 ; i ++){
			sum += i;
		}
		long endTime = System.nanoTime();
		
		System.out.println(endTime - startTime);
		
		
	}

}
