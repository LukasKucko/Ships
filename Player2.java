package sk.lukas;

public class Player2 {
    Board board = new Board();
    public static char[][] p2 = new char[10][10];
    
    public void player1(char[][]p2){
    
    
    board.drawBoardP1(p2);
  }
    
    
    public static void main(String[] args){
    
    
    Player2 pl = new Player2();
    pl.player1(p2);
 }
    
}
