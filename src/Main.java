class Tester {
    static void main()
    {
        // int a number with no fraction can be negative
        // double is a number with a fractional part (decimal)

        int age = 0;
        double salary = 23.50;
        String name= "Nathan";
        String greeting = "Hello World";
        boolean isRaining = false;

        IO.println("Hello World");    //Litter

        IO.println(greeting);


        IO.println(isRaining);

        /* * / + - % */
        int intOperandA = 32;
        int intOperandB = 17;
        int intSum = 0;
        int intProduct = 0;
        int intDifference = 0;
        int intQuotient = 0;
        int intModulo = 0;


        intSum = intOperandA + intOperandB;   //sum of 32 and 17
        IO.println("The sum of" + intOperandA + "+" + intOperandB + "is" + intSum);

        intProduct = intOperandA * intOperandB;
        IO.println("The product of" + intOperandA + "*" + intOperandB + "is" + intProduct);

        intDifference = intOperandA - intOperandB;
        IO.println("The Difference of" + intOperandA + "-" + intOperandB + "is" + intDifference);

        intQuotient = intOperandA / intOperandB;
        IO.println("The Quotient of" + intOperandA + "/" + intOperandB + "is" + intQuotient);

        intModulo = intOperandA % intOperandB;
        IO.println("The Modulo of" + intOperandA + "/" + intOperandB + "is" + intQuotient);



        double doubleOperandA = 4.50;
        double doubleOperandB = 2.50;
        double doubleSum = 0;
        double doubleProduct = 0;
        double doubleDifference = 0;
        double doubleQuotient = 0;

        doubleSum = doubleOperandA + doubleOperandB;
        IO.println("The sum of doubles " + doubleOperandA + "+" + doubleOperandB + "is" + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        IO.println("The product of doubles" + doubleOperandA + "*" + doubleOperandB + "is" + doubleProduct);

        doubleDifference = doubleOperandA - doubleOperandB;
        IO.println("The Difference of doubles" + doubleOperandA + "-" + doubleOperandB + "is" + doubleDifference);

        doubleQuotient = doubleOperandA / doubleOperandB;
        IO.println("The Quotient of doubles" + doubleOperandA + "/" + doubleOperandB + "is" + doubleQuotient);









    }
}