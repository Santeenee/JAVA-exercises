public class VariabiliDiEsemplare {
    public static void main(String[] args) throws Exception {
        /*private*/ double balance = 0.9;
        System.out.println(balance);

        // metodi di solito sono public
        // var di esemplare sono di solito private

        //* incapsulamento = information hiding
        // = modificare le var private solo con metodi pubblici come i setter (setX())

        //* non mettere print nei metodi

        //PARAMETRI ESPLICITI ED IMPLICITI
        //... idk, i wasn't awake
        
        //quando String nullString = null;
        // e provo a printare la length della nullString
        // -> error
        
        Pippo instance1 = new Pippo();
        instance1.printami();
    }
}

class Pippo {
    public void printami() {
        System.out.println("hi");
    }
}
