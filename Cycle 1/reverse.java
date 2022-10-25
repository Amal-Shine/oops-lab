import java.util.Scanner;

class reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entert the number to reverse");
        int num = sc.nextInt();
        int reversed=0;
      
      System.out.println("Original Number: " +num);
  
      // run loop until num becomes 0
      while(num != 0) {
      
        // get last digit from num
        int digit = num % 10;
        reversed = reversed * 10 + digit;
  
        // remove the last digit from num
        num /= 10;
      }
  
      System.out.println("Reversed Number: " + reversed);
    }
  }
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
