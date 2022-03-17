public class App {
    public static void main(String[] args) throws Exception {
        String s1 = "ATACATATAGGGCCAATTATTATAAGTCAC";
        String s2 = "CGCCACTTAaGCGCCCTGTATTAAAGTCGC";

        System.out.println("\n" + s1);

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) == s2.charAt(i)) {
                System.out.print("|");
            } else {
                System.out.print(" ");
            }
        }

        System.out.println("\n" + s2);
    }
}
