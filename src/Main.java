public class Main {
    public static void main(String[] args) {
        GameImpl game = new GameImpl(new FakeFetcher(), new WordRemover());
        game.getArticleFromWeb();
        String answer = game.getCurrentAnswer();
        game.getFinalArticle();
        String finalArticle = game.getCurrentArticle();
        System.out.println(finalArticle);
        System.out.println(answer);
    }
}
