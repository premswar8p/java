import java.util.*;
class palindrome
{  
public static void main(String args[])
{  
int z; 
Scanner s=new Scanner(System.in);
System.out.println("press 1 for number");
System.out.println("press 2 for String");
z=s.nextInt();
switch(z)
{
case 1:
int r,sum=0,temp,n;
System.out.println("Enter the number=");   
n=s.nextInt(); 
temp=n;    
while(n>0){    
r=n%10;   
sum=(sum*10)+r;    
n=n/10;    
}    
if(temp==sum)    
System.out.println("palindrome number ");    
else    
System.out.println("not palindrome");
break;   
case 2:
System.out.println("enter the String=");
String a=s.next();
StringBuilder temp1=new StringBuilder(a);
temp1.reverse();
System.out.println(temp1);
if(a.equals(temp1))
{
System.out.println("it is palindrome");
}
else
{
System.out.println("not palindrome");
}  
}
}  
}  
