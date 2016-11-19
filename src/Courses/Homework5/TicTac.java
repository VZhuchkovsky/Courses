package Courses.Homework5;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Vlad on 17.11.2016.
 */
public class TicTac {
    public static void main(String[] args) {

        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        String mark = null;
        String mark1 = null;
        String mark2 = null;
        //String mark = "X";
        //String mark2 = "O";
        int x = 0, y = 0;
        int modeSelect = 0;

        while (true) {
            System.out.println("Выберите режим. \nПротив человека - 0. \nПротив компьютера - 1.");
            System.out.print("Ваш выбор: ");
            modeSelect = sc.nextInt();
            if (modeSelect == 0) {
                System.out.println("Вы выбрали режим для двух игроков.");
                break;
            } else if (modeSelect == 1) {
                System.out.println("Вы выбрали карьерный режим.");
                break;
            } else {
                System.out.println("Ошибка.Повторите выбор.");
                System.out.println();
            }
        }

        System.out.println();

        while (true) {
            System.out.print("Выберите метку (X/O): ");
            mark = sc.next();
            if (mark.equals("X") || mark.equals("O")) {
                System.out.println("Вы выбрали " + mark + ".");
                break;
            } else {
                System.out.println("Ошибка. Неверное значение. Повторите выбор.");
            }
        }

        if (mark.equals("X")) {
            mark1 = mark;
            mark2 = "O";
        } else {
            mark1 = mark;
            mark2 = "X";
        }



        String[][] game = new String[3][3];
        System.out.println();

/*
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
*/
        boolean gameContinue = true;
        boolean gameNotEnd = true;
        int countGameX = 0;
        int countGameO = 0;


        while (gameNotEnd) {

            gameContinue = true;
            gameNotEnd = true;
            int countTurn = 1;

            for (int i = 0; i < game.length; i++) {
                for (int j = 0; j < game[i].length; j++) {
                    game[i][j] = "_";

                    if (j == 0 || j == 2) {
                        // System.out.print("|" + game[i][j] + "|");
                    } else {
                        // System.out.print(game[i][j]);
                    }
                }
               //  System.out.println();
            }


            while (gameContinue) {

                System.out.println("Игра начинается.");

                if (countTurn % 2 != 0) {
                    mark = mark1;

                    if (modeSelect == 0) {
                        System.out.println();
                        System.out.println("Игрок " + mark + " делает ход.");
                    } else {
                        System.out.println();
                        System.out.println("Ваш ход.");
                    }

                } else {
                    mark = mark2;

                    if (modeSelect == 0) {
                        System.out.println();
                        System.out.println("Игрок " + mark + " делает ход.");
                    } else {
                        System.out.println();
                        System.out.println("Ход компьютера.");
                    }

                }


                while (true) {

                    if (modeSelect == 1 && (countTurn % 2 == 0)) {
                        x = rnd.nextInt(3);
                        y = rnd.nextInt(3);

                        Computer(game, mark);

                        break;
                    }

                    while (true) {
                        System.out.print("Выберите строку: ");
                        x = sc.nextInt();
                        System.out.println();

                        if (x < 0 || x > 2) {
                            System.out.println("Ошибка. Значение неверно. Повторите ввод.");
                        } else {
                            break;
                        }
                    }

                    while (true) {
                        System.out.print("Выберите столбец: ");
                        y = sc.nextInt();
                        System.out.println();

                        if (y < 0 || y > 2) {
                            System.out.println("Ошибка. Значение неверно. Повторите ввод.");
                        } else {
                            break;
                        }
                    }

                    if (!game[x][y].equals("_")) {
                        System.out.println("Ошибка. Это место занято.");
                        System.out.println();
                    } else {
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
                        break;
                    }

                }


                int p = 0;
                if ((game[p][p].equals(mark) && (game[p][p]).equals(game[p + 1][p + 1])) && ((game[p + 1][p + 1]).equals(game[p + 2][p + 2]))) {
                    System.out.println("Победил игрок " + mark);

                    if (mark.equals("X")) {
                        countGameX++;
                    } else {
                        countGameO++;
                    }

                    System.out.println("Игрок Х одержал победу " + countGameX + " раз.");
                    System.out.println("Игрок O одержал победу " + countGameO + " раз.");

                    if (ContinueToPlay().equals("y")) {
                    } else {
                        gameNotEnd = false;
                    }

                    gameContinue = false;
                } else if ((game[p][p + 2].equals(mark) && (game[p][p + 2]).equals(game[p + 1][p + 1])) && ((game[p + 1][p + 1]).equals(game[p + 2][p]))) {
                    System.out.println("Победил игрок " + mark);

                    if (mark.equals("X")) {
                        countGameX++;
                    } else {
                        countGameO++;
                    }

                    System.out.println("Игрок Х одержал победу " + countGameX + " раз.");
                    System.out.println("Игрок O одержал победу " + countGameO + " раз.");

                    if (ContinueToPlay().equals("y")) {
                    } else {
                        gameNotEnd = false;
                    }

                    gameContinue = false;
                }

                for (int i = 0; i < game.length; i++) {
                    int h = 0;
                    if (game[i][h].equals(mark) && ((game[i][h]).equals(game[i][h + 1])) && ((game[i][h + 1]).equals(game[i][h + 2]))) {
                        System.out.println("Победил игрок " + mark);

                        if (mark.equals("X")) {
                            countGameX++;
                        } else {
                            countGameO++;
                        }

                        System.out.println("Игрок Х одержал победу " + countGameX + " раз.");
                        System.out.println("Игрок O одержал победу " + countGameO + " раз.");

                        if (ContinueToPlay().equals("y")) {
                        } else {
                            gameNotEnd = false;
                        }

                        gameContinue = false;
                    } else if (game[h][i].equals(mark) && ((game[h][i]).equals(game[h + 1][i])) && ((game[h + 1][i]).equals(game[h + 2][i]))) {
                        System.out.println("Победил игрок " + mark);

                        if (mark.equals("X")) {
                            countGameX++;
                        } else {
                            countGameO++;
                        }

                        System.out.println("Игрок Х одержал победу " + countGameX + " раз.");
                        System.out.println("Игрок O одержал победу " + countGameO + " раз.");

                        if (ContinueToPlay().equals("y")) {
                        } else {
                            gameNotEnd = false;
                        }

                        gameContinue = false;
                    }
                    for(int j = 0; j < game.length; j++){
                        if(countTurn == 10){
                            System.out.println("Ничья.");
                            if (ContinueToPlay().equals("y")) {
                            } else {
                                gameNotEnd = false;
                            }

                            gameContinue = false;
                        }
                    }
                }


                countTurn++;

            }
        }

    }

    public static String[][] Computer(String[][] game, String mark) {
        Random rnd = new Random();
        int x = rnd.nextInt(3);
        int y = rnd.nextInt(3);

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
        return game;
    }

    public static String ContinueToPlay() {
        Scanner sc = new Scanner(System.in);
        String answer = null;
        while (true) {
            System.out.println();
            System.out.println("Продолжить игру? \n y - Да \n n - Нет");
            System.out.print("Ваш выбор: ");
            answer = sc.next();

            if (answer.equals("y") || answer.equals("n")) {
                break;
            } else {
                System.out.println("Ошибка. Повторите выбор.");
            }
        }
        return answer;

    }

}



