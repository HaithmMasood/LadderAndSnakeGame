import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nBelow is The Game Board!\n");
        Scanner input = new Scanner(System.in);

        LadderAndSnake l = new LadderAndSnake();
        LadderAndSnake.boardGame();

        System.out.print("Please Enter Number of Players (2 or more): ");
        int numberOfPlayers = input.nextInt();

        l.players(numberOfPlayers);

        l.play(numberOfPlayers);



    }
}