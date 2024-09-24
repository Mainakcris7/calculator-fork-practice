import java.util.Scanner;

public class Calc {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static double div(int a, int b) throws Exception {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Enter the expression --- ");
        System.out.println("Format should be like:  <operand> <operator> <operand>");
        System.out.println("For example: 10 + 2");

        System.out.print("Enter the expression: ");
        String exp = sc.nextLine();
        String parsedArr[] = exp.split(" ");
        int a = Integer.parseInt(String.valueOf(parsedArr[0]));
        int b = Integer.parseInt(String.valueOf(parsedArr[2]));
        char op = parsedArr[1].charAt(0);

        switch (op) {
            case '+':
                System.out.println(a + " + " + b + " = " + Calc.add(a, b));
                break;

            case '-':
                System.out.println(a + " - " + b + " = " + Calc.sub(a, b));
                break;

            case '*':
                System.out.println(a + " * " + b + " = " + Calc.mul(a, b));
                break;

            case '/':
                try {
                    double value = Calc.div(a, b);
                    System.out.println(a + " / " + b + " = " + value);
                } catch (Exception e) {
                    System.out.println(e);
                    System.out.println(e.getMessage());
                }

                break;

            default:
                System.out.println("Wrong input...");
                break;
        }

        sc.close();
    }
}
