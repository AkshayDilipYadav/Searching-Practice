import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int A = sc.nextInt();

        int result = solve(A);

        System.out.print(result);

    }
    public static int solve(int A) {
        if(A == 0 || A == 1){return A;}

        int left = 1;
        int right = A;
        int result = 0;
        while(left <= right){
            int mid = left + (right - left) / 2;
            long midSquared = (long) mid * mid;

            if(midSquared == A){return mid;}
            else if(midSquared < A){
                left = mid + 1;
                result = mid;
            }
            else{right = mid -1;}
        }
        return result;
    }

}