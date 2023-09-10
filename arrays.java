import java.util.Arrays;

public class arrays {
    public static void main(String[] args){
        
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
    
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        marks[2] = 95;

        //length of array
        
        System.out.println(marks.length);
        System.out.println(marks[0]);
        Arrays.sort(marks); 
        System.out.println(marks[0]);

        int[] values = {100,200,300};
        System.out.println(values[0]);
        int[][] finalmarks = {{95,98,99},{95,96,75}};
        System.out.println(finalmarks[0][1]);


    }
    
}
