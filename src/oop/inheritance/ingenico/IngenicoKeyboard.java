package oop.inheritance.ingenico;

import oop.inheritance.tpv.Keyboard;

public class IngenicoKeyboard implements Keyboard {

    /**
     * @return key pressed
     */
    public String get() {
        return "Key pressed";
    }
}