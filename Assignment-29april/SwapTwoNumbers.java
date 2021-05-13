package assignment3;

public class SwapTwoNumbers {
	public static void main(String[] args) {
        try
        {
            int input1 = Integer.parseInt(args[0]);
            int input2 = Integer.parseInt(args[1]);
            int temp;
            //Swap logic
            temp = input1;
            input1 = input2;
            input2 = temp;
            System.out.println(input1 + " " + input2);
        }
        catch (NumberFormatException e) {
            System.out.println("Error");
        }
    }

}
