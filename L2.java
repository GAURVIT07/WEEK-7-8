//QUESTION 1
// import java.util.Scanner;

// public class FactorsCalculator {

//     public static int[] findFactors(int number) {
//         int count = 0;

//         for (int i = 1; i <= number; i++) {
//             if (number % i == 0) {
//                 count++;
//             }
//         }

//         int[] factors = new int[count];
//         int index = 0;

//         for (int i = 1; i <= number; i++) {
//             if (number % i == 0) {
//                 factors[index] = i;
//                 index++;
//             }
//         }

//         return factors;
//     }

//     public static int calculateSum(int[] factors) {
//         int sum = 0;
//         for (int factor : factors) {
//             sum += factor;
//         }
//         return sum;
//     }

//     public static int calculateProduct(int[] factors) {
//         int product = 1;
//         for (int factor : factors) {
//             product *= factor;
//         }
//         return product;
//     }

//     public static double calculateSumOfSquares(int[] factors) {
//         double sum = 0;
//         for (int factor : factors) {
//             sum += Math.pow(factor, 2);
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         int number = input.nextInt();

//         int[] factors = findFactors(number);

//         for (int f : factors) {
//             System.out.print(f + " ");
//         }

//         System.out.println();
//         System.out.println(calculateSum(factors));
//         System.out.println(calculateProduct(factors));
//         System.out.println(calculateSumOfSquares(factors));
//     }
// }



//QUESTION 2
// import java.util.Scanner;

// public class NaturalNumberSum {

//     public static int recursiveSum(int n) {
//         if (n == 0)
//             return 0;
//         return n + recursiveSum(n - 1);
//     }

//     public static int formulaSum(int n) {
//         return n * (n + 1) / 2;
//     }

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         int n = input.nextInt();

//         if (n < 0) {
//             System.out.println("Not a natural number");
//             return;
//         }

//         int r1 = recursiveSum(n);
//         int r2 = formulaSum(n);

//         System.out.println(r1);
//         System.out.println(r2);

//         if (r1 == r2)
//             System.out.println("Both results are equal");
//         else
//             System.out.println("Results are not equal");
//     }
// }