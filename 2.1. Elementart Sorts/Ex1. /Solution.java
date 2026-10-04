import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdArrayIO;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Insertion;

public class Solution {
  public static void main(String[] args) {      
    In in = new In("../../algs4-data/4Kints.txt"); // tạo luồng đọc từ file 
    int[] tmp_a = in.readAllInts();  // đọc toàn bộ file vào mảng a
    Integer[] a = new Integer[tmp_a.length]; // tạo mảng Integer
    for (int i = 0; i < tmp_a.length; i++) {  
      a[i] = tmp_a[i]; // chuyển đổi từ int sang Integer
    }
    long start = System.currentTimeMillis();
    // xử lý dữ liệu trong mảng a
    Insertion.sort(a); // sắp xếp mảng a theo thứ tự tăng dần
    long end = System.currentTimeMillis();  // thời gian chạy bằng end - start
    for (int i = 0; i < tmp_a.length; i++) {
      tmp_a[i] = a[i]; // chuyển đổi từ Integer sang int
    }
    StdOut.println("Thoi gian chay: " + (end - start) + " milliseconds");
    StdArrayIO.print(tmp_a); // in mảng ra màn hình 
  }
}