import java.util.Scanner;

public class invertedHalfNumberPyramid2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of rows : ");
        int rows = sc.nextInt();
        int temp = 1;

        for(int i= 1;i<=rows; i++){
            for(int j=1; j<=i;j++){
                System.out.print(temp+" ");
                temp++;
            }
            System.out.print("\n");
        }

    }
}
