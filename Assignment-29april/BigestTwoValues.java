package assignment3;

public class BigestTwoValues {
	public static void main(String[] args)
		{

			if(args.length!=2) {
				System.out.println(" Please Enter 2 Integer Values");
				return;
			}
			else {
				try {
					int number1=Integer.parseInt(args[0]);
					int number2=Integer.parseInt(args[1]);
					int big;
					
					if(number1>number2)
					{
						big=number1;
					}
					else {
						big=number2;
					}
					
					System.out.println("Largest Of Two Values:"+big);

					}
				catch(NumberFormatException e) {
					System.out.println("Enter Numbers Only");
				}
			}
		}
}