class DefaultValues {

    byte defaultByte;
    short defaultShort;
    int defaultInt;
    long defaultLong;
    float defaultFloat;
    double defaultDouble;
    char defaultChar;
    boolean defaultBoolean;

    void printDefaultValues() {
        System.out.println("Default Values of Primitive Data Types:");
        System.out.println("byte: " + defaultByte);
        System.out.println("short: " + defaultShort);
        System.out.println("int: " + defaultInt);
        System.out.println("long: " + defaultLong);
        System.out.println("float: " + defaultFloat);
        System.out.println("double: " + defaultDouble);
        System.out.println("char: [" + defaultChar + "] (empty character)");
        System.out.println("boolean: " + defaultBoolean);
    }
}

public class PrimitiveDataTypes {
    public static void main(String[] args) {
       
        DefaultValues obj = new DefaultValues();
        obj.printDefaultValues();
        byte myByte = 10;
        short myShort = 100;
        int myInt = 1000;
        long myLong = 10000L;
        float myFloat = 10.5f;
        double myDouble = 100.55;
        char myChar = 'A';
        boolean myBoolean = true;

        System.out.println("\nAssigned Values of Primitive Data Types:");
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);
    }
}
