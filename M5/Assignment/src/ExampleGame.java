
/** driver. */
public class ExampleGame {
   public static void main(String[] args) {
   
      long start = System.nanoTime();
   
      WordSearchGame game = WordSearchGameFactory.createGame();
      game.loadLexicon("words.txt");
      game.setBoard(new String[]{"E", "E", "C", "A", "A", "L", "E", "P", "H", 
                                 "N", "B", "O", "Q", "T", "T", "Y"});
      System.out.print("LENT is on the board at the following positions: ");
      System.out.println(game.isOnBoard("LENT"));
      System.out.print("POPE is not on the board: ");
      System.out.println(game.isOnBoard("POPE"));
      System.out.println("All words of length 6 or more: ");
      System.out.println(game.getAllScorableWords(6));
   
      long end = System.nanoTime();
      long totalTime = end - start;
      System.out.println("Execution time: " + totalTime + "ns");
   }
}