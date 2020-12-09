import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] sorted = new InsertionSort().sort(new int[]{8, 1, 9, 6, 4});

        System.out.println(Arrays.toString(sorted));

        assert Arrays.toString(sorted).equalsIgnoreCase(Arrays.toString(new int[]{1, 4, 6, 8, 9}));
    }

    public int[] sort(int[] A) {
        for (int i = 1; i < A.length; i++) {
            // current number
            int curr = A[i];

            int j = i - 1;

            // As long as curr > j th number
            // shift it backwards
            while (j >= 0 && A[j] > curr) {
                A[j + 1] = A[j];
                j--;
            }

            // Finally place curr in the right place
            A[j + 1] = curr;
        }

        return A;
    }
}
