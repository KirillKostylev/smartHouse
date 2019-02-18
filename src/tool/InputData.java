package tool;

import view.OutputData;

import java.util.Scanner;

public class InputData {
    public static String inputString(String str){
        OutputData.output(str);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
