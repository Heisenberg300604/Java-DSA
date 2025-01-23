public class Main {
    public static void main(String[] args) {
        String a = "Nibedan";
        String b = "Nibedan";
        System.out.println(a==b); // comes as true refer notes to knwo the reason

        String name = new String("Nibedan");
        String name1 = new String("Nibedan");
        System.out.println(name ==name1); // must come as false
    }
}