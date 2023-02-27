import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);
    double num1, num2, result;
    char operator;

    System.out.println("Enter the first number:");
    num1 = imput.nextDouble();

    System.out.println("Enter the operator (+, -, *, /):");
    operator = imput.next().charAt(0);

    System.out.println("Enter the second number:");
    num2 = imput.nextDouble();

    switch(operator) {
      case '+':
        result = num1 + num2;
        break;

      case '-':
        result = num1 - num2;
        break;

      case '*':
        result = num1 * num2;
        break;

      case '/':
        result = num1 / num2;
        break;

      default:
        System.out.println("Invalid operator");
        return;
    }

    System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
  }
}
