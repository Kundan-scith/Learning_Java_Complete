import java.util.Scanner;

public class input {
    public static void main(String[] arg){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your gender (F/M): ");
        String gender =  sc.next();
        System.out.println(name);
        
        System.out.println("Entered details-----------------------------------");
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
sc.close();

    }

}
