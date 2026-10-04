import java.util.Scanner;

public class W4_25020220 {
    public static void swap(int a[], int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.nextLine();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = inp.nextInt();
        }
        inp.close();
        
        //Insertion sort
        for(int i = 0; i < n; i++) {
            for(int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    swap(a, j, j - 1);
                }
            }
        }

        //Calc
        int ans = 0;
        // for(int i = n - 1; i >= 0; i--) {
        //     System.out.print(a[i] + " ");
        // }
        for(int i = n - 1; i >= 0; i--) {
            ans++;
            if(a[i] < ans) {
                ans--;
                break;
            }
        }
        System.out.println(ans);
    }
}