package isahasa.htmlmarchaller;

public class HtmlText implements TextSource {

    private String text;

    public HtmlText(String text) {
        this.text = text;
    }

    @Override
    public String getPlainText() {
        isEmpty(text);
        return text;
    }

    public void isEmpty(String text) {
        if(text == null ||text.equals("")) {
            throw new IllegalArgumentException("Text can not be empty!");
        }
    }
}
