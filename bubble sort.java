import java.util.*;
class Test
{
static void bubbleSort(int a[],int n)
{
for(int i=n-1;i>=1;i--)
{
for(int j=0;j<=i-1;j++)

{
if(a[j]>a[j+1])
{
int t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
}
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
bubbleSort(a,n);
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
}
