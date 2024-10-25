import java.util.*;
public class mainHM{
    public static void main(String args[]){
String PICKword =wordList.wordBank();
Scanner eskaner = new Scanner(System.in);
boolean Return;


outputHM.oPut(PICKword);

do{
System.out.println();
Character answer = eskaner.next().charAt(0);


Return = processHM.proc2(answer, PICKword);
 PICKword= processHM.proc(answer, PICKword);
gameLogic.winCondition(PICKword);

outputHM.oPut(PICKword);
System.out.println();
}while(Return==true);


eskaner.close();
    }
}