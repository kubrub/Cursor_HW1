import java.util.Scanner;


public class Main {
    public static float Addition(int num1, int num2){
        return num1+num2;
    }
    public static float Subtraction(int num1, int num2){
        return num1-num2;
    }
    public static float Multiplication(int num1, int num2){
        return num1*num2;
    }
    public static float Division(int num1, int num2){
        if (num2==0){
            return 0;}
        else{
            return (float)num1/num2;}
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value: ");
        int x = scanner.nextInt();

        System.out.print("Enter the action (+,-,/,*):");
        String symbol = scanner.next();

        System.out.print("Enter value: ");
        int y = scanner.nextInt();
        float result = 0f;
        switch (symbol) {
            case "+":
                result = Addition(x,y);
                break;
            case "-":
                result = Subtraction(x,y);
                break;
            case "*":
                result = Multiplication(x,y);
                break;
            case "/":
                result = Division(x,y);
                break;
            default:
                System.out.println("Incorrect entered math operand");
        }
        System.out.printf("The result of this action: %s", result);
    }
}