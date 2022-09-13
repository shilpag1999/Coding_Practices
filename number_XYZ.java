
    import java.util.Scanner;
    import java.lang.*;

public class HelloWorld {
  public static long countDigit(long n)
    {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;
    }
  public static long Mysum(int n,int[] arr)
    {
      long num=0,last=0,base=0,power;
      long sum=0,first,n1,power_count,cal;
      for(int i=0;i<n;i++)
      {
        n1=countDigit(arr[i]);
        num=arr[i] / 10;
        last=arr[i] % 10;
        power= num % (10 * last);
        power_count=countDigit(power);
        first=n1-power_count-1;
        long x = (long) Math.pow(10, first);
        base=arr[i];
        while(base >= x)
        {
           base /= 10;
        }
        cal=(long)Math.pow(base,power);
        System.out.println(cal);
        sum=sum + cal; 
      }
      return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("you entered:"+n);
        int[] array = new int[10];  
System.out.println("Enter the elements of the array: ");  
for(int i=0;i<n;i++)  
{  
//reading array elements from the user   
array[i]=sc.nextInt();  
}  
for (int i=0; i<n; i++)   
{  
System.out.println(array[i]);  
}  
long sum=Mysum(n,array);
System.out.println(sum);

    }
}
  
