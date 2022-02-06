class CatchOur{
	public static void main(String[] args){
		
		int balance=5000;
		int withdrawlAmount=300;
		
		try{
			if(balance<withdrawlAmount)
		throw new ArithmeticException("Insufficient Balance");
		
		balance=balance-withdrawlAmount;
		System.out.println("''Transaction Successfully...''");
		} catch (ArithmeticException e){

			System.out.println("Exception:" +e.getMessage());
		} 
		System.out.println("Amount debited from your Bank is :"+withdrawlAmount);
		
		System.out.println("New balance:"+ balance);
		System.out.println("Program Continue...");
	}
}