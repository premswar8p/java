import java.io.*;
import java.util.*;
class split
{
public static void main(String args[])
{
int i,u=0,l=0,n=0,sp=0;
Scanner s=new Scanner(System.in);
String a=s.next();
for(i=0;i<a.length();i++)
{
char ch=a.charAt(i);
if(ch=='*')
{
break;
}
if(ch >= 'A' && ch <='Z')
u++;
else if(ch >= 'a' && ch <='z')
l++;
else if(ch >= '0' && ch <='9')
n++;
else
sp++;
}
System.out.println("Upper case="+u);
System.out.println("Lower case="+l);
System.out.println("Numbers="+n);
System.out.println("Special characters="+sp);
}
}
