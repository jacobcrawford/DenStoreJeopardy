public class GameImpl implements Game {

    private ArticleFetcherStrategy fetcher;
    private WordRemover remover;
    private Article article;

    public GameImpl(ArticleFetcherStrategy fetcher, WordRemover remover) {
        this.fetcher = fetcher;
        this.remover = remover;
    }

    @Override
    public void fetchArticleFromWeb() {
        article = fetcher.fetchArticle(Category.BIL_BÅD_FLY_MM);
    }

    @Override
    public boolean guess(String guess) {
        return article.getSubject().equals(guess);
    }

    @Override
    public String getArticleContent() {
        return remover.replaceWordInText(article.getSubject(), article.getArticle(), "XXX");
    }
}
