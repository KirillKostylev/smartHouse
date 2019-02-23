package model;

import controller.ActionForSmartHouse;
import view.OutputData;

public class Door implements ActionForSmartHouse {
    private boolean statusDoor;


    public void setStatusDoor(boolean statusDoor) {
        this.statusDoor = statusDoor;
    }

    @Override
    public void onExecute() {
        setStatusDoor(true);
        OutputData.output("Door open");
    }

    @Override
    public void offExecute() {
        setStatusDoor(false);
        OutputData.output("Door close");

    }
}
