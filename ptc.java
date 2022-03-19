import java.util.*;
public class ptc
{
 public static int canWin(int n, int arr[]) 
    {
        // Write your code here.
        int a = arr[0];
        int count = 0;
        for(int i=1;i<n;i++)
        {
            if(a<arr[i])
            {
                a = arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==a)
                count++;
        }
        return count==1?1:0;
    }
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int j=0;j<T;j++)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
			System.out.println(canWin(n, arr));
        }
    }
}