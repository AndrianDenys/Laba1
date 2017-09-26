import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.FileWriter;



import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("CSVfile.csv");

        Document doc = Jsoup.connect("https://rozetka.com.ua/ua/fitnes-trekery/c4627554/").get();
        Elements elements = doc.select("div.g-i-tile-i-box-desc");
        for (Element tile:elements){
            String str1 = tile.select("div.g-i-tile-i-title").select("a").first().html();
            String str2 = tile.select("span.g-rating-reviews").html();

            /*writer.append(str1, str2);
            writer.append(('\n'));*/
        }

        for (Element tile: elements) {
            System.out.println(tile.select("div.g-i-tile-i-title").select("a").first().html() + ":"  + tile.select("span.g-rating-reviews").first().html());
        }

s
}


    }

