import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int temp = n;
        int c = 0,mul=1;
        int max=0;
        int result =0;
        while(n!=0){
            int rem = n%2;
            if(rem==1)c++;
            else c=0;
            max = Math.max(c, max);
            result += (mul*rem);
            mul *=10;
            n /=2;
        }

        
        System.out.println(max);
        scanner.close();
    }
}
