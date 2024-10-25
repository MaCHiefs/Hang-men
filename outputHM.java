public class outputHM {

    public static void oPut(String word){

    String refWord = word.toUpperCase();


for(int i = 0 ;i<word.length();i++){
    if(word.charAt(i)==refWord.charAt(i)){
System.out.print("_");
    }
    else if(word.charAt(i)!=refWord.charAt(i)){
System.out.print(refWord.charAt(i));    
    }
}

    }
}