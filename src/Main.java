import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // put these in tests
//        GameImpl game = new GameImpl(new FakeFetcher(), new WordRemover());
//        game.fetchArticleFromWeb();
//        game.getArticleContent();
//        System.out.println(game.guess("Aarup"));
//
//        game = new GameImpl(new JsoupFetcher(), new WordRemover());
//        game.fetchArticleFromWeb();
//        System.out.println(game.getArticleContent());
//        System.out.println(game.guess("overtro"));


        // Used for testing JSoup
//        Document document = null;
//        try {
//            document = Jsoup.connect(Category.BIL_BÅD_FLY_MM).get();
//        } catch (IOException ignored) {
//        }
//        Elements paragraphs = document.select(".slider a");
//        for (Element e : paragraphs) System.out.println(e.outerHtml());
    }
}
