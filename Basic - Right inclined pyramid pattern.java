import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//Refer ------->  https://www.youtube.com/watch?v=IbP083i25EI


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=n-i; j>=1; j--)
            {
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
