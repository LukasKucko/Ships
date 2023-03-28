package sk.lukas;

import java.util.Random;
import java.util.Arrays;

public class Ship {

  int c = 0;
  int h = 1;
  int ship = 0;
  char front = '●';
  int index, index2, index3, index4;
  Random rd = new Random();

  public void drawShipP1(char[][] p1) {

   index = rd.nextInt(p1.length);
   index2 = rd.nextInt(p1[0].length - 2);
   index3 = rd.nextInt(p1.length - 2);
   index4 = rd.nextInt(p1[0].length);

   for (int i = 0; i < p1.length; i++) {
    for (int j = 0; j < p1[0].length; j++){
       System.out.print(p1[i][j]);
      }
      System.out.println("X" + h);
      h++;
    }
    p1[index][index2] = front;
        p1[index][index2 + 1] = front;
        p1[index][index2 + 2] = front;
        p1[index3][index4] = front;
        p1[index3 + 1][index4] = front;
        p1[index3 + 2][index4] = front;

        if (index2 > p1.length) {
          index2 = index2 - 3;
        }

        if (index3 > p1[0].length) {
          index3 = index3 - 3;
        }
    System.out.println("1 2 34 5 67 89 10Y");
  }
  
  
 
 
 
  public void drawShipP2(char[][] p2) {

   index = rd.nextInt(p2.length);
   index2 = rd.nextInt(p2[0].length - 2);
   index3 = rd.nextInt(p2.length - 2);
   index4 = rd.nextInt(p2[0].length);

   for (int i = 0; i < p2.length; i++) {
    for (int j = 0; j < p2[0].length; j++){

        p2[index][index2] = front;
        p2[index][index2 + 1] = front;
        p2[index][index2 + 2] = front;
        p2[index3][index4] = front;
        p2[index3 + 1][index4] = front;
        p2[index3 + 2][index4] = front;

        if (index2 > p2.length) {
          index2 = index2 - 3;
        }

        if (index3 > p2[0].length) {
          index3 = index3 - 3;
        }
       System.out.print(p2[i][j]);
      }
      System.out.println("X" + h);
      h++;
    }
    System.out.println("1 2 34 5 67 89 10Y");
  }  
  
  
}
