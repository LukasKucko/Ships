package sk.lukas;

public class Board {
  
  Ship ship = new Ship();
  
  public void drawBoardP1(char[][] p1) {
  
  
  for (int i = 0; i < p1.length; i++) {
   for (int j = 0; j < p1[0].length; j++) {
        p1[i][j] = '□';
      }
    }
   ship.drawShipP1(p1);
  }
  
  
  public void drawBoardP2(char[][] p2) {

  for (int i = 0; i < p2.length; i++) {
   for (int j = 0; j < p2[0].length; j++) {
        p2[i][j] = '□';
      }
    }
   ship.drawShipP2(p2);
  }
  
  
}
