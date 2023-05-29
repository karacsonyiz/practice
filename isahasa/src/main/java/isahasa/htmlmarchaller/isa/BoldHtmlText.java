package isahasa.htmlmarchaller.isa;

import isahasa.htmlmarchaller.HtmlText;

public class BoldHtmlText extends HtmlText {

    public BoldHtmlText(String text) {
        super(text);
    }

    @Override
    public String getPlainText() {
        return "<b>" + super.getPlainText() + "</b>";
    }
}
