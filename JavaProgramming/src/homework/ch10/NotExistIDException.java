package homework.ch10;

public class NotExistIDException extends Exception{
	public NotExistIDException(){
		super();
	}
	public NotExistIDException(String message){
		super(message);
	}
}
