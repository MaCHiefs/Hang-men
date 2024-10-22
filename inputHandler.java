import java.util.Scanner;
public class inputHandler {
    
public static void input(String guessWord){
    Scanner kachow = new Scanner(System.in);
   for(int i =0; i < guessWord.length();i++){
System.out.print('_');

   }System.out.println();


char answer = kachow.next().charAt(0);




kachow.close();
    }
}
