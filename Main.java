import java.util.Scanner;
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.List;
public class Main
{
    Tower tower = new Tower();
    public  void main(){
        System.out.println(tower.TowerSetup(5));
    }

    public void ifStatements(){
        Scanner scanner = new Scanner(System.in);
        String move = scanner.next();
        //         String left2 = scanner.next();
        //         String right1= scanner.next();
        //         String right2= scanner.next();

        if(move.equals("left")){
            tower.moveLeftOne(5);
            System.out.println(tower.peg1);
            if(tower.position == 2){
                System.out.println(tower.peg1);
            }
            if(tower.position == 3){
                System.out.println(tower.peg2);
            }
            scanner.next();
        }
        else if(move.equals("lefttwo")){
            tower.moveLeftOne(5);
            System.out.println(tower.peg1);
            scanner.next();
        }
        else if(move.equals("right")){
            tower.moveRightOne(5);
            if(tower.position == 1){
                System.out.println(tower.peg2);
            }
            if(tower.position == 2){
                System.out.println(tower.peg3);
            }
            scanner.next();
        }
        else if(move.equals("righttwo")){
            tower.moveRightTwo(5);
            System.out.println(tower.peg3);
            scanner.next();

        }
    }
}

