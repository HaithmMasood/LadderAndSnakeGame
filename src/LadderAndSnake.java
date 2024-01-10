import java.util.Random;
import java.util.Scanner;

public class LadderAndSnake {
    private int playersNum;
    private String[] playersNames = null;
    private int[] playersPosition;
    private char[] playersInitials;

    public LadderAndSnake() {
        this.playersNum = 0;
        this.playersNames = null;
        this.playersPosition = null;
        this.playersInitials=null;
    }

    public static void boardGame(){
        int[][] board = new int[10][10];
        int counter = 100;

        for (int i = 0; i < board.length; i++){
            if (i % 2 == 0){
                for (int j = 0; j < board[i].length; j++) {
                    board[i][j] = counter--;
                    System.out.printf("\u001b[33m %5s", "" + board[i][j] + "  ");
                }
            }else {
                for (int j = 9; j >= 0; j--) {
                    board[i][j] = counter--;
                    System.out.printf("\u001b[35m %5s", "" + board[i][j] + "  ");
                }
            }
            System.out.println("\u001b[37m");
        }
        System.out.println("");
    }

    public static int flipDice() {
        Random dice = new Random();
        int number = 1 + dice.nextInt(6);
        return number;
    }

    public void players(int numOfPlayers){
        playersNames = new String[numOfPlayers];
        playersInitials = new char[numOfPlayers];
        String playerInitial = "";
        char initial = ' ';
        int j = 1;
        Scanner input = new Scanner(System.in);

        for (int i=0; i<numOfPlayers; i++){
            System.out.print("Player " + j + ": ");
            String name = input.next();
            playersNames[i] = name;
            j++;
        }

        System.out.println("\nPlayers initials as Follows: ");
        for (int i=0; i<numOfPlayers; i++){
            playerInitial = playersNames[i];
            initial = playerInitial.charAt(0);
            playersInitials[i] = initial;
            System.out.println(playersNames[i] + " --> " + playersInitials[i]);
        }

    }


    public void play(int numberOfPlayers) {
        this.playersPosition = new int[numberOfPlayers];
        int winner = -1; // Indicate no winner yet
        boolean gameInProgress = true;
        int round = 1;
        System.out.println("\nLet's begin the game starting with " + playersNames[0] + "\n");

        while (gameInProgress) {
            System.out.println("Round " + round);
            round++;
            for (int k = 0; k < numberOfPlayers; k++) {
                int currentDiceValue = flipDice();
                playersPosition[k] += currentDiceValue; // Update player's position based on dice roll

                // Logic for ladders and snakes
                if (playersPosition[k] == 1) {
                    playersPosition[k] = 38;
                } else if (playersPosition[k] == 4) {
                    playersPosition[k] = 14;
                } else if (playersPosition[k] == 8) {
                    playersPosition[k] = 30;
                } else if (playersPosition[k] == 21) {
                    playersPosition[k] = 42;
                } else if (playersPosition[k] == 28) {
                    playersPosition[k] = 76;
                } else if (playersPosition[k] == 32) {
                    playersPosition[k] = 10;
                } else if (playersPosition[k] == 34) {
                    playersPosition[k] = 6;
                } else if (playersPosition[k] == 48) {
                    playersPosition[k] = 26;
                } else if (playersPosition[k] == 50) {
                    playersPosition[k] = 67;
                } else if (playersPosition[k] == 62) {
                    playersPosition[k] = 18;
                } else if (playersPosition[k] == 71) {
                    playersPosition[k] = 92;
                } else if (playersPosition[k] == 80) {
                    playersPosition[k] = 99;
                } else if (playersPosition[k] == 88) {
                    playersPosition[k] = 24;
                } else if (playersPosition[k] == 95) {
                    playersPosition[k] = 56;
                } else if (playersPosition[k] == 97) {
                    playersPosition[k] = 78;
                }

                // Check for overshooting 100
                if (playersPosition[k] > 100) {
                    playersPosition[k] = 100 - (playersPosition[k] - 100);
                }

                System.out.println(playersNames[k] + " rolled a " + currentDiceValue + " and moved to position " + playersPosition[k]);

                // Check for a winner
                if (playersPosition[k] == 100) {
                    winner = k;
                    gameInProgress = false;
                    break;
                }
            }
        }

        if (winner != -1) {
            System.out.println("\nThe Winner is " + playersNames[winner]);
        }
    }


}
