package ch09.exam08;

public class Button {
	

	// Field
	private OnClickListener onClickListener;
	
	// Constructor
	// Method
	public void setOnClickListener(OnClickListener onClickListener) { // 여기에 들어온 객체에 따라 onClick의 내용이 달라진다.
		this.onClickListener = onClickListener;
	}
	public void touch(){
		if(onClickListener != null){
			onClickListener.onClick();
		}
	}
	
	// Nested interface
	// Button을 떠나서는 의미없다, button과 밀접한 관계
	interface OnClickListener{
		void onClick(); // 버튼을 클릭했을때 OnClickListner가 onClick실행
	}
	
}
