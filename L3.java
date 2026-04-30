// import java.util.Random;

// public class FootballTeamHeights {

//     public static int[] generateHeights() {
//         Random random = new Random();
//         int[] heights = new int[11];

//         for (int i = 0; i < heights.length; i++) {
//             heights[i] = 150 + random.nextInt(101);
//         }

//         return heights;
//     }

//     public static int findSum(int[] heights) {
//         int sum = 0;
//         for (int h : heights) {
//             sum += h;
//         }
//         return sum;
//     }

//     public static double findMean(int[] heights) {
//         int sum = findSum(heights);
//         return (double) sum / heights.length;
//     }

//     public static int findShortest(int[] heights) {
//         int min = heights[0];
//         for (int h : heights) {
//             if (h < min) {
//                 min = h;
//             }
//         }
//         return min;
//     }

//     public static int findTallest(int[] heights) {
//         int max = heights[0];
//         for (int h : heights) {
//             if (h > max) {
//                 max = h;
//             }
//         }
//         return max;
//     }

//     public static void main(String[] args) {

//         int[] heights = generateHeights();

//         System.out.print("Heights: ");
//         for (int h : heights) {
//             System.out.print(h + " ");
//         }

//         System.out.println();
//         System.out.println("Sum = " + findSum(heights));
//         System.out.println("Mean Height = " + findMean(heights));
//         System.out.println("Shortest Height = " + findShortest(heights));
//         System.out.println("Tallest Height = " + findTallest(heights));
//     }
// }