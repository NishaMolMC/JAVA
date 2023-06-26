import java.util.Scanner;
class Except
{
 public static void main(String args[]) throws ArithmeticException
 {
  Scanner input=new Scanner(System.in);
  System.out.println("enter the first number:");
  int x=input.nextInt();
  System.out.println("enter second number:");
  int y=input.nextInt();
  int z=x/(x-y);
  System.out.println("z :" +z);
  System.out.println("End bye");
}}
