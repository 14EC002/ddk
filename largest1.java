import java.io.*;
import java.util.*;
class largest{
public static void main(String args[])
{ 
int a ,b,c;
Scanner in=new Scanner(System.in);
a=in.nextInt();
Scanner s=new Scanner(System.in);
b=s.nextInt();
Scanner d=new Scanner(System.in);
c =s.nextInt();
if((a>b)&&(a>c))
{
System.out.println(a+"greatest");
}
else if((b>c)&&(b>a))
{
System.out.println(b+"greatest");
}
else
{
System.out.println(c+"greatest");
}}}
