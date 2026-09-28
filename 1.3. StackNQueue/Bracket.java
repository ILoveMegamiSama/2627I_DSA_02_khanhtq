import java.io.*;
import java.util.*;

public class Bracket {

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
}