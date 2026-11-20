/**
 * Tower of Hanoi. Complete hanoi() to print one legal move per line.
 *
 * Compile: javac Hanoi.java
 * Run:     java Hanoi
 */
public class Hanoi {
    public static void main(String[] args) {
        // Change the disk count to test a different tower.
        hanoi(1, 'A', 'C', 'B');
    }

    /**
     * Print the legal moves that transfer the stack from the source to the destination.
     *
     * disks is the number of disks in the stack, from 1 upward.
     * from is the source peg, to is the destination peg, and spare is the third peg.
     * The three peg labels are distinct.
     */
    public static void hanoi(int disks, char from, char to, char spare) {
        // TODO: Complete this method.
    }

    private static void move(char from, char to) {
        System.out.println(from + " -> " + to);
    }
}
