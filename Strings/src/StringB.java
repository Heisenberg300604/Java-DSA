public class StringB {
    public static void main(String[] args) {

        // Printing letter series...
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            series = series +ch;
        }
        System.out.println(series); // Not a good aproach

        // Good Approach to solve such problem
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 24; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        // StringBuilder will not create new objects thus preventing dereferencing
        System.out.println(builder);
        System.out.println(builder.toString());
    }
}
