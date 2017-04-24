package homework.ch09.example._09;

public class Button {
	private OnClickListener onClickListener;
	
	void setOnClickListener(OnClickListener onClickListener){
		this.onClickListener = onClickListener;
	}
	
	void touch(){
		this.onClickListener.onClick();
	}
	
	
	interface OnClickListener{
		void onClick();
	}
}
