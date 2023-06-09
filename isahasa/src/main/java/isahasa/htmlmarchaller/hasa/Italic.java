package isahasa.htmlmarchaller.hasa;

import isahasa.htmlmarchaller.TextSource;

public class Italic extends TextDecorator {

    TextSource textSource;

    public Italic(TextSource textSource) {
        this.textSource = textSource;
    }

    @Override
    public String getPlainText() {
        return "<i>" + textSource.getPlainText() + "</i>";
    }

}
