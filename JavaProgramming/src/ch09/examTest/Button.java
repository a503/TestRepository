package ch09.examTest;

public class Button {
	private OnClickListener listener;
	
	public void setOnClickListener(OnClickListener listener){
		this.listener = listener;
	}
	public void touch(){
		this.listener.onClick();
	}
	/*
	abstract class OnClickListener{
		abstract void onClick();
	}*/
	class OnClickListener{
		void onClick(){
			
		}
	}
}
