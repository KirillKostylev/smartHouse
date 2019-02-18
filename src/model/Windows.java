package model;

import controller.ActionForSmartHouse;

public class Windows implements ActionForSmartHouse {
    private boolean statusWindows;


    public void setStatusWindows(boolean statusWindows) {
        this.statusWindows = statusWindows;
    }

    @Override
    public void onExecute() {
        setStatusWindows(true);
        System.out.println("Windows turn on");
    }

    @Override
    public void offExecute() {
        setStatusWindows(false);
        System.out.println( "Windows turn off");

    }
}
