import java.util.Scanner;
public class pattern2
 {
public static void main(String[] args) 
{
Scanner input=new Scanner(System.in);
int n=input.nextInt();
for(int i=1;i<=n;i++)
{
 for(int j=1;j<=i;j++)
 {
 System.out.print(i);
 }
 System.out.println();
}
for(int i=n-1;i>=1;i--)
{
 for(int j=1;j<=i;j++)
 {
 System.out.print(i);
 }
 System.out.println();
}
}
}