/**
 * Created by Jacob on 12/8/2016.
 */
public class Article {
    private String article;
    private String subject;

    public Article(String subject,String article) {
        this.article = article;
        this.subject = subject;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
