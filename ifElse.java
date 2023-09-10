public class ifElse {
    public static void main(String[] args){
        boolean isSunUp = true;
        if(isSunUp == true){
            System.out.println("Its a day");
        }else{
            System.out.println("Its a night");
        }

        int a = 30;
        int b = 40;

        if(a < 50 && b < 50)
            System.out.println("Both less than 50");
        else
            System.out.println("not less than 50");

        if(a < 50 || b < 50)
            System.out.println("Atleast one less than 50");
        else
            System.out.println("not less than 50");

        boolean isAdult = false;
        if(!isAdult){
            System.out.println("is adult");
        }else{
            System.out.println("not adult");
        }

    }
}
