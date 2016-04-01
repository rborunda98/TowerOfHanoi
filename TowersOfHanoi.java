import java.util.*;
public class TowersOfHanoi {

    public void solve(int n, String start, String auxiliary, String end) {
        if (n == 1) {
            System.out.println(start + " -> " + end);
        } else {
            solve(n - 1, start, end, auxiliary);
            System.out.println(start + " -> " + end);
            solve(n - 1, auxiliary, start, end);
        }
    }

    public static void main(String[] args) {
        TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
        System.out.print("Enter number of discs: ");
        Scanner scanner = new Scanner(System.in);   //Inputs # of Discs
        int discs = scanner.nextInt();  //Equals discs to input
        towersOfHanoi.solve(discs, "A", "B", "C");
        //A is Start; B is Auxillary; C Is End; 

        //         Normal Tower of Hanoi;
        //         Move First Disc to last PEg;
        //         Move "next" disk to middle peg;
        //         Move last disc to last peg;
        //         Move "Next" dic to last peg;
    }
}

