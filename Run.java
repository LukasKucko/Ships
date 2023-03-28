package sk.lukas;
import java.util.Scanner;

public class Run {
  
  
  Scanner sc = new Scanner(System.in);
  char startGame;
  char showShipX;
  char showShipY;
  
  Menu menu = new Menu();
  Player1 p = new Player1();
  
  public char[][] array = new char[10][10];
   public static char[][] p1 = new char[10][10];
   
    

  public void runShips(){
    
    
    menu.writeMenu(array);
    System.out.println("\n\n");
    
    startGame = sc.next().charAt(0);
    
    if(startGame == 'y'){
     System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      p.player1(p1);
System.out.println("\n\n\n\n\n\n\nZadaj pozíciu X:");
    } else{
      System.out.println("Tak nabudúce........");
    }
    
    
    
 }
}