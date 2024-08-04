import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        for(int i = 0 ; i < n; i++){A[i] = sc.nextInt();}
        int B = sc.nextInt();

        int result = solve(A, B);

        System.out.print(result);



    }
    public static int solve(int[] A, int B) {
        int left = 0;
        int right = A.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(A[mid] == B){return mid;}
            if(A[left] <= A[mid]){
                if(A[left] <= B && B < A[mid]){right = mid -1;}
                else{left = mid + 1;}
            }else{
                if(A[mid] < B && B <= A[right]){left = mid +1;}
                else{right = mid -1;}
            }
        }
        return -1;
    }

}