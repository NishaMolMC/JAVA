import java.util.Scanner;
class Exception
{
 public static void main(String args[])
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter two Numbers:");
  int a= input.nextInt();
  int b= input.nextInt();
  try
  {
   int c=a/(a-b);
   System.out.println("c="+c);
  }
  catch(ArithmeticException e)
  {
   System.out.println("ArithmeticException----"+e);
  }
 }
}
