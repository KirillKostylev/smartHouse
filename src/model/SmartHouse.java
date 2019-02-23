package model;

import controller.ActionForSmartHouse;
import model.Door;
import model.Light;
import model.Windows;

import java.util.HashMap;

public class SmartHouse {
    public static HashMap<String, ActionForSmartHouse> createDB() {
        HashMap<String, ActionForSmartHouse> allAction = new HashMap<>();

        Light light = new Light();
        Windows windows = new Windows();
        Door door = new Door();

        allAction.put("1", light);
        allAction.put("2", windows);
        allAction.put("3", door);

        return allAction;
    }


}