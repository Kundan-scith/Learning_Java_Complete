import java.util.Scanner;

public class Project {

    public static void main(String[] args){
        int i = (int)(Math.random()*100);
        int k=0;
        Scanner sc = new Scanner(System.in);
        while(k>=0){
            System.out.println("Guess your number: ");
            k = sc.nextInt();
            if(k<0){
                System.out.println("THE END");
                break;
            }else if(k==i){
                System.out.println("HURRAY !!  YOU HAD GUESSED IT CORRECT !!!!");
                break;
            }else if(k>i){
                System.out.println("Number is greator than excepted random number");
            }else if(k<i){
                System.out.println("number id less than random number");
            }


        }
    }
    
}
