import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t>0){
            
            int n = sc.nextInt();
            int arr[]= new int [n];
            long left=0;
            long right=0;
            int flag=0;
            for(int i=0;i<n;i++){
                
                arr[i]=sc.nextInt();
            }
            
            if(arr.length==1)
                flag=1;
            else
                {
                for(int i=0;i<n;i++)
                    right+=arr[i];
            
                    right-=arr[0];
                    for(int i=1;i<n;i++){
                      left+=arr[i-1];
                      right-=arr[i];
                
                    if(right==left)
                    {
                        flag=1;
                        break;
                    }
                }
            }
            
            
            if(flag==1)
                System.out.println("YES");
            else
                System.out.println("NO");
            
            t--;
        }
        
        
    }
}