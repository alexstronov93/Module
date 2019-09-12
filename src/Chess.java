import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startPosX, startPosY, nextPosX, nextPosY;
        do {
            System.out.println("Input  the coordinates of current position:");
            startPosX = in.nextInt();
            startPosY = in.nextInt();
        }
        while ((startPosX > 8 || startPosX < 0) ||
                (startPosY > 8 || startPosY < 0));
        do {
            System.out.println("Input  the coordinates of next position:");
            nextPosX = in.nextInt();
            nextPosY = in.nextInt();
        }
        while ((nextPosX > 8 || nextPosX < 0) ||
                (nextPosY > 8 || nextPosY < 0));
        int diffX = Math.abs(nextPosX - startPosX);
        int diffY = Math.abs(nextPosY - startPosY);
        if ((diffX == 2 && diffY == 1) || (diffX == 1 && diffY == 2)) {
            System.out.println("It is possible");
        } else System.out.println("It is NOT possible");
    }
}



