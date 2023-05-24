public class NumberConverter {
    int[] digits;
    int base;

    public NumberConverter(int number, int base) {
        String numberAsString = Integer.toString(number); // makes a string representing the number
        digits = new int[numberAsString.length()]; // makes an int array the same length as the length of numberAsString
        for (int i = 0; i < numberAsString.length(); i++) { // for each item in the int array...
            String single = numberAsString.substring(i,i+1); // single is one character of the number
            int d = Integer.parseInt(single); // d is that single character as integer
            digits[i] = d; // set the corresponding array item equal to the single character as an integer
        }
        this.base = base;
    }

    public String displayOriginalNumber() {
        String o = "";
        for (int i = 0; i < digits.length; i++) {
            o = o + digits[i];
        }
        //o = o + "\n";
        return o;
    }

    public int[] getDigits() {
        return digits;
    }

    public int convertToDecimal() {
        int sum = 0;
        for (int i = 0; i < displayOriginalNumber().length(); i++) {
            String single = displayOriginalNumber().substring(i, i + 1); // single is one character of the number
            int digit = Integer.parseInt(single); // d is that single character as integer
            int exponent = displayOriginalNumber().length() - 1 - i;
            sum += digit * Math.pow(base, exponent);
        }
        return sum;
    }

    public String convertFromDecimal(int quotient, int targetBase) { // from decimal
        String convertedNumber = "";
        //int placeValue = 0;
        while (quotient > 0) {
            int remainder = quotient % targetBase;
            quotient = quotient / targetBase;
            //placeValue++;
            convertedNumber = remainder + convertedNumber;
        }
        return convertedNumber;
    }

    public int[] convertToOctal() {
        return null;
    }
}

