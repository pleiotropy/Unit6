public class NumberConverter {
    String[] digits;
    int base;
    private final String ALL_DIGITS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz+/";


    public NumberConverter(String number, int base) {
        digits = new String[number.length()]; // makes an int array the same length as the length of numberAsString
        for (int i = 0; i < number.length(); i++) { // for each item in the int array...
            String single = number.substring(i,i+1); // single is one character of the number
            digits[i] = single; // set the corresponding array item equal to the single character as an integer
        }
        this.base = base;
    }

    public String displayOriginalNumber() {
        String o = "";
        for (int i = 0; i < digits.length; i++) {
            o = o + digits[i];
        }
        return o;
    }

    public String[] getDigits() {
        return digits;
    }

    public int convertToDecimal() {
        int sum = 0;
        for (int i = 0; i < displayOriginalNumber().length(); i++) {
            String single = displayOriginalNumber().substring(i, i + 1); // single is one character of the number
            // must look up the value of the single instead of just converting to integer
            int digit = ALL_DIGITS.indexOf(single); // d is that single character as integer
            int exponent = displayOriginalNumber().length() - 1 - i;
            sum += digit * Math.pow(base, exponent);
        }
        return sum;
    }

    public String convertFromDecimal(int quotient, int targetBase) { // from decimal
        String convertedNumber = "";
        while (quotient > 0) {
            int remainder = quotient % targetBase;
            quotient = quotient / targetBase;
            convertedNumber = ALL_DIGITS.charAt(remainder) + convertedNumber;
        }
        return convertedNumber;
    }

    public int[] convertToOctal() {
        return null;
    }
}

