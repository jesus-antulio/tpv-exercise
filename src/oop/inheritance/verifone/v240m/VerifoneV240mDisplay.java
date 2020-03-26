package oop.inheritance.verifone.v240m;


import oop.inheritance.tpv.Display;

public class VerifoneV240mDisplay implements Display {

    private static VerifoneV240mDisplay v240Display;

    private VerifoneV240mDisplay(){

    }

    public static VerifoneV240mDisplay getInstance(){
        if(v240Display == null){
            v240Display = new VerifoneV240mDisplay();
        }
        return v240Display;
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
