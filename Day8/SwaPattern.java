//print the swastika pattern
public class SwaPattern
{
public static void main(String args[])
{
int n=7;
for(int i=1;i<=1;i++)
System.out.print("* ");
for(int j=1;j<=n/2-1;j++)
System.out.print("  ");
System.out.print("* ");
for(int k=1;k<=n/2;k++)
System.out.print("* ");
System.out.println();
for(int i=1;i<=n/2-1;i++)
{
for(int j=1;j<=1;j++)
System.out.print("* ");
for(int j=1;j<=n/2-1;j++)
System.out.print("  ");
System.out.print("* ");
System.out.println();
}
for(int i=1;i<=n;i++)
System.out.print("* ");
System.out.println();
for(int k=1;k<=n/2-1;k++)
{
for(int i=1;i<=n/2;i++)
System.out.print("  ");
System.out.print("* ");
for(int j=1;j<=n/2-1;j++)
System.out.print("  ");
System.out.print("* ");
System.out.println();
}
for(int i=1;i<=n/2;i++)
System.out.print("* ");
System.out.print("* ");
for(int j=1;j<=n/2-1;j++)
System.out.print("  ");
System.out.print("* ");
}
}
