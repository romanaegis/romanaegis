import java.util.Scanner;

public class First {
    public static void main(String args[])
    {
        String name;
        try (Scanner scan = new Scanner(System.in)) 
        {
            System.out.println("May I know your name");
            name=scan.nextLine();
        }

        System.out.println("Welcome "+name);
        
    }
}