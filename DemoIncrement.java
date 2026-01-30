// Add your code below

public class DemoIncrement {
    public static void main(String[] args) {
        // Demonstration of the increment operator
        int a = 3;
        int b = a++ + 5;
        int x = 3;
        int y = ++x + 5;

        //a = 4
        //b = 8
        //x = 4
        //y = 9


        System.out.print("a: " + a);
        System.out.print(", b: " + b);
        System.out.print(", x: " + x);
        System.out.println(", y: " + y);

        // Replace the xxxxx in the following with the correct term
        System.out.println("i++ means before-increment");
        System.out.println("++i means after-increment");
    }
}
