//NAME: NAUROSE FARHAN MOSTAFA
//ID:   23301196

// TASK 1
public class Task1 {
    public static void main (String [] args) {
        //A
        int number1 = 21;
        System.out.println(number1);
        //B
        int number2 = 7;
        System.out.println(number1 + number2);
        // C
        System.out.println(number1 * number2);
        System.out.println(number1 / number2);
        //D
        double num_1 = 3.147d;
        double num_2 = 2.710d;
        System.out.println(num_1);
        System.out.println(num_1 + num_2);
        System.out.println(num_1 * num_2);
        System.out.println(num_1 / num_2);
        //E
        double a_number = 3.221d;
        int b_number = 47;
        System.out.println(a_number);
        System.out.println(a_number + b_number);
        System.out.println(a_number * b_number);
        System.out.println(a_number / b_number);
        //F
        String str1 = "Hello";
        String str2 = "CSE";
        System.out.println(str1);
        System.out.println(str1 + str2);

        int num = 111;
        System.out.println(num);
        System.out.println(num + str2);
        System.out.println(str2 + num);
    }
}

//TASK 1 (G)
import java.util.Scanner;
public class Task1_G {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int number_1 = sc.nextInt();
        int number_2 = sc.nextInt();

        System.out.println(number_1);
        System.out.println(number_1 + number_2);
        sc.close();
    }
}


// TASK 2
public class Task2 {
    public static void main (String [] args) {
        int num_1 = 7;
        int num_2 = 21;

        int temp = num_1;
        num_1 = num_2;
        System.out.println("After swapping by creating a third variable: ");
        System.out.println("num_1 = " + num_1);
        System.out.println("num_2 = " + temp);

        int num1 = 7;
        int num2 = 21;
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping without creating any other variables: ");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}


// TASK 3
public class Task3 {
    public static void main (String [] args) {
        int ID = 23301196;
        int lastTwoDigits = ID % 100;

        int first_digit = lastTwoDigits / 10;
        int second_digit = lastTwoDigits % 10;

        System.out.println(second_digit);
        System.out.println(first_digit);
    }
}


// TASK 4
import java.util.Scanner;
public class Task4 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a positive integer: ");
        int n = sc.nextInt ();

        System.out.println(n + " x 1 = " + (n * 1));
        System.out.println(n + " x 2 = " + (n * 2));
        System.out.println(n + " x 3 = " + (n * 3));
        System.out.println(n + " x 4 = " + (n * 4));
        System.out.println(n + " x 5 = " + (n * 5));
        System.out.println(n + " x 6 = " + (n * 6));
        System.out.println(n + " x 7 = " + (n * 7));
        System.out.println(n + " x 8 = " + (n * 8));
        System.out.println(n + " x 9 = " + (n * 9));
        System.out.println(n + " x 10 = " + (n * 10));

        sc.close();
    }
}


// TASK 5
import java.util.Scanner;
public class Task5 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number_1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number_2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int number_3 = sc.nextInt();

        int largest = 0;
        if (number_1 > number_2 && number_1 > number_3){
            largest = number_1;
        }
        else if (number_2 > number_1 && number_2 > number_3){
            largest = number_2;
        }
        else{
            largest = number_3;
        }

        System.out.println("Largest number: " + largest);
        sc.close();
    }
}


// TASK 6
import java.util.Scanner;
public class Task6 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year%4 == 0){
            if (year%100 == 0 && year%400 == 0){
                System.out.println(year + " is a leap year");
            }
            else if (year % 100 == 0 && year % 400 != 0) {
                System.out.println(year + " is not a leap year.");
            }
            else{
                System.out.println(year + " is a leap year");
            }
        }
        else{
            System.out.println(year + " is not a leap year.");
        }
        sc.close();
    }
}


// TASK 7
import java.util.Scanner;
public class Task7 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();

        if (number%5 == 0 && number%7 == 0){
            System.out.println("Divisible by Both");
        }
        else if (number%5 == 0){
            System.out.println("Invalid: Divisible by 5 Only");
        }
        else if (number%7 == 0){
            System.out.println("Invalid: Divisible by 7 Only");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}


// TASK 8
import java.util.Scanner;
public class Task8 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your student ID: ");
        int ID = sc.nextInt();
        int year = ID/1000000;
        int temp = ID/100000;
        int session = temp%10;

        if (session == 1){
            System.out.println("Student Joined BRAC in Spring " + year);
        }
        else if (session == 2){
            System.out.println("Student Joined BRAC in Fall " + year);
        }
        else{
            System.out.println("Student Joined BRAC in Summer " + year);
        }
        sc.close();
    }
}


// TASK 9
import java.util.Scanner;
public class Task9 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your CGPA: ");
        double cgpa = sc.nextDouble();
        System.out.print("Enter your no. of Credits: ");
        int credits = sc.nextInt();

        if (credits >= 30 && cgpa >= 3.8){
            if (3.89 >= cgpa && cgpa >= 3.80){
                System.out.println("The student is eligible for a waiver of 25 percent");
            }
            else if (3.94 >= cgpa && cgpa >= 3.90){
                System.out.println("The student is eligible for a waiver of 50 percent");
            }
            else if (3.99 >= cgpa && cgpa >= 3.95){
                System.out.println("The student is eligible for a waiver of 75 percent");
            }
            else{
                System.out.println("The student is eligible for a waiver of 100 percent");
            }
        }
        else{
            System.out.println("The student is not eligible for a waiver");
        }
        sc.close();
    }
}


// TASK 10
import java.util.Scanner;
public class Task10 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        if (number%2 == 0 && number%5 == 0){
            System.out.println("Multiple of 2 and 5 both");
        }
        else if(number%2 == 0 || number%5 == 0){
            System.out.println(number);
        }
        else{
            System.out.println("Not a multiple we want");
        }
        sc.close();
    }
}


// TASK 11
import java.util.Scanner;
public class Task11 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        if (x < 0){
            System.out.println(2*x);
        }
        else if (0 <= x && x < 2){
            System.out.println(x+1);
        }
        else if (2 <= x && x < 5){
            System.out.println((x*x)-1);
        }
        else if (x >= 5){
            System.out.println(3*(x*x)+2);
        }
        sc.close();
    }
}