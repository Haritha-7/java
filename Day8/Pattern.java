//print the pattern

public class Pattern
{
public static void main(String args[])
{
int n=8;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
System.out.print(j);
for(int k=1;k<=n-i;k++)
System.out.print("*");
System.out.println();
}
}
}
