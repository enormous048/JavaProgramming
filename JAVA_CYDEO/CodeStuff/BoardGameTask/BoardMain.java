package CodeStuff.BoardGameTask;

import java.util.*;

public class BoardMain {
    public static void main(String[] args) {
        List<DominoGame> games = new ArrayList<>();
        List<ChessGame> games2 = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            DominoGame gameD = new DominoGame("", 0, 0);
            scan.nextLine();
            System.out.println("Enter the name of Game: ");
            String name = scan.nextLine();
            gameD.setName(name);

            System.out.println("Enter the weight of figure: ");
            int weightFigure = scan.nextInt();
            gameD.setWeigthFigure(weightFigure);

            System.out.println("Enter the weight of box: ");
            int weightBoard = scan.nextInt();
            gameD.setWeigthBox(weightBoard);
            System.out.println();

            gameD.setTotal(weightBoard, weightFigure);
            games.add(gameD);
        }
        for (int i = 0; i < 3; i++) {
            ChessGame gameC = new ChessGame("", 0, 0);

            scan.nextLine();
            System.out.println("Enter the name of Game: ");
            String name = scan.nextLine();
            gameC.setName(name);

            System.out.println("Enter the weight of figure: ");
            int weightFigure = scan.nextInt();
            gameC.setWeigthFigure(weightFigure);

            System.out.println("Enter the weight of board: ");
            int weightBoard = scan.nextInt();
            gameC.setWeigthDoshka(weightBoard);
            System.out.println();

            gameC.setTotal(weightBoard, weightFigure);
            games2.add(gameC);
        }
        System.out.println("                          ENTERED GAMES");
        for (DominoGame game : games) {
            double total = 0.0;
            total = game.getTotal();

            System.out.print("| Name = "+ game.getName()+  " ".repeat(24-game.getName().length()) +"|");
            System.out.print(" Total weigth = "+total+ " ".repeat(24-String.valueOf(total).length())+ "|");
            System.out.println();

        }
        for (ChessGame game : games2) {
            double total = 0.0;
            total = game.getTotal();


            System.out.print("| Name = "+ game.getName()+  " ".repeat(24-game.getName().length()) +"|");
            System.out.print(" Total weigth = "+total+ " ".repeat(24-String.valueOf(total).length())+ "|");
            System.out.println();
        }
        double totalChess= 0;
        double totalDomino = 0;

        TreeMap<Double, String > map = new TreeMap<>();
        for (int i = 0; i <= games.size()-1; i++) {
            map.put(games.get(i).getTotal(), games.get(i).getName());
            totalDomino+=games.get(i).getTotal();
        }
        for (int i = 0; i <= games2.size()-1; i++) {
            map.put(games2.get(i).getTotal(), games2.get(i).getName());
            totalChess+=games2.get(i).getTotal();
        }

        System.out.println("                         SORTED GAMES");
        for (Map.Entry<Double, String> entry : map.entrySet()) {
            System.out.print("| Name = "+ entry.getValue()+  " ".repeat(24-entry.getValue().length()) +"|");
            System.out.print(" Total weigth = "+entry.getKey()+ " ".repeat(24-String.valueOf(entry.getKey()).length())+ "|");
            System.out.println();
        }
        System.out.println("Total weight of all Domino games: "+ totalDomino);
        System.out.println("Total weight of all Chess games: "+ totalChess);
        System.out.println("Total weight of all games: "+ (totalChess+totalDomino));
    }
}
