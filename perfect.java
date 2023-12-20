import java.io.*;
import java.util.*;
class perfect
{
public static void main(String args[])
{
int n,sum=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int i=1;i<n;i++)
{
if(n%i==0)
{
sum+=i;
}
}
if(sum==n)
{
System.out.println("it is perfect");
}
else
{
System.out.println("It is not");
}
}
}

