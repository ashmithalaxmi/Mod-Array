import java.util.Scanner;

public class ModArray {
    public static int calculateMod(int n, int[] arr, int b){
        int power = 1, a = 0;
        for(int i=n-1;i>=0;i--){
            a += arr[i]*power;
            power *= 10;
        }
        return a%b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int b = scanner.nextInt();
        int result = calculateMod(n, arr, b);
        System.out.println(result);
    }
}
