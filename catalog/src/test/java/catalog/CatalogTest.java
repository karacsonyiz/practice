package catalog;

import java.util.Arrays;

import static catalog.SearchCriteria.createByBoth;
import static catalog.SearchCriteria.createByContributor;
import static catalog.SearchCriteria.createByTitle;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CatalogTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();


    public CatalogItem catalogItem1 = new CatalogItem("R-1",300,
                    new catalog.AudioFeatures("Night Visions", 185, Arrays.asList("Dan Raynolds"),Arrays.asList("Imagine Dragons")),
                    new PrintedFeatures("Harry Potter",600,  Arrays.asList("J.K. Rowling")),
                    new catalog.AudioFeatures("Piece of Mind", 200, Arrays.asList("Steve Harris"),Arrays.asList("Iron Maiden"))

    );

   public CatalogItem catalogItem2 = new CatalogItem("R- 2",300,
                    new PrintedFeatures("Harry Potter",500,  Arrays.asList("J.K. Rowling"))
    );


    public CatalogItem catalogItem3 = new CatalogItem("R-3", 300,
                    new catalog.AudioFeatures("Californication",100,  Arrays.asList("Flea"), Arrays.asList("RHCP"))
    );

   public Catalog catalog = new Catalog();


    @Test
    public void testAddAndDeleteItem() {
        catalog.removeAllItems();
        assertThat(Catalog.catalogItems.size(), is(0));
        catalog.addItem(catalogItem1);
        assertThat(Catalog.catalogItems.size(), is(1));
        catalog.deleteItemByRegistrationNumber("R-1");
        assertThat(Catalog.catalogItems.size(), is(0));
    }


    @Test
    public void testGetAudioLibraryItems() {
        catalog.removeAllItems();
        catalog.addItem(catalogItem1);
        catalog.addItem(catalogItem2);
        assertThat(Catalog.getAudioLibraryItems().size(), is(1));

    }

    @Test
    public void testGetPrintedLibraryItems() {

        catalog.removeAllItems();
        catalog.addItem(catalogItem1);
        catalog.addItem(catalogItem2);
        assertThat(Catalog.getPrintedLibraryItems().size(), is(2));
    }

    @Test
    public void testGetAllPageNumber() {

        catalog.removeAllItems();
        catalog.addItem(catalogItem1);
        catalog.addItem(catalogItem2);
        assertThat(catalog.getAllPageNumber(), is(1100));
    }




    @Test
    public void testGetFullLength() {

        catalog.removeAllItems();
        catalog.addItem(catalogItem1);
        catalog.addItem(catalogItem2);
        catalog.addItem(catalogItem3);
        assertThat(catalog.getFullLength(), is(485));
    }



    @Test
    public void testAveragePageWithIllegalArgument() {
        catalog.addItem(catalogItem1);
        catalog.addItem(catalogItem2);
        catalog.addItem(catalogItem3);

        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Page number must be positive");
        catalog.averagePageNumberOver(0);
    }



    @Test
    public void testAveragePageWithZero() {
        catalog.addItem(catalogItem1);
        catalog.addItem(catalogItem2);
        catalog.addItem(catalogItem3);

        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("No page");
        catalog.averagePageNumberOver(10000);
    }



    @Test
    public void testAveragePageNumberOverVariable() {

        catalog.addItem(catalogItem1);
        catalog.addItem(catalogItem2);
        catalog.addItem(catalogItem3);
        assertThat(catalog.averagePageNumberOver(100), is(550.0));
        assertThat(catalog.averagePageNumberOver(501), is(600.0));
    }


    @Test
    public void testFindByCriteriaBoth() {

        catalog.removeAllItems();
        SearchCriteria searchCriteria = createByBoth("Night Visions", "Dan Raynolds");
        catalog.addItem(catalogItem1);
        catalog.addItem(catalogItem2);
        assertThat(catalog.findByCriteria(searchCriteria).size(), is(1));
        assertThat(catalog.findByCriteria(searchCriteria).get(0).getFeatures().get(0).getTitle(), is("Night Visions"));
    }



    @Test
    public void testFindByCriteriaContributor() {

        catalog.removeAllItems();
        SearchCriteria searchCriteria = createByContributor("Imagine Dragons");
        catalog.addItem(catalogItem1);
        assertThat(catalog.findByCriteria(searchCriteria).size(), is(1));
    }

    @Test
    public void testFindByCriteriaTitle() {

        catalog.removeAllItems();
        SearchCriteria searchCriteria = createByTitle("Harry Potter");
        catalog.addItem(catalogItem1);
        assertThat(catalog.findByCriteria(searchCriteria).size(), is(1));
    }


}


