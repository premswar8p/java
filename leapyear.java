import java.io.*;
import java.util.Scanner;
class Leap
{
public static void main(String args[])
{
int year;
Scanner s=new Scanner(System.in);
System.out.println("enter year");
year=s.nextInt();
if(year%4==0 && year%400==0)
{
System.out.println("leap year");
}
else
{
int x=year%4;
int y=4-x;
System.out.println("not a leap year"+y);
}
}
}