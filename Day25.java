import java.io.*;
import java.util.*;

public class Solution {
    public static void checkPrime(int n){
        if(n == 1){
            System.out.println("Not prime");
            return;
        }
        int i;
        for( i = 2; i*i <= n; i++ ){
            if(n % i == 0){
                System.out.println("Not prime");
                return;
            }
        }
        if(i*i > n ){
            System.out.println("Prime");
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i < t; i++){
            int n = sc.nextInt();
            checkPrime(n);
        }
    }
}
