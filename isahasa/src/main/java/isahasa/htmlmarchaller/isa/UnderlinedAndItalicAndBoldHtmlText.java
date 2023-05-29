package isahasa.htmlmarchaller.isa;

import isahasa.htmlmarchaller.HtmlText;

public class UnderlinedAndItalicAndBoldHtmlText extends HtmlText {

    public UnderlinedAndItalicAndBoldHtmlText(String text) {
        super(text);
    }

    @Override
    public String getPlainText() {
        return "<u><i><b>" + super.getPlainText() + "</b></i></u>";
    }
}
