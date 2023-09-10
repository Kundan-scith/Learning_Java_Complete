public class operators {
    public static void main(String[] args){
        //operators
        double a = 1;
        double b = 2;
        int add = (int)(a + b);
        double diff = a - b;
        double mul = a * b;
        int div = (int)a / (int)b;
        double div1 =a/b;
        double mod = a%b;

        System.out.println(add);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(div1);
        System.out.println(mod);

        //unary operators
        int number = 1;
        number = number + 1;
        number++;
        number--;
        System.out.println(number); 
        
    }
    
}
