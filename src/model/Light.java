package model;

import controller.ActionForSmartHouse;

public class Light implements ActionForSmartHouse {
    private boolean statusLight;


    public void setStatusLight(boolean statusLight) {
        this.statusLight = statusLight;
    }

    @Override
    public void onExecute() {
        setStatusLight(true);
        System.out.println("Light turn on");
    }

    @Override
    public void offExecute() {
        setStatusLight(false);
        System.out.println( "Light turn off");
    }
}
