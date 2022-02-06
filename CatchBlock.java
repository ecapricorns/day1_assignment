public class CatchBlock{

	public static void main(String [] args){

		try{
			
			
			System.out.println("I am in try11 ");
			int [] a = new int[5];
			
			for(int i = 0; i<8;i++){
				
				System.out.println("This is array:" + a[i]);
			}
			
		System.out.println("Result:"+30/0);
		System.out.println("I am in try ");
			
		}

		catch (ArithmeticException e){

			System.out.println("ArithmeticException occure" );
		}
		
		catch (ArrayIndexOutOfBoundsException e){

			System.out.println("IndexOutOfBoundsException occure");
		}


		


		System.out.println("at last line");
	}
}