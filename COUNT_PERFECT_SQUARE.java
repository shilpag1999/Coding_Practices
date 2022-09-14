/* Given size of array n and array[],return the count of array elements which is a perfect square*/
    import java.util.Scanner;
    import java.lang.*;

    public class HelloWorld {
    public static int PERFECT_SQUARE_COUNT(int[] arr,int n)
    {
      int count=0;
      
    for(int i=0;i<n;i++)
      {
       double sqrt=Math.sqrt(arr[i]);
       if((sqrt - Math.floor(sqrt)) == 0)
        { 
          count=count+1;}
        }
    return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[10];
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        int s=PERFECT_SQUARE_COUNT(arr,n);
        System.out.println("you entered:"+s);
        
  }
}
  
