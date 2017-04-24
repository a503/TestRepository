package homework.ch15._01;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		// 스택 클래스를 이용해 coin을 담는 객체생성
		Stack<Coin> coinBox = new Stack<>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()){
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
	}
}
