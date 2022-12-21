package util;

import baseball.BaseballGameStatus;
import baseball.BaseballSwing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class InputReader {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static String readLine() {
        try {
//        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            return br.readLine();
        }
        catch(IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static BaseballSwing readSwingNumber() throws IllegalArgumentException {
        return BaseballSwing.create(readLine());
    }

    public static BaseballGameStatus readRestartCommand() throws IllegalArgumentException {
        return BaseballGameStatus.getByCommand(readLine());
    }
}
