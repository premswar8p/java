import java.io.*;
import java.util.*;
class Simple
{
public static void main(String args[])
{
int p,t,r;
Scanner s=new Scanner(System.in);
System.out.println("enter p,tandr values");
p=s.nextInt();
t=s.nextInt();
r=s.nextInt();
int S=p*t*r/100;
System.out.println("simple interest is:"+S);
}
}