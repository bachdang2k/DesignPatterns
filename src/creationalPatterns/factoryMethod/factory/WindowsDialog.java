package creationalPatterns.factoryMethod.factory;

import creationalPatterns.factoryMethod.Button;
import creationalPatterns.factoryMethod.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
