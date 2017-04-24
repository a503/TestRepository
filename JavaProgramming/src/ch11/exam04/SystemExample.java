package ch11.exam04;

public class SystemExample {
	public static void main(String[] args){
		System.setSecurityManager(new SecurityManager(){
			@Override
			public void checkExit(int status) { // System.exit(n)이 호출될때 이 메소드도 함께 호출된다. 이 checkExit가 정상적으로 실행되면 JVM종료
				if(status != 5555){
					throw new SecurityException(); // SecurityExcption 자바 기본제공 예외
				}
			}
			
		});
		
		// 가정
		for(int i = 0 ; i < 10 ; i++){
			System.out.println(i);
			if(i == 5){
				//System.exit(0/* 이 값을 바꿔 종료되지 않게 하고싶다.(외부인의 JVM종료 방지) -> 이 번호가 안들어가면 종료 안되게 // 비밀번호*/); // 그래서 exit가 번호를 매개값으로 받는다.
				//
				try{
				System.exit(5555); // System.exit(n) n의 의미를 알아보자.
				}catch(SecurityException e) {} // catch블록에 아무것도 입력하지 않으면 예외가 발생해도 무시하겠다는 뜻
			}
		}
	}
}
