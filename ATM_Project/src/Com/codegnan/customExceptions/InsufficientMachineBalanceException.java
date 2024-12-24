package Com.codegnan.customExceptions;

public class InsufficientMachineBalanceException extends Exception{
	
	public InsufficientMachineBalanceException(String errorMsg) {
		super(errorMsg);
		
	}

}
