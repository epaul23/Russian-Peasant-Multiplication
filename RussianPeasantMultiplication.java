public class RussianPeasantMultiplication {

    // ---------- Algorithm Logic ----------
    public static int russianMultiply(int n, int m) {
        int result = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                result += m;
            }
            n = n / 2;   // halve n
            m = m * 2;   // double m
        }

        return result;
    }

    

    // ---------- Explanation / Table Output ----------
    // Shows step-by-step work
    public static void printSteps(int n, int m) {

        System.out.printf("%-6s %-6s %-15s%n", "n", "m", "Action");
        System.out.println("--------------------------------");

        while (n > 0) {
            if (n % 2 == 1) {
                System.out.printf("%-6d %-6d %-15s%n", n, m, "add " + m);
            } else {
                System.out.printf("%-6d %-6d %-15s%n", n, m, "ignore");
            }

            n = n / 2;
            m = m * 2;
        }

        System.out.println("--------------------------------");
    }

    // ---------- Main ----------
    public static void main(String[] args) {

        int n = 50;
        int m = 65;

        // Show how the algorithm works
        printSteps(n, m);

        // Compute the result
        int result = russianMultiply(n, m);

        System.out.println("Result = " + result);
    }
}
