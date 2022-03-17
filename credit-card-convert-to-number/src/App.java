public class App {
    public static void main(String[] args) throws Exception {
        String s1 = "1234-23455-345-654";

        s1 = s1.replace("-", "");
        s1 = s1.replace("_", "");
        s1 = s1.replace(" ", "");

        System.out.println(s1);
    }
}
