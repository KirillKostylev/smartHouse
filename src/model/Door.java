package model;

import controller.ActionForSmartHouse;

public class Door implements ActionForSmartHouse {
    private boolean statusDoor;


    public void setStatusDoor(boolean statusDoor) {
        this.statusDoor = statusDoor;
    }

    @Override
    public void onExecute() {
        setStatusDoor(true);
        System.out.println("Door turn on");
    }

    @Override
    public void offExecute() {
        setStatusDoor(false);
        System.out.println("Door turn off");

    }
}
