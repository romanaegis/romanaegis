import java.util.*;
/**
 * KeyRead
 */
public class KeyRead {

    public static void main(String[] args) 
    {
        try(Scanner scan=new
         Scanner(System.in))
        {
        int x,y;
        System.out.println("Enter 2 numbers");
        x=scan.nextInt();
        y=scan.nextInt();

        int z=x+y;
        System.out.println(z);
        }
    }
}