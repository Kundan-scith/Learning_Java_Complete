import java.util.Scanner;

public class diamondPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();

        for(int i=1; i<= rows; i++){
            for(int j=1; j<= rows-i; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <=i; j++){
                System.out.print("*");  
            }
            if(i>=2){
                for(int k=1;k<i; k++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i=rows; i>= 1; i--){
            for(int j=1; j<= rows-i; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <=i; j++){
                System.out.print("*");  
            }
            if(i>=2){
                for(int k=1;k<i; k++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }



        }
}
