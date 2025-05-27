// Declare 2 strings and concatenate them and display concatenated string. Also, display length of string
import java.util.*;
public class q1{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        sc.close();

        String s3 = s1 + s2;

        System.out.println(s3);
        System.out.println(s3.length());
    }
}