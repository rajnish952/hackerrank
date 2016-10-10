import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.*;

public class Permutation_Array{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int q = sc.nextInt();
        
        
        for(int i=0;i<q;i++)
            {
            int flag=0;
            int val;
            int n =  sc.nextInt();
            int k = sc.nextInt();
            
            int [] a= new int[n];
            int [] b= new int[n];
            int [] rev=new int[n];
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
            }
            for(int l=0;l<n;l++){
                b[l]=sc.nextInt();
            }
            
            Arrays.sort(a);
            Arrays.sort(b);
            for(int m = 0; m < b.length / 2; m++)
                {
                    int temp = b[m];
                     b[m] = b[b.length - m - 1];
                     b[b.length - m - 1] = temp;
                }
            
            
             for(int o=0;o<n;o++){
            
            if(a[o]+b[o]<k)
                {
                flag=1;
                break;
                }
            }
        if(flag==1)
            System.out.println("NO");
        else
            System.out.println("YES");
            
        }
        
       
        
         
    }
}