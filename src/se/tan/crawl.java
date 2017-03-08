package se.tan;

/**
 * Created by indonesia-indicator on 3/8/2017.
 */
import java.io.IOException;
import javax.lang.model.util.Elements;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class crawl {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("http://www.tokopedia.com").get();
        org.jsoup.select.Elements links = doc.select("a[href]");
        for (Element link : links) {
            System.out.println("\nlink : " + link.attr("href"));
            System.out.println("text : " + link.text());

        }
    }
}

