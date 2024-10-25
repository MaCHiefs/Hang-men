public class gameLogic{
public static int lives =0;
    

public static void winCondition(String PICKword){
System.out.println();
if(PICKword == PICKword.toLowerCase()){
    System.out.println(PICKword.toUpperCase());
    System.out.println("You WON");
    System.out.println("Naa kay free kiss nako");
    
    System.exit(0);
}
}



public static void HangMan(String correctAnswer){
    lives++;

    switch(lives){
        case 1: System.out.printf("%40c\n",'O');
        break;
        case 2: System.out.printf("%40c\n",'O');
                System.out.printf("%40c",'|');
        break;
        case 3: System.out.printf("%40c\n",'O');
                System.out.printf("%39c|",'-');
        break;
        case 4: System.out.printf("%40c\n",'O');
                System.out.printf("%39c|-",'-');
        break;
        case 5: System.out.printf("%40c\n",'O');
                System.out.printf("%39c|-\n",'-');
                System.out.printf("%39c",'/');
        break;
        case 6:  System.out.printf("%40c\n",'O');
                 System.out.printf("%39c|-\n",'-');
                 System.out.printf("%39c \\",'/');
        break;
    };



if(lives==6){
    System.out.println();
System.out.println("The correct answer is: "+ correctAnswer.toUpperCase());
System.out.println("You lost");
System.exit(0);

}


}
    }