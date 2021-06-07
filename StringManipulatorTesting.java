public class StringManipulatorTesting {
    public static void main(String[] args) {
        StringManipulator test = new StringManipulator();
        String str = test.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str); // HelloWorld

        char letter = 'o';
        Integer a = test.getIndexOrNull("Coding", letter);
        Integer b = test.getIndexOrNull("Hello World", letter);
        Integer c = test.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null

        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer a = test.getIndexOrNull(word, subString);
        Integer b = test.getIndexOrNull(word, notSubString);
        System.out.println(a); // 2
        System.out.println(b); // null

        String word = test.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word); // eworld
    }
}