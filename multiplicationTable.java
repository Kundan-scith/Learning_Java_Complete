import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int mul = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println( mul +" * "+ i +" = " + (mul*i));
        }

    }
}
