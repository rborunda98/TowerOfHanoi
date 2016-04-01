import java.util.*;
/**
* Write a description of class TowerOne here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
@SuppressWarnings("unchecked")
public class Tower
{
    int counter = 0;
    int position = 1;
    ArrayList peg1 = new ArrayList();
    ArrayList peg2 = new ArrayList();
    ArrayList peg3 = new ArrayList();

    public int TowerSetup(int numOfDisks){
        for(int i = numOfDisks; i>0; i--){
            if(i==numOfDisks){
                peg1.add(numOfDisks);
                peg2.add(0);
                peg3.add(0);
                numOfDisks--;
            }

            if(i == 0){
                peg1.add(0);
                peg2.add(0);
                peg3.add(0);
            }

            peg1.add(numOfDisks);
            peg2.add(0);
            peg3.add(0);
            numOfDisks--;
        }

        //         int[] a = new int[peg1.size()];
        //         int[] b = new int[peg2.size()];
        //         int[] c = new int[peg3.size()];
        //         System.out.println(a);
        System.out.println(peg1);
        return position;
    }

    public  int moveLeftOne(int element){
        if(position == 1){
            System.out.println("You can't move left");
        }
        else if(position ==3){

            peg2.set(element,element);
            counter++;
            position = 2;

        }
        else if (position ==2){
            peg1.set(element,element);
            counter ++;
            position = 1;
        }
        System.out.println(position);
        return position;
    }

    public int  moveLeftTwo(int element){
        if(position == 1){
            System.out.println("You can't move left");
        }

        else if (position == 2){
            System.out.println("You can't move left");
        }

        else if (position == 3){
            peg1.set(element,element);
            counter++;
            position = 1;

        }
        System.out.println(position);
        return position;
    }

    public int moveRightOne(int element){
        if(position == 1){
            peg2.set(element,element);
            counter++;
            position = 2;
        }
        else if(position == 2){
            peg3.set(element,element);
            counter++;
            position = 3;
        }
        else if (position == 3){
            System.out.println("You can't move right.");
        }
        System.out.println(position);
        return position;
    }

    public int moveRightTwo(int element){
        if(position == 1){
            peg3.set(element,element);
            counter++;
            position = 3;

        }
        else if(position == 2){
            System.out.println("You can't move right.");
        }
        else if (position == 3){
            System.out.println("You can't move right.");
        }
        System.out.println(position);
        return position;
    }
}
