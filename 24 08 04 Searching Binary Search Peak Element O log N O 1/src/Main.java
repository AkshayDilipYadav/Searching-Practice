import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        for(int i = 0 ; i < n; i++){A[i] = sc.nextInt();}


        int result = solve(A);

        System.out.print(result);



    }
    public static int solve(int[] A) {
        int left = 0;
        int right = A.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(A[mid] < A[mid + 1]){left = mid + 1;}
            else{right = mid;}
        }
        return A[left];
    }

}