import java.io.*;
import java.util.*;
class atm
{
public static void main(String args[])
{
int a,b,c,d,e,w,ta;
Scanner s=new Scanner(System.in);
a=s.nextInt();
System.out.println("enter the amount total="+a);
b=s.nextInt();
System.out.println("enter the no.of 2000 notes="+b);
c=s.nextInt();
System.out.println("enter the no.of 500 notes="+c);
d=s.nextInt();
System.out.println("enter the no.of 200 notes="+d);
e=s.nextInt();
System.out.println("enter the no.of 100 notes="+e);
w=(2000*b)+(500*c)+(200*d)+(100*e);
System.out.println("The Withdrawal amount="+w);
ta=a-w;
System.out.println("The total available amount="+ta);
}
}
