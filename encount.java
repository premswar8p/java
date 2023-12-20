import java.io.*;
import java.util.*;
class encount
{
public static void main(String args[])
{
int num,p=0,n=0;
Scanner s=new Scanner(System.in);
while(true)
{
num=s.nextInt();
if(num==-1)
{
break;
}
if(num>0)
{
p++;
}
else
{
n++;
}
}
System.out.println("positive numbers="+p);
System.out.println("negative numbers="+n);
}
}

