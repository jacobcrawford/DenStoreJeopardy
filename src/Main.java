public class Main {
    public static void main(String[] args) {
        GameImpl game = new GameImpl(new FakeFetcher(), new MultipleWordsRemover());
        game.getArticleFromWeb();
        String answer = game.getCurrentAnswer();
        game.getFinalArticle();
        String finalArticle = game.getCurrentArticle();
        System.out.println(answer);
        System.out.println(finalArticle);

        JsoupFetcher downloader = new JsoupFetcher();

    }
}
