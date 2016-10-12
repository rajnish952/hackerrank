import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long [] time = new  long[n];
        long [] temp = new  long[n];
        
        for(int i=0;i<n;i++){
            
            int t = sc.nextInt();
            int d = sc.nextInt();
            time[i] = t+d;
            
        }
        
        for(int i=0;i<n;i++){
            
            temp[i]=time[i];
        }
        
        Arrays.sort(temp);
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                
                if(temp[i]==time[j]){
                    
                    temp[i]=j+1;
                    time[j]=-1;
                    
                }
            }
        }
        
        for(int i=0;i<n;i++)
            System.out.print(temp[i]+" ");
        
    }
}