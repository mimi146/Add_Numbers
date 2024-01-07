package org.example;

public class Add_Numbers {

    public int Add(String numbers) {

        if(numbers.isEmpty()) return  0; // checking if input is empty

        int total =0;
        for(int i =0; i< numbers.length(); i++) {

            char c = numbers.charAt(i);

            if(Character.isDigit(c) || c == '-') {// checking if the curr char is digit

                if(i < numbers.length()-1 && (c == '-' && Character.isDigit(numbers.charAt(i+1) ) )) {

                    String negatives =""; // for stroing negative values

                    for(int j = i; j< numbers.length()-1; j++) { // checking the presence of -ve values
                        char current = numbers.charAt(j);
                        char next = numbers.charAt(j+1);

                        if(current == '-'  && Character.isDigit(next) ) {
                            negatives += "-";
                            negatives += next;
                           // j++;
                        }
                    }
                        throw new RuntimeException("negatives not allowed "+ negatives);
                }

                int num =  Character.getNumericValue(c);
                total +=  Character.getNumericValue(c);
            }
        }

        return  total;
    }
}
