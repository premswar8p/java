import java.io.*;
import java.util.*; 
class Myjava
{
public static void main(String[] args)
{ 
int i, j,n; 
Scanner a=new Scanner (System.in);
System.out.println("Enter the number of rows:");
n=a.nextInt(); 
for (i = 1; i <= n; i++)
{ for (j = 1; j <= n - i; j++) 
{ 
System.out.print(" "); 
} 
for (j = 1; j <= i; j++) 
{ 
System.out.print(i + " "); 
} 
System.out.println(); 
} 
}  
}
