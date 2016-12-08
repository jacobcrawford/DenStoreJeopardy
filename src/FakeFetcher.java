public class FakeFetcher implements ArticleFetcherStrategy {
    @Override
    public Article fetchArticle() {
        return new Article("Bjørnstjerne Bjørnson","Bjørnstjerne Bjørnson, Bjørnstjerne Martinius Bjørnson, 8.12.1832-26.4.1910, norsk forfatter. Ligesom den jævnaldrende Henrik Ibsen har Bjørnstjerne Bjørnson sat sit dybe præg på norsk litteratur og på omverdenens billede af Norge efter 1814. Men til forskel fra Ibsen havde Bjørnson egenskaber, der gjorde ham til en folkelig førerskikkelse. Han kunne begejstres og begejstre, var sikker på sin mission og havde et ukueligt optimistisk livssyn.");
    }
}
