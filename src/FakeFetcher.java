import javafx.util.Pair;

public class FakeFetcher implements WordFetcherStrategy {
    @Override
    public Article fetchWordArticlePair() {
        return new Article("Aarup","Aarup, by på Vestfyn; 3120 indb. (2014). Aarup ligger i Assens Kommune. Byen er vokset op som stationsby efter 1865; her ligger elektronik- og skumgummivirksomheder.");
    }
}
