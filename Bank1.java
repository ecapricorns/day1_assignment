class Account{
	
	private long accNo;
	private String Name, Email;
	private float amount;
	
	
	// getter method
	
	public long getAccNo(long accNo){
		return accNo;
	}
	
	public void setAccNo(long accNo){
		this.accNo=accNo;
	}
	
	public String getName(){
		return Name;
	}
	
	public void setName(String Name){
		this.Name=Name;
	}
	
	
	public String getEmail(){
		return Email;
	}
	
	public void setEmail(String Email){
		this.Email=Email;
	}
	
	public float getamount(){
		return amount;
	}
	
	public void setAmt(float amount){
		this.amount=amount;
	}
	
	
}

public class Bank1{
	public static void main(String[] args){
		
		Account a1 = new Account();
		
		a1.setAccNo(123456789);
		a1.setAmt(451278);
		a1.setEmail("panchalshubham@gmail.com");
		a1.setName("Shubham");
		
		System.out.println(a1.getName());
	    System.out.println(a1.getEmail());
		System.out.println(a1.getAccNo());
		System.out.println(a1.getamount());
	}
}