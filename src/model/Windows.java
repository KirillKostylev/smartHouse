package model;

import controller.ActionForSmartHouse;
import view.OutputData;

public class Windows implements ActionForSmartHouse {
    private boolean statusWindows;


    public void setStatusWindows(boolean statusWindows) {
        this.statusWindows = statusWindows;
    }

    @Override
    public void onExecute() {
        setStatusWindows(true);
        OutputData.output("Windows open");
    }

    @Override
    public void offExecute() {
        setStatusWindows(false);
        OutputData.output( "Windows close");

    }
}
