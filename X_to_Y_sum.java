/*given range of integers x and y, find value z which same as maximum digit in an integer and find the sum of all the values subtract from z*/

import java.util.Scanner;
    import java.lang.*;

    public class range {
    public static int maximum(int n)
    {
      int largest=0;
       while(n != 0)
       {
        int r = n % 10;
        largest = Math.max(r, largest);
        n = n / 10;
       }
       return largest;
    }
    public static int find_sum(int num)
    {
      int sum=0;
    while (num != 0) 
       {
            sum = sum + (num % 10);
            num = num / 10;
        }
    return sum;
    }
       
    public static int SUM(int x,int y)
    {
     int lar=0,sum=0,total_count=0,golden=0,temp=0,new_sum=0,num;
     
    for(int i=x;i<=y;i++)
      {
       num=i;
       lar=maximum(num);
       sum=find_sum(num);
       temp=sum-lar;
       if(temp==lar)
       {
        golden=i;
       }
       total_count=i + total_count;
    }
    new_sum= total_count - golden;
    return new_sum;
  }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int s=SUM(x,y);
        System.out.println("you entered:"+s);
        
  }
}
  
