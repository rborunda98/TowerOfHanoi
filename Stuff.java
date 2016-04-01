
/**
 * Write a description of class Stuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stuff
{
   void myMethod( int counter)
 {
 if(counter == 0)
      return;
 else
        {
        System.out.println(""+counter);
        myMethod(--counter);
        return;
        }
 } 
}
