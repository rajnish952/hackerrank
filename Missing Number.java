import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int [] arr = new int[10001];
       
        for(int i=0;i<10001;i++){
            arr[i]=0;
          
        }
        
        int n = sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            arr[a[i]]--;
            
        }
        
        int m = sc.nextInt();
        int []b= new int[m];
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
            arr[b[i]]++;
        }
        
        for(int i=0;i<10001;i++){
            
            if(arr[i]>0)
                System.out.print(i+" ");
        }
        
   }
}