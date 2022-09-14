/*given size of array n and the elements return the 

    import java.util.Scanner;
    import java.lang.*;
    import java.util.*;

    public class HelloWorld {
    public static int[] Corresponding_index(int[] arr,int n)
    {
      int[] sorted=new int[n];
      int[] index=new int[n];
      for(int i=0;i<n;i++)
      {
      sorted[i]=arr[i];
      }
      Arrays.sort(sorted);
      for(int i=0;i<n;i++)
      {
        int k=0;
        while(k<n)
        {
        if(sorted[i] == arr[k])
        {
          index[i]=k;
        }
        k=k+1;
        }
      }
      return index;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[10];
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        int[] s=Corresponding_index(arr,n);
        for(int i=0;i<n;i++)
        System.out.println("you entered:"+s[i]);
        
  }
}
  
