public class Floor {
    private static String[][] board = new String[20][10];
    /**
     [-"empty" = empty places of board, no mirror, no laser, maybe background
     -"lazer" = lazer
     -"mirror" = mirror, reflects the lazer, what player is controlling
     -"mirror90" = rotation value of the mirror, ex: mirror rotated 90 degrees]
     Bracket text is part of board
     */

    public static void main(String[] args){
        FillBoard();
        PrintBoard();
        DisplayGraphics screen = new DisplayGraphics();
        screen.init();
    }
    private static void FillBoard() {
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 20; j++){
                board[j][i] = "empty";

            }
        }
    }

    private static void PrintBoard() {
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 20; j++){
                System.out.print(board[j][i]);
            }
            System.out.println();
        }
    }
}
