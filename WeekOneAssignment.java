package weekoneassignment;

public class WeekOneAssignment {

    public static void main(String[] args) {
        // Declare all variables
        String word = "Learning";
        char letter1 = word.charAt(0);
        char letter2 = word.charAt(1);
        char letter3 = word.charAt(2); 
        char letter4 = word.charAt(3);
        char letter5 = word.charAt(4);
        char letter6 = word.charAt(5);
        char letter7 = word.charAt(6);
        char letter8 = word.charAt(7);
        int total;
        
        // Calculate total of integer equivalents
        total = (int)letter1 + (int)letter2 + (int)letter3 + (int)letter4 +
                 (int)letter5 + (int)letter6 + (int)letter7 + (int)letter8;
        
        // Print out information
        System.out.println("The word is " + word);
        System.out.println(letter1 + " = " + (int)letter1);
        System.out.println(letter2 + " = " + (int)letter2);
        System.out.println(letter3 + " = " + (int)letter3);
        System.out.println(letter4 + " = " + (int)letter4);
        System.out.println(letter5 + " = " + (int)letter5);
        System.out.println(letter6 + " = " + (int)letter6);
        System.out.println(letter7 + " = " + (int)letter7);
        System.out.println(letter8 + " = " + (int)letter8);
        System.out.println("Total = " + total);
    }
    
}
