import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class JsoupFetcher implements ArticleFetcherStrategy {
    private Document doc;

    @Override
    public Article fetchArticle(String category) {
        String articleURL = getRandomArticleURL(Category.BIL_BÅD_FLY_MM);
        try {
            doc = Jsoup.connect(articleURL).get();
        } catch (IOException ignored) {
        }

        return new Article(getTitle(), getContent());
    }

    private String getTitle() {
        String title = doc.title();
        title = title.split("\\|")[0].trim();
        return title;
    }

    private String getContent() {
        Elements paragraphs = doc.select(".body-content > p");

        if (paragraphs == null) {
            System.out.println("Unable to download article");
            return null;
        }

        for (Element e : new ArrayList<>(paragraphs)) {
            if (e.text().equals("")) paragraphs.remove(e);
        }
        return paragraphs.first().text();
    }

    private String getRandomArticleURL(String category) {
        return "http://denstoredanske.dk/Geografi_og_historie/Folkeslag/Etnografiske_termer/overtro";
    }
}
