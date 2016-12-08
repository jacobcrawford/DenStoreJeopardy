
public class WordRemover implements WordRemoverStrategy {

    @Override
    public String replaceWordInText(String word,String text,String replacement){
        return text.replaceAll(word,replacement);
    }



}
