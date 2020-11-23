import java.util.Scanner;

public class Password
{
    public static boolean checkPassword(String password)
    {
        if(password.length() < 8) return false;

        int letterCount = 0;
        int numberCount = 0;

        for(int i = 0; i < password.length(); i++)
        {
            char currentChar = password.charAt(i);

            if(numberCheck(currentChar))
            {
                numberCount++;
            }else if(letterCheck(currentChar))
            {
                letterCount++;
            }else
            {
                return false;
            }
        }
        return (letterCount >= 1 && numberCount >= 2);
    }
    
    public static boolean letterCheck(char letter)
    {
        letter = Character.toUpperCase(letter);
        return (letter >= 'A' && letter <= 'Z');
    }

    public static boolean numberCheck(char number)
    {
        return (number >= '0' && number <= '9');
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your new password: ");
        String password = scan.nextLine();
        while(!checkPassword(password))
        {
            System.out.print("You entered the wrong password!\n Password must be at least 8 characters long, one letter and two numbers!\n Enter your password again: ");
            password = scan.nextLine();
        }
        System.out.print("You entered correct password!");
        scan.close();
    }
}