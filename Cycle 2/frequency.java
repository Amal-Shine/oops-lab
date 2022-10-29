import java.util.Scanner;
public class charFrequency
{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
String str;
System.out.println("enter a string");
str=in.nextLine();
int[] freq=new int[256];
for(int i=0;i<str.length();i++)
freq[str charAt(i)]++;
for(int i=0;i<256;i++)
system.out.println((char)i+" "+freq[i]);
}
}

