public class processHM {


public static String proc(Character answer, String word){


for(int i =0;i<word.length();i++){
    if(Character.toUpperCase(answer)==word.charAt(i)){
word= word.replace(word.charAt(i), answer);
}
    }

return word;
    }



public static boolean proc2(Character answer, String word){
    
        
        
        for(int i =0;i<word.length();i++){
            if(Character.toUpperCase(answer)==Character.toUpperCase(word.charAt(i))){
return true;
}
            } 
        
                gameLogic.hangMan(word);
           
return true;
        }
}