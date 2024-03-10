public class EvenLengthWordsStrings {

    public static void main(String[] args) {
        String s = "I am Geek";
        String[] words = s.split(" ");
        for(String word: words){
            if(word.length()%2 == 0){
                System.out.println(word);
            }
        }




    }
}
