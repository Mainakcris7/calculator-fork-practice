import java.text.DecimalFormat;
import java.util.Scanner;

public class Calc {
    public static int add(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    public static int mul(int a, int b){
        return a * b;
    }

    public static double div(int a, int b){
        return (double) a / b;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the expression : ");
        String exp = sc.nextLine();

        int a = Integer.parseInt(String.valueOf(exp.charAt(0)));
        int b = Integer.parseInt(String.valueOf(exp.charAt(2)));
        char c = exp.charAt(1);

        switch (c) {
            case '+':
                System.out.println(a + " + " + b  + " = " + Calc.add(a, b));
                break;

            case '-':
                System.out.println(a + " - " + b  + " = " + Calc.sub(a, b));
                break;

            case '*':
                System.out.println(a + " * " + b  + " = " + Calc.mul(a, b));
                break;

            case '/':
                double value =Double.parseDouble(new DecimalFormat("##.###").format(Calc.div(a, b)));
                System.out.println(a + " / " + b  + " = " + value);
                break;
        
            default:
                System.out.println("Wrong input...");
                break;
        }

        sc.close();
    }
}


