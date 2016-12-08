import java.util.ArrayList;

public class MultipleWordsRemover implements WordRemoverStrategy {
    @Override
    public String replaceWordInText(String word, String text, String replacement) {
        //If the given string has a space. Consider given string as multiple strings
        System.out.println(word );
        if (word.contains(" ")) {
            //Put every word in list.
            ArrayList<String> times = new ArrayList<>();
            String current="";
            int index=0;
            for (Character c:word.toCharArray() ){
                if (c ==' ') {
                    times.add(current);
                    current = "";
                }else current +=c;
                if (index==word.toCharArray().length-1) times.add(current);
                index++;

            }
            //Remove all words from text.
            for (String s:times){
                text=text.replaceAll(s,replacement);
            }
            return text;
        }
        return text.replaceAll(word,replacement);
    }
}
