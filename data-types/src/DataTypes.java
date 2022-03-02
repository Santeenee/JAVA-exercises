public class DataTypes {
    public static void main(String[] args) throws Exception {

        //BYTE
        byte num = 8;   // -128 > byte < +127
        System.out.println(num);
        
        //SHORT
        short shortNum = 12345; // -32k > short < +32k
        
        //INT
        int classic = 123456789; 
        System.out.println(Integer.MAX_VALUE);
        
        //LONG
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        long notSoLongNum = 10000; //correct
        // long notSoLongNum2 = 100000000000; //! wrong!
        long longNum = 100000000000L; //add 'L' if number is greater than integer
        System.out.println(longNum);

        // ERRORI DI ARROTONDAMENTO
        double f = 4.35;
        int n = (int)(f * 100);
        System.out.println(n); //wait... //* casting isn't always perfect, use Math.round()

        n = (int)Math.round(f * 100);
        System.out.println(n); //aaah, perrfect!

        // COSTANTI
        final int WHAT_A_CONSTANT = 69420; //（￣︶￣）

        // SOME MATH BECAUSE YESS
        byte a = 7 / 2; //troncamento --> 3.5 -> 3
        System.out.println(a);

        float b = 7 % 2; //resto
        System.out.println(b);

        // / ** doesn't exist use Math.pow() 
        //float c = Math.pow(3, 2); //! return double value, cast to float
        float c = (float)Math.pow(3, 2);
        System.out.println((byte)c);

        System.out.println(Math.PI);
     
        
        //* Math.round() è un metodo statico
        //* System.out.println() no

        //---
        // STRINGHE

        //le stringhe sono oggetti (infatti si dichiarano con la classe String)
        //gli oggetti della classe string sono infatti immutabili
        String word = "Hello, There!";
        word.toUpperCase(); // -> HELLO, THERE! 
        word.toLowerCase(); // -> hello, there!
        //these methods don't change original string value -> (word = Hello, There!)

        System.out.println(word.substring(2));      // -> llo, There!
        System.out.println(word.substring(0, 4));   // -> Hell

        String concatenata = "HI" + "hi";
        System.out.println(concatenata);

        byte age = 44;
        // String stringAge = (String)age;  //! remember: String is technically a class
        // String stringAge = "" + age;     //it works, however it's ugly
        String stringAge = Integer.toString(age);
        System.out.println(stringAge);
    }
}
