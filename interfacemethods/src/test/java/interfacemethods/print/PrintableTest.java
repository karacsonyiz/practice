/*
package interfacemethods.print;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PrintableTest {

    @Test
    public void testGetColorWithDefaultImplementation() {
        Printable printable = new TestPrintable();
        assertThat(printable.getColor(0), equalTo(Printable.BLACK));
    }

    @Test
    public void testCountNumberOfColoredPrintables() {
        NewsPaper newspaper = new NewsPaper();
        newspaper.addPage("Page1");

        StoryBook blackAndWhiteStoryBook = new StoryBook();
        blackAndWhiteStoryBook.addPage("Page1", Printable.BLACK);
        blackAndWhiteStoryBook.addPage("Page2", Printable.BLACK);

        StoryBook coloredStoryBook = new StoryBook();
        coloredStoryBook.addPage("Page1", Printable.BLACK);
        coloredStoryBook.addPage("Page2", "#FF0000");

        List<Printable> printables = Arrays.asList(newspaper, blackAndWhiteStoryBook, coloredStoryBook);
        assertThat(Printable.countNumberOfColoredPrintables(printables), equalTo(1));
    }
}

 */
