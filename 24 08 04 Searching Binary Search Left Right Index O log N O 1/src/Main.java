import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        for(int i = 0 ; i < n; i++){A[i] = sc.nextInt();}

        int B = sc.nextInt();

        int[] result = solve(A, B);

        System.out.print(result[0] + " " + result[1] );

        System.out.println();


    }
    public static int[] solve(int[] A, int B) {
        int[] result = new int[2];
        result[0] = leftIndex(A, B);
        result[1] = rightIndex(A, B);
        return result;
    }
    private static int leftIndex(int[] A, int B){
        int left = 0;
        int right = A.length - 1;
        int result = -1;

        while(left <= right){
            int mid = left + (right - left)/ 2;
            if(A[mid] == B){
                result = mid;
                right = mid - 1;

            }else if(A[mid] < B){left = mid + 1;}
            else{right = mid - 1;}
        }
        return result;
    }
    private static int rightIndex(int[] A, int B){
        int left = 0;
        int right = A.length - 1;
        int result = -1;

        while(left <= right){
            int mid = left + (right - left)/ 2;
            if(A[mid] == B){
                result = mid;
                left = mid + 1;

            }else if(A[mid] < B){left = mid + 1;}
            else{right = mid - 1;}
        }
        return result;
    }

}