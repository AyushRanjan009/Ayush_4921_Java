public class Q23_WrapperClasses {

    public static void main(String[] args) {

        // ==========================================
        // PART B - 1: Primitive and Wrapper Variables
        // ==========================================

        // Primitive variables
        byte b = 10;
        short s = 20;
        int i = 100;
        long l = 1000L;
        float f = 10.5f;
        double d = 20.55;
        char c = 'A';
        boolean bool = true;

        // Wrapper variables
        Byte wb = b;
        Short ws = s;
        Integer wi = i;
        Long wl = l;
        Float wf = f;
        Double wd = d;
        Character wc = c;
        Boolean wbool = bool;

        System.out.println("===== PART 1: PRIMITIVE AND WRAPPER VARIABLES =====");

        System.out.println("byte       : " + b + " -> " + wb);
        System.out.println("short      : " + s + " -> " + ws);
        System.out.println("int        : " + i + " -> " + wi);
        System.out.println("long       : " + l + " -> " + wl);
        System.out.println("float      : " + f + " -> " + wf);
        System.out.println("double     : " + d + " -> " + wd);
        System.out.println("char       : " + c + " -> " + wc);
        System.out.println("boolean    : " + bool + " -> " + wbool);


        // ==========================================
        // PART B - 2: AUTOBOXING
        // ==========================================

        int number = 100;
        double decimal = 25.5;
        char letter = 'X';
        boolean status = true;

        // Primitive -> Wrapper Object
        Integer intObject = number;
        Double doubleObject = decimal;
        Character charObject = letter;
        Boolean booleanObject = status;

        System.out.println("\n===== PART 2: AUTOBOXING =====");

        System.out.println("int -> Integer       : " + intObject);
        System.out.println("double -> Double     : " + doubleObject);
        System.out.println("char -> Character    : " + charObject);
        System.out.println("boolean -> Boolean   : " + booleanObject);


        // ==========================================
        // PART B - 3: UNBOXING
        // ==========================================

        Integer integerObj = 500;
        Double doubleObj = 50.5;
        Character characterObj = 'Z';
        Boolean booleanObj = false;

        // Wrapper Object -> Primitive
        int intValue = integerObj;
        double doubleValue = doubleObj;
        char charValue = characterObj;
        boolean booleanValue = booleanObj;

        System.out.println("\n===== PART 3: UNBOXING =====");

        System.out.println("Integer -> int       : " + intValue);
        System.out.println("Double -> double     : " + doubleValue);
        System.out.println("Character -> char    : " + charValue);
        System.out.println("Boolean -> boolean   : " + booleanValue);
    }
}