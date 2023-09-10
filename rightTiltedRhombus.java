import java.util.Scanner;

public class rightTiltedRhombus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();

        for(int i=rows; i>=1; i--){
            for(int j=1;j<=i-1; j++){
                System.out.print(" ");
            }
            for(int k=1 ; k<=rows; k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
