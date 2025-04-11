public class PrimitiveDefaults {
    public static void main(String[] args) {
        System.out.println("Default values and sizes of primitive data types:");

        System.out.println("byte: Default = 0, Size = " + Byte.BYTES + " bytes");
        System.out.println("short: Default = 0, Size = " + Short.BYTES + " bytes");
        System.out.println("int: Default = 0, Size = " + Integer.BYTES + " bytes");
        System.out.println("long: Default = 0L, Size = " + Long.BYTES + " bytes");
        System.out.println("float: Default = 0.0f, Size = " + Float.BYTES + " bytes");
        System.out.println("double: Default = 0.0d, Size = " + Double.BYTES + " bytes");
        System.out.println("char: Default = '\\u0000', Size = " + Character.BYTES + " bytes");
        System.out.println("boolean: Default = false, Size = not precisely defined");
    }
}