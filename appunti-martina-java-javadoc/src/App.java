import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Gatto myCat = new Gatto("Pino Daniele", (byte) 90);
        // System.out.println(myCat.getName() + " " + myCat.getAge());

        Scanner in = new Scanner(System.in);

        System.out.print("\nInserisci l'età del gatto\n> ");
        int catAge = in.nextInt();        

        System.out.println("\nIl gatto l'è vecio di " + catAge + " anni");

        // Javadoc
        //si lavora a scatola chiusa

        //usare il sito javadoc
        //sulla sidebar a sinistra ci sono le classi java da ispezionare e comprendere

        //* l'API Java è l'insieme di tutte le classi e metodi gia prefatti in JAVA
        
        // usare i commenti Javadoc per documentare il codice

        /**
         * Questo commento è commento <em>Javadoc</em>
         */

        /*
            un commento javadoc è pensato per descrivere solo le funzionalità o i principi di un package/classe...
            in un comm javadoc commentiamo
                - package
                - classe
                - interfaccia
                - metodo pubblico
                - attributo pubblico
            (metodi e attr. privati non ha senso commentarli dato che non sono visibili al di fuori della classe)

            Va messo appena prima del metodo/classe/ecc...

            Deve essere sintetico (al massimo) ma comprensibile e utile

            solitamente si scrive un paragrafo e basta

            vengono utlizzati i @param @return @see

            quindi ricapitolando:
        */
        /**
         * PRIMO PARAGRAFO -> SCOPO DEL METODO
         * paragrafi successivi suddivisi da <p>
         * una riga vuota (indica l'inizio dei tag @)
         * Tag javadoc che spiegano i componenti nel coso.. idk
         */
        /**
         * @param <nome parametro> <descrizione breve>
         * @return <breve descrizione>
         * @exception <nome ex> <descrizione delle circostanze che portano all'ex>
         * @see <ulteriori riferimenti
         */

        // per compilare il javadoc uso il comando
        // > javadoc -sourcepath ./src /d ./doc labJava

        /* 
        SUGGERIMENTI DI STILE

        - usa i link
        - utilizza la terza persona
        - utilizza le parentesi per la forma generale di metodi e costruttori
        - va bene usare frasi brevi
        
        se mi venisse la malsana idea di usare netbeans le shortcut, o keybindings sono sulle slide


        */



    }
}
