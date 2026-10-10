import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'quickSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> quickSort(List<Integer> arr) {
    // Write your code here
        int pivot = arr.get(0);
        int sz = arr.size();
        int[] res = new int[sz];
        int l = 0, r = sz - 1;
        for (int i = 0; i < sz; i++) {
            res[i] = pivot;
        }
        for (int i = 0; i < sz; i++) {
            if(arr.get(i) < pivot) {
                res[l++] = arr.get(i);
            } else if(arr.get(i) > pivot) {
                res[r--] = arr.get(i);
            }
        }
        
        List<Integer> resList = new ArrayList<>();
        for (int i = 0; i < sz; i++) {
            resList.add(res[i]);
        }
        return resList;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.quickSort(arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
