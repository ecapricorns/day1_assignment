class Throw{
	public static void main(String[] args){
		
		int balance=5000;
		int withdrawlAmount=30000;
		if(balance<withdrawlAmount)
		throw new ArithmeticException("Insufficient Balance");
		
		balance=balance-withdrawlAmount;
		System.out.println("''Transaction Successfully...''");
		System.out.println("Program Continue...");
	}
}