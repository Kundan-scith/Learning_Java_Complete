import java.util.Scanner;

public class invertedHalfPyramid180DegFlip {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row : ");
        int rows = sc.nextInt();

        for(int i= 0; i<=rows; i++){
            for(int j = 1; j <= rows-i; j++){
                System.out.print(" ");
            }

            for(int j = 1;j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
