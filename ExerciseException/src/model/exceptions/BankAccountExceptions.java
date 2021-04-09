package model.exceptions;

public class BankAccountExceptions extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public BankAccountExceptions (String msg) {
		super(msg);
	}

}
