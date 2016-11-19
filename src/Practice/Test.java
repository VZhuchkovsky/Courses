package Practice;

import java.util.Random;

/**
 * Created by Vlad on 18.11.2016.
 */
public class Test {
    public static void main(String[] args) {

        Random rnd = new Random();
   /*     int[] a = new int[] {1,0,1,0,1,0,1,0,1,0,1,0};
        int b = 0;

            while(a[b] == 1){
                b = rnd.nextInt(12);
            }
        System.out.println(b);
*/

        String mark = "X";
        String[][] game = new String[3][3];
        System.out.println();

        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                game[i][j] = "_";

                if (j == 0 || j == 2) {
                    // System.out.print("|" + game[i][j] + "|");
                } else {
                    // System.out.print(game[i][j]);
                }
            }
            // System.out.println();
        }

        int x = rnd.nextInt(3);
        int y = rnd.nextInt(3);

        game[1][1] = "O";

        do {
            x = rnd.nextInt(3);
            y = rnd.nextInt(3);
        } while (!game[x][y].equals("_"));

        game[x][y] = mark;

        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                if (j == 0 || j == 2) {
                     System.out.print("|" + game[i][j] + "|");
                } else {
                     System.out.print(game[i][j]);
                }
            }
             System.out.println();
        }

    }


}
