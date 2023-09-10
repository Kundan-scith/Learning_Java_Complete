import java.util.Scanner;

public class palindromicPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();

        for(int i= 1; i<=rows; i++){
            for(int j = 1; j<= rows-i; j++){
                System.out.print(" ");
            }
            int temp = i;
            for(int j=1;j<=i; j++){
                System.out.print(temp);
                temp--;
            }
            if(i>=2){
                int temp1 = 2;
                for(int k = 1; k<i;k++){
                    System.out.print(temp1);
                    temp1++;
                }
            }
            System.out.println();
        }
    }
}
