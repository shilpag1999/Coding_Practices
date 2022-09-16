/*find sum of all digits until you get single digit ex:346 is input 3+4+6=13, again 1+3=4,sum until you will get single digit*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=0,sum=0;
      while(count != 1)
      {
       while(n != 0)
      {
        sum= sum+(n % 10);
        n=n/10;
        count=count + 1;
      }
      if(count>1)
      {
      n=sum;
      count=0;
      sum=0;
      }
      }
      System.out.println(sum);
  }
    }
