import java.util.Scanner;

public class loopExample {
   public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int k=0;

    do{
        System.out.println("Enter a number: ");
        k = sc.nextInt();
        System.out.println(k);
        
    }while(k>=0);

    System.out.println("THE END");
   } 
   
}
