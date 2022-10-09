import java.util.Scanner;

public class Calculator {
    static Scanner console = new Scanner(System.in);

    public static int GetInt() {
        System.out.print("Enter the integer: ");
        int x;
        if (console.hasNextInt()) {
            x = console.nextInt();
        } else {
            System.out.println("Try again: ");
            console.next();
            x = GetInt();
        }
        return x;
    }

    public static char GetOp() {
        System.out.print("Enter the math operation: '+', '-', '*', '/': ");
        char op;
        if (console.hasNext()) {
            while(true){
                op = console.next().charAt(0);
                if(op == '+' || op == '-' || op == '*' || op == '/')
                    return op;
                else
                    System.out.print("Try again: ");
            }
        } else {
            System.out.print("Try again: ");
            console.next();
            op = GetOp();
        }
        return op;
    }

    public static int calc(int x, int y, char op) {
        if (op == '+')
            return x + y;
        else if (op == '-')
            return x - y;
        else if (op == '*')
            return x * y;
        else if (op == '/') {
            if (y == 0)
                System.out.println("Error");
        } else
            System.out.println("");

        return 0;
    }

    public static void main(String[] args) {
        int x = GetInt();
        int y = GetInt();
        char mathOp = GetOp();
        int result = calc(x, y, mathOp);
        System.out.println(x + "" + mathOp + y + " = " + result);
    }
}
