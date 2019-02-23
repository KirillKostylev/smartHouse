package model;

import controller.ActionForSmartHouse;
import view.OutputData;

public class Light implements ActionForSmartHouse {
    private boolean statusLight;


    public void setStatusLight(boolean statusLight) {
        this.statusLight = statusLight;
    }

    @Override
    public void onExecute() {
        setStatusLight(true);
        OutputData.output("Light turn on");
    }

    @Override
    public void offExecute() {
        setStatusLight(false);
        OutputData.output( "Light turn off");
    }
}
