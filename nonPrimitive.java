public class nonPrimitive {
    public static void main (String[] args){
        //Java Type
        //Non-Primitive (a)String
        String name = "Harshita";
        String friend = new String ("Kundan");
        System.out.println(name);
        System.out.println(name.length());

        //concatnation
        String combine = name + " and " + friend ;
        System.out.println(combine);

        //char at
        System.out.println(name.charAt(0));
        System.out.println(friend.length());

        //replace a word at index 
        String name2 =  friend.replace('d','u');
        System.out.println(name2);

        // Stings are immuteable in java
        //Sub string 
        System.out.println(name2.substring(0,4));

    }
}
