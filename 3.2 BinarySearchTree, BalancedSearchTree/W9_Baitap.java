import java.util.Scanner;

public class W9_Baitap {
    static int n, nQuery;
    static int[] firstChild;
    static int[] nextSibling;

    public static void add(int u, int v) {
        nextSibling[v] = firstChild[u];
        firstChild[u] = v;
    }

    public static int findParent(int u) {
        for(int i = 1; i <= n; i++) {
            int j = firstChild[i];
            while(j != 0) {
                if(j == u) return i;
                j = nextSibling[j];
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);        
        
        n = inp.nextInt();
        firstChild = new int[n + 1];
        nextSibling = new int[n + 1];
        
        for(int i = 1; i < n; i++) {
            int u = inp.nextInt();
            int v = inp.nextInt();
            add(u, v);
        }

        nQuery = inp.nextInt();
        for(int i = 1; i <= nQuery; i++) {
            int u = inp.nextInt();
            System.out.println(findParent(u));
        }
        inp.close();
    } 
}