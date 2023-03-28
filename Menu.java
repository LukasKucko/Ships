package sk.lukas;

public  class Menu {
   
   
   int n = 1;
   
   public void writeMenu(char[][] array) {
     
    System.out.print("                ---SHIPS---\n\nVitaj v hre Ships,pravidlá sú jednoduché.\nPrvý hráč tipuje pozíciu lodičiek toho druhého,\npodľa polohy lodičky v poli.\n\n");
     
    System.out.println("Napriklad:\n");
   
    for(int i = 0; i < array.length; i++){
     for(int j = 0; j < array[0].length;j++){
        array[i][j] = '□';
        array[3][3] = '●';
        array[3][4] = '●';
        array[3][5] = '●';
        System.out.print(array[i][j]);
       }
      System.out.println("X" + n);
      n++;
     }
    System.out.println("1 2 34 5 67 8910Y");
    
   
   System.out.println("\nTu sa lodička nachádza na pozícii \nX4Y4 , X4Y5 a X4Y6.Každí hráč má vždy len \njeden pokus.Ak uhádne pozíciu,odokryje sa mu \npolíčko s farbou lodičky - ●. Ak neuhádne,\nodokryje sa mu voda - □.Vyhráva ten,kto prvý \nodkryje všetky pozície súperovych lodičiek.\nVEĽA ŠŤASTIA\n\nStart game?(y/n)\n");
   }
 }
