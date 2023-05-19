package interfacemethods.print;

import java.util.List;

public interface Printable {

    String BLACK = "#000000";

    int getLength();

    String getPage(int pageNumber);

    default String getColor(int page) {
        return BLACK;
    }

    static int countNumberOfColoredPrintables(List<Printable> printableList) {
        int coloredPrintables = 0;
        for (Printable printable : printableList) {
            for (int i = 0; i < printable.getLength(); i++) {
                if (!printable.getColor(i).equals(Printable.BLACK)) {
                    coloredPrintables += 1;
                }
            }
        }
        return coloredPrintables;
    }
}
