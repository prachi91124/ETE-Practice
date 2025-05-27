// Find the max and min element in an array
public class q3 {
    public static void main(String[] args) {
        int [] arr = {19,28,293,823,93};

        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            mx = Math.max(mx, arr[i]);
            mn = Math.min(mn, arr[i]);
        }

        System.out.println(mx);
        System.out.println(mn);
    }
}