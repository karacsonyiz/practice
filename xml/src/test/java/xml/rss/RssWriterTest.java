package xml.rss;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class RssWriterTest {

    RssWriter rssWriter = new RssWriter();

    @Test
    public void writeRssTest(){
        Channel channel = new Channel("Yellowroad","yellowroad.hu","rttc",
                Arrays.asList(new Item("Java","yellowroad.training360.com/java","best"))
        );

        assertThat(rssWriter.writeRss(channel), equalTo("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>" +
                "<rss>" +
                 "<channel>" +
                   "<title>Yellowroad</title>" +
                   "<link>yellowroad.hu</link>" +
                   "<description>rttc</description>" +
                   "<item>" +
                    "<title>Java</title>" +
                    "<link>yellowroad.training360.com/java</link>" +
                    "<description>best</description>" +
                   "</item>" +
                 "</channel>" +
                "</rss>"));

    }

}