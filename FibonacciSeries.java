public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // The number of terms in the Fibonacci series

        int first = 0, second = 1; // First two numbers in the Fibonacci sequence

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Calculate the next term in the series
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
    }
}

