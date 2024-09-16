
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        char board[][] = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
        char xo = 'X';
        Boolean gameover = false;
        Scanner sc = new Scanner(System.in);
        while (!gameover) {
            pboard(board);
            System.out.println("Player" + xo + "  Enter the Index:");
            int i = sc.nextInt();
            int j = sc.nextInt();
            if (board[i][j] == ' ') {
                board[i][j] = xo;
                gameover = won(board,xo);
                if (gameover) {
                    System.out.println("Player" + xo + "is the winner");
                } else {
                    if (xo == 'X') {
                        xo = 'O';
                    } else {
                        xo = 'X';
                    }

                }

            } else {
                System.out.println("Invalid Move.Choose a different Index!!");
            }

        }}
        public static boolean won(char[][] board,char xo){
            for (int i = 0; i < board.length; i++) {
                if (board[i][0] == xo && board[i][1] == xo && board[i][2] == xo) {
                    return true;

                }


            }
            for (int j = 0; j < board.length; j++) {
                if (board[0][j] == xo && board[1][j] == xo && board[2][j] == xo) {
                    return true;

                }


            }
            if (board[0][0] == xo && board[1][1]==xo && board[2][2]==xo) {
                return true;
            }
            if (board[0][2] == xo && board[1][1]==xo && board[2][0]==xo) {
                return true;
            }
            return false;

        }
        public static void pboard ( char board[][]){
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    System.out.print(board[i][j] + " |  ");
                }
                System.out.println();
            }

        }
    }
