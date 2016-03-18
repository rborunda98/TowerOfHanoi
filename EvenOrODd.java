import java.util.*;
/**
 * Write a description of class EvenOrODd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EvenOrODd
{
    public static void main(String[] args){
        int x;
        String even;
        String odd;
        System.out.println("Enter an integer to check if it is odd or even ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        if ( x % 2 == 0 ){
            even = "even";
            System.out.println(even);
        }
        else{
            odd = "odd";
            System.out.println(odd);
        }

    }
}
