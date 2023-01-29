import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
 */

public class Lab3Q5BiBaddaBoom{
    public static void main(String[] args) {

        /* split and re-construct a string
        using .split and StringBuilder
         */

        String strin = "big-7badda-boom9 may the@   force be with you";

        //split the string into an array of Strings using a
        // very specific regular expression
        String[] tokens = strin.split("[ @-]+");

        // print the length of the array i.e. the number of tokens
        System.out.println("Tokens: " + tokens.length);

        // re-construct the string using StringBuilder and a for-each loop
        StringBuilder q4st = new StringBuilder();
        for(String t : tokens)
            q4st.append(t);

        // output
        System.out.println(q4st.toString());


        /* *** Q5 *** */
        //String hobbitNames = "Frodo Sam Merry Pippen Bilbo";
        String hobbitNames = "Frodo Sam Merry Pippen ";
        //hobbits("Frodo Sam Merry Pippen Bilbo");
        hobbits(hobbitNames);

        System.out.println("end of program");
    }

    public static void hobbits(String h){
        String[] tokens = h.split(" +");
        boolean valid = tokens.length == 4;
        //assert tokens.length == 4 : "4 hobbits in the fellowship";
        if(!valid)
            throw new IllegalArgumentException("there were 4 Hobbits, not " + tokens.length + ", in the fellowship");

    }
}
