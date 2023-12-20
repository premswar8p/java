import java.util.*;
import java.io.*;
class bonus
{
int sa,sb,ba,bb,t1,t2,sal,sal1,t3,t4;
bonus(int a,int b)
{
sa=a;
sb=b;
}
void calculate()
{
ba=(sa+5)/100;
bb=(sb+10)/100;
}
void display()
{
t1=sa+ba;
System.out.println("A grade salary="+t1);
if(t1<10000)
{
sal=(t1+2)/100;
t3=t1+sal;
System.out.println("A grade extra bonus="+t3);
}
t2=sb+bb;
System.out.println("B grade salary="+t2);
if(t2<10000)
{
sal1=(t2+2)/100;
t4=t2+sal1;
System.out.println("B grade extra bonus="+t4);
}
}
}
class employee
{
public static void main(String args[])
{
bonus b=new bonus(10000,9500);
b.calculate();
b.display();
}
}

