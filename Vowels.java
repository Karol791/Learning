import java.util.Scanner;


public class Vowels
{
    public static int VowelsCount(String Word)
    {
        String vowels = "aeiouAEIOU";
        int vowelCount = 0;
        for(int i = 0; i < Word.length(); i++)
        {
            char currentChar = Word.charAt(i);
            if(vowels.indexOf(currentChar) >= 0)
            {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String Word = scan.nextLine();
        System.out.print("Number of vowels is "+ VowelsCount(Word));
        scan.close();
    }
}