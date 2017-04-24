package ch09.exam08;

public class Button {
	

	// Field
	private OnClickListener onClickListener;
	
	// Constructor
	// Method
	public void setOnClickListener(OnClickListener onClickListener) { // ���⿡ ���� ��ü�� ���� onClick�� ������ �޶�����.
		this.onClickListener = onClickListener;
	}
	public void touch(){
		if(onClickListener != null){
			onClickListener.onClick();
		}
	}
	
	// Nested interface
	// Button�� �������� �ǹ̾���, button�� ������ ����
	interface OnClickListener{
		void onClick(); // ��ư�� Ŭ�������� OnClickListner�� onClick����
	}
	
}
