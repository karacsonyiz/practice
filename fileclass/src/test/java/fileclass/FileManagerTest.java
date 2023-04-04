package fileclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FileManagerTest {

    private FileManager manager;
    private String testDirectory;

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Rule
    public final TemporaryFolder folder = new TemporaryFolder();

    @Before
    public void setUp() {
        manager = new FileManager();
        testDirectory = folder.getRoot().getAbsolutePath();

        createDirectories(testDirectory,"a", "b", "a/aa", "a/ab", "b/ba", "b/bb");
        createFiles(testDirectory,
                "a/a00.txt",
                "a/a01.csv",
                "a/aa/aa00.dat",
                "a/aa/aa01.txt",
                "b/b00.csv",
                "b/ba/ba00.txt",
                "b/bb/bb00.dat",
                "b/bb/bb01.txt"
                );
    }

    @After
    public void tearDown() {
        manager = null;
        testDirectory = null;
    }

    @Test
    public void testCreateFile() {
        //When
        manager.createFile(testDirectory + File.separator + "testFile.txt");
        //Then
        assertThat(new File(testDirectory + File.separator + "testFile.txt").exists(), is(true));
    }

    @Test
    public void existingFileShouldThrowException() {
        // Given
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("File with this name already exists");
        // When
        manager.createFile(testDirectory + File.separator + "testFile.txt");
        manager.createFile(testDirectory + File.separator + "testFile.txt");
    }

    @Test
    public void testSubDirectory() {
        //When
        manager.createSubDirectory(testDirectory, "testDir");
        //Then
        assertThat(new File(testDirectory, "testDir").exists(), is(true));
    }

    @Test
    public void existingDirectoryShouldThrowException() {
        // Given
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Directory with this name already exists");
        // When
        manager.createSubDirectory(testDirectory, "testDir");
        manager.createSubDirectory(testDirectory, "testDir");
    }

    @Test
    public void testDeleteFile() {
        //Given
        manager.createFile(testDirectory + File.separator + "toBeDeleted");
        //Then
        assertThat(manager.deleteFile(testDirectory + File.separator + "toBeDeleted"), is(true));
    }

    @Test
    public void missingFileShouldThrowException() {
        // Given
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("File with this name does not exists");
        // When
        manager.deleteFile(testDirectory + File.separator + "toBeDeleted");
    }

    @Test
    public void testFindDirectories() {
        //Given
        List<String> directories = new ArrayList<>();
        //When
        directories = manager.findDirectories(testDirectory);
        //Then
        assertThat(directories.size(), equalTo(6));
    }

    @Test
    public void testListFilesByExtension() {
        //When
        List<String> fileList = manager.listFilesByExtension(testDirectory + File.separator + "a/aa", "dat");
        //Then
        assertThat(fileList.size(), equalTo(1));
        assertThat(fileList.get(0), equalTo("aa00.dat"));
    }

    @Test
    public void nonexistentFileExtensionShouldThrowException() {
        // Given
        exception.expect(NullPointerException.class);
        exception.expectMessage("No files found with extension");
        // When
        manager.listFilesByExtension(testDirectory, "doc");
    }

    private void createDirectories(String prefix, String... paths) {
        for (String path: paths) {
            new File(prefix + File.separator + path.replace("/", File.separator)).mkdir();
        }
    }

    private void createFiles(String prefix, String... paths) {
        String path = null;
        try {
            for (String suffix : paths) {
                path = prefix + File.separator + suffix.replace("/", File.separator);
                new File(path).createNewFile();
            }
        }
        catch (IOException ioe) {
            throw new RuntimeException("Cannot create test file: " + path, ioe);
        }
    }

}
