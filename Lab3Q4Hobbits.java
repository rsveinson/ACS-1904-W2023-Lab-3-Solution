import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
*/

public class Lab3Q4Hobbits{
    public static void main(String[] args) {

    
        /* *** Q4 *** */
        String hobbitNames = "Frodo Sam Merry Pippen Bilbo";
        //String hobbitNames = "Frodo Sam Merry Pippen ";
        //hobbits("Frodo Sam Merry Pippen Bilbo");
        hobbits(hobbitNames);
        
        System.out.println("end of program");
    }// end main
    
    public static void hobbits(String h){
        // step one: split the String parameter into tokens
        String[] tokens = h.split(" +");
        
        // set the boolean for precise number of tokens required
        boolean valid = tokens.length == 4;
        //assert tokens.length == 4 : "4 hobbits in the fellowship";
        if(!valid)
            throw new IllegalArgumentException("there were 4 Hobbits, not " + tokens.length + ", in the fellowship");
        
        
    }// end hobbits
   
}// end class
