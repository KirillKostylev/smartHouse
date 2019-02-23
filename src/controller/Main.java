package controller;

import model.SmartHouse;

import static tool.InputData.inputString;
import static view.OutputData.output;

public class Main {
    public static void main(String[] args) {
        String choiseAction = inputString("Choose action:\n1 - Turn on\n2 - Turn off\nAnswer: ");
        String ans = inputString("1 - Light\n2 - Windows\n3 - Door\nAnswer: ");

        ActionForSmartHouse afsh = SmartHouse.createDB().get(ans); // получение объекта из HashMap

        if (choiseAction.equals("1")) {
            afsh.onExecute();
        } else if (choiseAction.equals("2")) {
            afsh.offExecute();
        } else
            output("Error");
    }
}
