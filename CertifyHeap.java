import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class CertifyHeap {
    // Return true of v is less than w and false otherwise.
    private static boolean less(Comparable v, Comparable w) {
        return (v.compareTo(w) < 0);
    }

    // Return true if a[] represents a maximum-ordered heap and false 
    // otherwise. Remember to index from 1.
    private static boolean maxOrderedHeap(Comparable[] a) {
        int N = a.length;
        
        for (int i = 1; i <= N/2; i++) {
            int left = 2 * i;
            int right = 2 * i + 1;
            if (left < N && less(a[i], a[left]) 
                || right < N && less(a[i], a[right])) {
                    return false;
            }
        }
        return true;
    }

    // Test client. [DO NOT EDIT]
    public static void main(String[] args) {
        String[] a = StdIn.readAllStrings();
        StdOut.println(maxOrderedHeap(a));
    }
}
