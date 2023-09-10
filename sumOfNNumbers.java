import java.util.Scanner;

public class sumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr any natural number: ");
        int n = sc.nextInt();
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            temp = temp + i;
        }
        System.out.println("The sum will be : ");
        System.out.println(temp);
    }
}
