import java.util.Scanner;

public class leftTiltedRhombus {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows =  sc.nextInt();

        for(int i=1; i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=rows; k++){
                System.out.print("*");
            }
            System.out.print("\n");
            
        }
    }
}
