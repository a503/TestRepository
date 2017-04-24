package homework.ch09.example._06;

public class Button {
	//InterfaceŸ���� �ʵ�, �ܺο��� �Ѿ�� ��ü�� ����Ű�� ����
	private OnClickListener onClickListener;
	
	//�ܺο��� setter �޼ҵ带 ȣ���� ��ü�� �Ѱ��ش�.
	void setOnClickListener(OnClickListener onClickListener){
		this.onClickListener = onClickListener;
	}
	//��ü�� Ȯ���� onclick method ����
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
