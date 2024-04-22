package creationalPatterns.abstractFactory.factories;

import creationalPatterns.abstractFactory.buttons.Button;
import creationalPatterns.abstractFactory.checkboxes.Checkbox;

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();

}
