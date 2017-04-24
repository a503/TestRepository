package homework.ch09.example._06;

public class Button {
	//Interface타입의 필드, 외부에서 넘어온 객체를 가르키는 역할
	private OnClickListener onClickListener;
	
	//외부에서 setter 메소드를 호출해 객체를 넘겨준다.
	void setOnClickListener(OnClickListener onClickListener){
		this.onClickListener = onClickListener;
	}
	//객체를 확인해 onclick method 실행
	void touch(){
		if(this.onClickListener != null){
			onClickListener.onClick();
		}
	}
	// Nested Interface
	interface OnClickListener{
		void onClick();
	}
	
}
