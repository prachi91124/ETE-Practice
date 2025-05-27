import java.util.*;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        List <String> li = new ArrayList<>();

        for(int i = 0; i < t; i++){
            String s = sc.next();
            li.add(s);
        }

        int mxl = Integer.MIN_VALUE;
        for(String s : li){
            int l = s.length();
            mxl = Math.max(mxl,l);
        }

        for(String s: li){
            if(s.length() == mxl){
                System.out.println(s);
                break;
            }
        }
    }    
}
