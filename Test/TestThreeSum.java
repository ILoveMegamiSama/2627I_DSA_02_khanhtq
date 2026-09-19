import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;
import edu.princeton.cs.algs4.ThreeSum;

public class TestThreeSum {
    public static void main(String[] args) {
        if (args.length < 1) {
            StdOut.println("Vui long truyen duong dan file du lieu.");
            return;
        }

        In in = new In(args[0]);
        int[] a = in.readAllInts();

        Stopwatch timer = new Stopwatch();
        int count = ThreeSum.count(a);
        double time = timer.elapsedTime();

        StdOut.println("So bộ ba co tong = 0: " + count);
        StdOut.println("Thoi gian tinh toan: " + time + " giây");
    }
}