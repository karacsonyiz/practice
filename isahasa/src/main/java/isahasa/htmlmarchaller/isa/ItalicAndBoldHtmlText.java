package isahasa.htmlmarchaller.isa;

import isahasa.htmlmarchaller.HtmlText;

public class ItalicAndBoldHtmlText extends HtmlText {

    public ItalicAndBoldHtmlText(String text) {
        super(text);
    }

    @Override
    public String getPlainText() {
        return "<i><b>" + super.getPlainText() + "</b></i>";
    }
}
