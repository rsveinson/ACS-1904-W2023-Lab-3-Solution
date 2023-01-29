import java.util.Scanner;
/** 
 * ACS-1904 Lab 3 FormatPhoneNumber
 * Sveinson 
*/

public class Lab3FormatPhoneNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String test = "204.867.5309";

        /* since StringBuilder overrides the inherited toString()
         * method we can explicitly call .toString() on our 
         * StringBuilder or we could implicitly call toString()
         * as in the line below
         */
        System.out.println(format(test));

        System.out.println("\nend of program");
    }// end main
    
    /*****************************************
    * Description: format a north american phone number
    * 
    * @param        String pn a phone number in the format 999.999.9999
    * 
    * @return       StringBuilder formatted phone number
    * ****************************************/
    public static StringBuilder format(String pn){
        StringBuilder st = new StringBuilder();
        boolean valid = true;
        
        // check for length
        valid = pn.length() == 12;
        if(!valid)
            throw new IllegalArgumentException("Phone number must have 12 characters.");
            
        // check for dots
        valid = pn.charAt(3) == '.' && pn.charAt(7) == '.';
        if(!valid)
            throw new IllegalArgumentException("Error: missing or incorrctly placed dots.");
            
        // check digit positions are numeric
        for (int i = 0; i < pn.length() && valid; i++)
            valid = ((i == 3 || i == 7) || Character.isDigit(pn.charAt(i)));
        // char[] ch = pn.toCharArray();
        // int i = 0;
        
        // for(char c : ch){
            // valid = ((i == 3 || i == 7) || Character.isDigit(c));
            // i++;
        // }
            
        if (!valid) 
           throw new IllegalArgumentException("missing or incorrct digits.");
           
        // if we get to this point all of the checks have passed and the parameter is corrct
        
        // split the sting into tokens
        String[] tokens = pn.split("\\.");
        
        // System.out.println(tokens.length);
        // System.out.println(tokens[0]);
        // System.out.println(tokens[1]);
        // System.out.println(tokens[2]);
        
        st.append("+1(" + tokens[0] + ")" + tokens[1] + "-" + tokens[2]);
                
        return st;
    }// end format
}
