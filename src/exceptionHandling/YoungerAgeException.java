package exceptionHandling;

public class YoungerAgeException extends RuntimeException{

	public YoungerAgeException(String msg) {
		super(msg);
	}
}
