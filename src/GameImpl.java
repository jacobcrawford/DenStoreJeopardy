import javafx.util.Pair;

public class GameImpl implements Game {

    private ArticleFetcherStrategy fetcher;
    private WordRemoverStrategy remover;
    private String currentArticle;
    private String currentAnswer;

    public GameImpl(ArticleFetcherStrategy fetcher, WordRemoverStrategy remover) {
        this.fetcher = fetcher;
        this.remover = remover;
    }


    @Override
    public void getArticleFromWeb() {
        Article wordArticlePair = fetcher.fetchArticle();
        currentArticle =  wordArticlePair.getArticle();
        currentAnswer =  wordArticlePair.getSubject();
    }

    @Override
    public void getFinalArticle() {

        currentArticle = remover.replaceWordInText(currentAnswer,currentArticle,"XXX");
    }

    public String getCurrentArticle() {
        return currentArticle;
    }

    public String getCurrentAnswer() {
        return currentAnswer;
    }
}
