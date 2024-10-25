import java.util.Random;
public class wordList{
    public static String wordBank(){
Random rand = new Random();

String[] wordBank= {"SCHOOL","WHEEL","BLACKBOARD","PURPLE","SPEAKER","DOG","LION","CHAIR",
"TIME","LOVE","NOSTALGIA","ANGUISH","WOOD","GINGER","TELEVISION","SHORT","CONSTRUCTION","HOUSE","TABLE","REMOTE","BOOK","PERSON","LAPTOP",
"BOX","LIGHT","PAPER","COMB","PNEUMONOULTRAMICROSCOPICSILICOVOLCANOCONIOSIS"};
String chosenWord = wordBank[rand.nextInt(wordBank.length)];

return chosenWord;
    }
}