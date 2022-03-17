public class App {
    public static void main(String[] args) throws Exception {
        // introduzione sulle coding rules
        // * all'esame non servirà la documentazione

        // adattarsi alle coding rules del progetto

        // * introduzione array e arraylist (junit forse)

        // array hanno una DIMENSIONE FISSA
        // dimensione che non può essere alterata dinamicamente
        // questo nella struttura base
        //
        // Si può ampliare con robe particolari

        // dichiarazione array
        double[] arr;
        arr = new double[10];

        // oppure
        int[] arr2 = new int[10];

        // gli array in java sono degli oggetti contenti valori uniformi (xor interi,
        // xor stringhe, ecc)

        // fare sempre compilazioni intermedie

        arr2[3] = 44;

        // per accedere un array si usa il subscripting
        int oneValue = arr2[3]; // prendo il quarto elemento
        System.out.println(oneValue); // -> 44

        // l'ultimo elemento ha indice [dimensione-1]

        int a = 4;
        arr[a + 2] = 3.2;

        System.out.println(arr.length);

        // allocazione valori

        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19 };
        System.out.println(primes[3]);

        // si puo usare un array come valore di ritorno di un metodo/funzione
        // public static int[] resize(primes, 5) {
        // //code..
        // return newArray;
        // }

        // se copio un array in maniera intuitiva sto solamente instanziando un altro
        // puntatore all'array
        // * utilizza il metodo System.arraycopy()

        // * esistono array bidimensionali/matrici

        // evita array paralleli, usa array di oggetti

        // * arraylist è dinamico
    }
}
