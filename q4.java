// You are given an array find sum of elts of array
public class q4 {
    public static void main(String[] args) {
        int [] ar = {2, 4, 8, 8,8,28};
        int sum = 0;

        for(int i = 0; i < ar.length; i++){
            sum += ar[i];
        }

        System.out.println(sum);
    }
}
