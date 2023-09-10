import java.util.Scanner;

public class switchStatement {
    public static void main (String [] args){
        Scanner scc = new Scanner(System.in);
        System.out.println("Enter number to find days of weeks");

        int day = scc.nextInt();
        switch(day){
            case 1: 
                System.out.println("Monday");
                break;
            case 2: 
                System.out.println("Tuesday");
                break;
            case 3: 
                System.out.println("Wednesday");
                break;
            case 4: 
                System.out.println("Thrusday");
                break;
            case 5: 
                System.out.println("Friday");
                break;
            case 6: 
                System.out.println("Saturday");
                break;
            case 7: 
                System.out.println("Sunday");
                break;
            default: 
                System.out.println("Invalid entry");
        }
        scc.close();
    }
}
