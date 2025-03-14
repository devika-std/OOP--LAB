import java.util.Scanner;
import java.util.Arrays;
public class SortString 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System strElement;
        System.out.println("Enter the number  strings");
        int n=s.nextInt();
        s.nextLine();
        String[] str=new String[n];
        System.out.println("Enter the string");
        for(int i=0;i<n;i++)
        {
            str[i]=s.nextLine();
        }   
        Arrays.sort(str);
        System.out.println("\nSorted strings:");
        for(String word:str) 
        {
            System.out.println(word);
        }
        s.close();
    }
    
}
