import java.util.*;
import java.util.Scanner;
public class palindromstring {
 
    // Method
    // Returning true if string is palindrome
    static boolean isPalindrome(String str)
    {
 
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;
 
        // While there are characters to compare
        while (i < j) {
 
            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
 
        // Given string is a palindrome
        return true;
    }
 
    // Method 2
    // main driver method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want");
        String str = sc.nextLine();
 
        //Convert the string to lowercase
        str = str.toLowerCase();
        // passing bool function till holding true
        if (isPalindrome(str))
 
            // It is a palindrome
            System.out.print("Yes its an palindrome");
        else
 
            // Not a palindrome
            System.out.print("its not an palindrome");
    }
}
