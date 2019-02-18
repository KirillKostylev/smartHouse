package controller;

import model.Door;
import model.Light;
import model.Windows;

import java.util.HashMap;

import static tool.InputData.inputString;
import static view.OutputData.output;

public class SmartHouse {
    public static void main(String[] args) {
        String choiseAction = inputString("Choose action:\n1 - Turn on\n2 - Turn off\nAnswer: ");
        String ans = inputString("1 - Light\n2 - Windows\n3 - Door\nAnswer: ");


        HashMap<String, ActionForSmartHouse> allAction = new HashMap<>();
        Light light = new Light();
        Windows windows = new Windows();
        Door door = new Door();
        allAction.put("1", light);
        allAction.put("2", windows);
        allAction.put("3", door);
        ActionForSmartHouse afsh = allAction.get(ans);

        if (choiseAction.equals("1")) {
            afsh.onExecute();
        } else if (choiseAction.equals("2")) {
            afsh.offExecute();
        } else output("Error");

    }
}