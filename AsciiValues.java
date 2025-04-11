public class AsciiValues {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println("ASCII value of " + ch + " = " + (int) ch);
        }

        System.out.println("ASCII value of digits:");
        for (char ch = '0'; ch <= '9'; ch++) {
            System.out.println(ch + " = " + (int) ch);
        }
    }
}