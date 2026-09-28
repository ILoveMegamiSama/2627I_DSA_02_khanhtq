import java.io.*;

public class Solution {
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0;
        private int buflen = 0;

        private int read() {
            if (ptr >= buflen) {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    return -1;
                }
                if (buflen <= 0) return -1;
            }
            return buffer[ptr++];
        }

        public int nextInt() {
            int c = read();
            while (c <= ' ') {
                if (c == -1) return -1;
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            while (c >= '0' && c <= '9') {
                res = res * 10 + c - '0';
                c = read();
            }
            return res * sgn;
        }
    }

    public static void maimport java.io.*;
import java.util.*;

public class Queue {

    public static String isBalanced(String s) {
        int n = s.length();
        if ((n & 1) != 0) return "NO";

        char[] stack = new char[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack[++top] = c;
            } else {
                if (top == -1) return "NO";
                char open = stack[top--];
                if ((c == ')' && open != '(') ||
                    (c == '}' && open != '{') ||
                    (c == ']' && open != '[')) {
                    return "NO";
                }
            }
        }

        return top == -1 ? "YES" : "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        if (line == null) return;

        int n = Integer.parseInt(line.trim());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String s = reader.readLine();
            if (s != null) {
                sb.append(isBalanced(s.trim())).append("\n");
            }
        }

        System.out.print(sb);
    }
}in(String[] args) {
        FastScanner sc = new FastScanner();
        int q = sc.nextInt();
        if (q <= 0) return;

        int[] stackIn = new int[q + 5];
        int[] stackOut = new int[q + 5];
        int topIn = -1;
        int topOut = -1;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            if (type == 1) {
                int x = sc.nextInt();
                stackIn[++topIn] = x;
            } else if (type == 2) {
                if (topOut == -1) {
                    while (topIn >= 0) {
                        stackOut[++topOut] = stackIn[topIn--];
                    }
                }
                if (topOut >= 0) {
                    topOut--;
                }
            } else if (type == 3) {
                if (topOut == -1) {
                    while (topIn >= 0) {
                        stackOut[++topOut] = stackIn[topIn--];
                    }
                }
                if (topOut >= 0) {
                    sb.append(stackOut[topOut]).append('\n');
                }
            }
        }

        System.out.print(sb);
    }
}