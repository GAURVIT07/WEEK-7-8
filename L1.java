//QUESTION 1
// import java.util.Scanner;

// public class  {

//     public static double calculateSimpleInterest(double principal, double rate, double time) {
//         double simpleInterest = (principal * rate * time) / 100;
//         return simpleInterest;
//     }

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         double principal, rate, time, result;

//         System.out.print("Enter Principal: ");
//         principal = input.nextDouble();

//         System.out.print("Enter Rate of Interest: ");
//         rate = input.nextDouble();

//         System.out.print("Enter Time: ");
//         time = input.nextDouble();

//         result = calculateSimpleInterest(principal, rate, time);

//         System.out.println("The Simple Interest is " + result +
//                 " for Principal " + principal +
//                 ", Rate of Interest " + rate +
//                 " and Time " + time);
//     }
// }



// QUESTION 2
// import java.util.Scanner;

// public class HandshakeCalculator {

//     public static int calculateHandshakes(int numberOfStudents) {
//         int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
//         return handshakes;
//     }

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         int numberOfStudents, result;

//         System.out.print("Enter number of students: ");
//         numberOfStudents = input.nextInt();

//         result = calculateHandshakes(numberOfStudents);

//         System.out.println("Maximum number of handshakes = " + result);
//     }
// }


//QUESTION 3
// import java.util.Scanner;

// public class TriangularParkRun {

//     public static double calculateRounds(double side1, double side2, double side3) {
//         double perimeter = side1 + side2 + side3;
//         double totalDistance = 5000; // 5 km in meters
//         double rounds = totalDistance / perimeter;
//         return rounds;
//     }

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         double side1, side2, side3, rounds;

//         System.out.print("Enter side 1: ");
//         side1 = input.nextDouble();

//         System.out.print("Enter side 2: ");
//         side2 = input.nextDouble();

//         System.out.print("Enter side 3: ");
//         side3 = input.nextDouble();

//         rounds = calculateRounds(side1, side2, side3);

//         System.out.println("Number of rounds to complete 5 km = " + rounds);
//     }
// }