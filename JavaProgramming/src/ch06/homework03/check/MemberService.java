package ch06.homework03.check;

public class MemberService {
	private String id;
	private String password;
	
	
	
	public void setId(String id) {
		this.id = id;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public boolean login(String id, String password){
		if(id.equals("hong") && password.equals("12345")){
			setId(id);
			setPassword(password);
			return true;
		}else{
			return false;
		}
	}
	public void logout(String id){
		if(this.id.equals(id)){
			logoutMessage();
		}else{
			System.out.println("�α׾ƿ��� ���� �ʾҽ��ϴ�.");
		}
	}
	private void logoutMessage(){
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}
