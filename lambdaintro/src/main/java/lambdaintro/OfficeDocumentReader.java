package lambdaintro;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class OfficeDocumentReader {


    public List<File> listOfficeDocuments(File root) {
        createDirectories(root.getAbsolutePath(), "dir.xlsx", "dir2.docx");

        createFiles(root.getAbsolutePath(),
                "a.txt",
                "b.txt",
                "p.pptx",
                "a.xlsx",
                "c.csv",
                "e.docxv",
                "f.docx",
                "z.DOCX",
                "z.xls",
                "zxls"
        );

        Arrays.sort(root.listFiles());

        return Arrays.asList(root.listFiles());
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
