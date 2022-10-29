import java.util.Scanner;
class Main  
{  
     public static void main(String a[]) 
     {  
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the  string: "); 
        String input = sc.nextLine();
        if(isPalindrome(input))
        {
            System.out.println(input+"is a palindrome string");
        }
        else
        {
            System.out.println(input+"is not a palindrome String");
        }
     }
     public static boolean isPalindrome(String Str)
     {
         int left=0,right=Str.length()-1;
         while(left<right)
         {
             if(Str.charAt(left)!=Str.charAt(right))
             {
                 return false;
             }
             left++;
             right--;
         }
         return true;
     }
}
