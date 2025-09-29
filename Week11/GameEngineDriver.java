import java.util.Scanner;

/**
 * GameDriver
 */
public class GameEngineDriver {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        GameEngine game1 = new GameEngine();

        while (!game1.getGameOver()) {
            game1.printGrid();
            System.out.println("Hey Player, where would you like to travel(N/S/E/W)?: ");
            char userInput = myScanner.next().charAt(0);
            game1.movePlayer(userInput);

        }

        

    }
}