package javabasicoops;

class Throw
{
	static void validate(int age) 
	{
		if(age<18)
			throw new ArithmeticException("not valid");
		else
			System.out.println("welcome to apply for driving license");
		
	}
}

public class ExceptionHandling {

		public static void main(String[] args) {
			
			validate(16);
			System.out.println("rest of the code");
			
			int x[]=new int[6];
			try {
				x[7]=10/1;
			}
			catch(ArithmeticException e){
				System.out.println("Exception code");
				
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Exception code where array index is out of boundary");
			}


		}

		private static void validate(int age) {
			
		}

	
}
