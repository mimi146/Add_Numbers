package org.example;

public class Add_Numbers {

    public int Sum(String numbers) {

        if(numbers.length() < 1) return  0;
        int total =0;
        for(int i =0; i< numbers.length(); i++) {

            char c = numbers.charAt(i);

            if(Character.isDigit(c)) {

                total +=  Character.getNumericValue(c);
            }
        }

        return  total;
    }
}
