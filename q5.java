// Find the Sum of Elements of an Array between 2 given indices
public class q5 {
   public static void main(String[] args) {
    int ar[] = {34,2,82,91,9,19,10};

    int i1 = 2;
    int i2 = 5;

    int sum = 0;
    for(int i = i1; i <=i2; i++){
        sum += ar[i];
    }

    System.out.println(sum);
   } 
}
