import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int a[][] = new int [n][n];
       for(int i =0;i<n;i++){
           for(int j =0;j<n;j++){
                a[i][j]=sc.nextInt();
           }
       }
       int sum1=0,sum2=0;
       for(int i =0;i<n;i++){
           for(int j =0;j<n;j++){
                if(i==j){                   //primary diagonal
                    sum1+=a[i][j];
                }
                if((i+j)==n-1){            //secondary diagonal
                    sum2+=a[i][j];
                }
           }
       }
       int m = Math.abs(sum1-sum2);
       System.out.println(m);
       
    }
}
