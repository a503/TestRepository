package ch07.exam07.homework07_1._1;

public class DmbCellPhone extends CellPhone {
	//Field
	int channel;
	
	//Constructor
	DmbCellPhone(String model, String color, int channel){
		this.model = model; // 부모(CellPhone)로부터 상속받은 필드
		this.color = color; // 부모(CellPhone)로부터 상속받은 필드
		this.channel = channel; // 자신의 필드
	}
	//Method
	void turnOnDmb(){
		System.out.println("채널 " + this.channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel){
		this.channel = channel;
		System.out.println("채널 " + this.channel + "번으로 바꿉니다.");
	}
	void turnOffDmb(){
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
