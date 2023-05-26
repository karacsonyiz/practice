package isahasa.htmlmarchaller;

public class HtmlText implements TextSource {

    private String text;

    public HtmlText(String text) {
        this.text = text;
    }

    @Override
    public String getPlainText() {
        return text;
    }
}
