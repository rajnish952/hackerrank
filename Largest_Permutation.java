import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Largest_Permutation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int [] arr = new int[n];
        
        for(int i=0;i<n;i++){
            
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            int j;
            if(arr[i]!=n-i&&k!=0)
               {
                    j=i+1;
                  while(arr[j]!=n-i)
                    j++;
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    k--;

            }
        }
        
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        
        
    }
}
