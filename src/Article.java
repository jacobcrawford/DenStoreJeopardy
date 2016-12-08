public class Article {
    private final String article;
    private final String subject;

    public Article(String subject, String article) {
        this.article = article;
        this.subject = subject;
    }

    public String getArticle() {
        return article;
    }

    public String getSubject() {
        return subject;
    }


}
