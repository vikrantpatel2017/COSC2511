import java.util.Random;

public class GameEngine {

    private char[][] grid;
    private int playerRow;
    private int playerCol;
    private int gridSize = 5;
    private boolean gameOver;

    GameEngine() {
        grid = new char[gridSize][gridSize];
        initialiseGrid();
        playerRow = 0;
        playerCol = 0;
        gameOver = false;

    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public boolean getGameOver() {
        return this.gameOver;
    }

    public void initialiseGrid() {
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                grid[i][j] = '-';
            }
        }

        //grid[4][2] = 'G';
        grid[gridSize-1][gridSize-1] = 'G';
        //INSERTING THE FIRST ENEMY
        Random random1 = new Random();
        int temp1 = random1.nextInt(5);
        int temp2 = random1.nextInt(5);
        grid[temp1][temp2] = 'O';

        //INSERTING THE SECOND ENEMY
        int temp3 = random1.nextInt(5);
        int temp4 = random1.nextInt(5);
        grid[temp3][temp4] = 'O';
    }

    public void printGrid() {
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                if (i == playerRow && j == playerCol) {
                    System.out.print('P'); // Player
                } else {
                    System.out.print(grid[i][j]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void checkGameOver(){
        if(grid[playerRow][playerCol] == 'G'){
            gameOver = true;
            System.out.println("CONGRATULATIONS! YOU WON! GAME OVER!!");
        }else if(grid[playerRow][playerCol] == 'O'){
            gameOver = true;
            System.out.println("OOPS!! You died!! Monster Killed YOu!!");
        }
    }

    public void movePlayer(char direction) {
        switch (direction) {
            case 'N':
                if (playerRow > 0) {
                    playerRow--;
                }
                break;
            case 'S':
                if (playerRow < gridSize - 1) {
                    playerRow++;
                }
                break;
            case 'E':
                if (playerCol < gridSize - 1) {
                    playerCol++;
                }
                break;
            case 'W':
                if (playerCol > 0) {
                    playerCol--;
                }
                break;
            default:
                break;
        }
        checkGameOver();
    }

}
