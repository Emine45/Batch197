package day23_exceptions;

public class C04Exceptions04 {

    /*
          1)  In Java "Exceptions" and "Error" can be thrown.
          2) What is the difference between "Exception" and "Error" ?
                Exceptions can be handled but "Errors" con not.
                Examples of Errors: StackOverFlowError: Stack Memory is full.
                                    OutOfMemoryError:   Heap Memory is full
                                    VirtualMachineError:
                Examples ofExceptions: i) RunTimeExceptions
                                                            ArithmeticException
                                                            NullPointerException
                                                            NumberFormatException
                                                            ArrayIndexOutOfBoundsException
                                                            StringIndexOutOfBoundsException
                                        ii) CompileTimeExceptions
                                                            FileNotFoundException
                                                            IOException
​
​
​
     */
    public static void main(String[] args) {
        System.out.println(convertCharToIntInString("12345", 2));
        System.out.println(convertCharToIntInString("12345", 5)); // StringIndexOutOfBoundsException. Java throws StringIndexOutOfBoundsException
        // When given idx is out of the string
        System.out.println(convertCharToIntInString("12a45", 2)); // NumberFormatException . Java throws NumberFormatException
        // when String uses non-numerical chars

        System.out.println(convertCharacterToIntInString("12345", 2));
        System.out.println(convertCharacterToIntInString("12345", 5));
        System.out.println(convertCharacterToIntInString("12a45", 2));


    }

        // Create a method gets a character from a String and converts it to int

    // First Way: we can handle multiple exceptions separately
    public static int convertCharToIntInString(String s , int idx){
        int result =0;
        try {
            String ch = s.substring(idx,idx+1);
            result = Integer.parseInt(ch);

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Index given should not exceed the lenght of the String...");
        }catch (NumberFormatException e){
            System.out.println("String should not contain non-numerical characters...");
        }

        return  result;
    }


    // Second Way: We can handle all types of exceptions in a single try-catch block:
    public static int convertCharacterToIntInString(String s , int idx){
        int result =0;
        try {
            String ch = s.substring(idx,idx+1);
            result = Integer.parseInt(ch);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return  result;
    }

        
}