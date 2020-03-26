package oop.inheritance.verifone.vx690;

import oop.inheritance.tpv.Display;

public class VerifoneVx690Display implements Display {
    private static VerifoneVx690Display Vx690Display;

    private VerifoneVx690Display(){

    }

    public static VerifoneVx690Display getInstance(){
        if(Vx690Display == null){
            Vx690Display = new VerifoneVx690Display();
        }
        return Vx690Display;
    }
    /**
     * Prints a message to specied position
     *
     * @param x       horizontal position
     * @param y       vertical position
     * @param message message to be printed
     */
    public void showMessage(int x, int y, String message) {
    }

    /**
     * Clears the screen
     */
    public void clear() {

    }
}
