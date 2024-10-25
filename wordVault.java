import java.util.Random;

public class wordVault{
    
    public static String wordMethod(){
String[] wordVault = {"SLEEP","VENOM","DOG","WASTE","LOVE","TAXES","MELANCHOLY"};
Random rand = new Random();

return wordVault[rand.nextInt(wordVault.length)];




    }
}