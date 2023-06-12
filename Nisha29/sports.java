import java.util.Scanner;
class Student
{
 int rollno;
 String name;
 int mark;
 void get(int rl,String nm,int mrk)
 {
  rollno=rl;
  name=nm;
  mark=mrk;
 }
 class Sports
 {
  String sname;
  int actpoint;
  void getdetails(String sn,int ap)
  {
   sname=sn;
   actpoint=ap;
  }
  void display()
  {
  System.out.println("Rollno:" +rollno);
   System.out.println("Name:" +name);
   System.out.println("Mark:" +mark);
   System.out.println("Sports name:" +sname);
   System.out.println("Activity point:" +actpoint);
  }
 }
}
class Main
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter rollno:");
  int rollno = sc.nextInt();
  System.out.println("Enter name:");
  String name = sc.next();
  System.out.println("Enter mark:");
  int mark = sc.nextInt();
  System.out.println("Enter sports name:");
  String sname = sc.next();
  System.out.println("Enter activity point:");
  int actpoint = sc.nextInt();
  Student s1=new Student();
  Student.Sports sr1=s1.new Sports();
  s1.get(rollno,name,mark);
  sr1.getdetails(sname,actpoint);
  sr1.display();
 }
}

