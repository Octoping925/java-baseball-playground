package util;

public final class Validator {
    public static boolean isNumeric(String inputStr) {
        try {
            Integer.parseInt(inputStr);
            return true;
        }
        catch(NumberFormatException e) {
            return false;
        }
    }

    public static boolean containsDuplicateNumber(String inputStr) {
        int inputNum = Integer.parseInt(inputStr);

        int bitmask = 0;
        while(inputNum > 0) {
            int lastNum = inputNum % 10;

            if((bitmask & (1 << lastNum)) > 0) {
                return true;
            }

            bitmask |= (1 << lastNum);
            inputNum /= 10;
        }

        return false;
    }
}
