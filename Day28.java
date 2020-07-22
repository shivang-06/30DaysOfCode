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

        String ext = "@gmail.com";
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        ArrayList <String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            if( emailID.contains(ext)){
                list.add(firstName);
            }

        }
        Collections.sort(list);
        for(String firstName : list){
            System.out.println(firstName);
        }
        scanner.close();

    }
}
