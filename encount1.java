import java.io.*;
import java.util.*;
class encount1
{
public static void main(String args[])
{
int u=0,l=0,n=0;
Scanner s=new Scanner(System.in);
while(true)
{
char a=s.next().charAt(0);
if(a=='*')
{
break;
}
if(a>='a' && a<='z')
{
l++;
}
else if(a>='A' && a<='Z')
{
u++;
}
else
{
n++;
}
}
System.out.println("upper case="+u);
System.out.println("negative numbers="+n);
System.out.println("lower case="+l);
}
}

