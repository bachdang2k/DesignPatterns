package creationalPatterns.factoryMethod.factory;

import creationalPatterns.factoryMethod.Button;
import creationalPatterns.factoryMethod.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
