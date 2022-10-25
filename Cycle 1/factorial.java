import java.util.Scanner;
import java.util.*;
class facto {
    public static void main (String args[]){
       int facto=1;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number you want");
     int n = sc.nextInt(); 
    
    while(n!=0){
    facto = facto*n;
        n--;
    }
    System.out.println("Factorial of given number is :" +facto);
}
}
