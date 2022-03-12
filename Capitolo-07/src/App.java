public class App {
    public static void main(String[] args) throws Exception {
        /*
        * COME PROGETTARE UNA CLASSE
        1. capire cosa deve fare un oggetto della classe
            = analisi requisiti
            elecnco in linguaggio naturale delle operazioni possibili
        2. specificare l'interfaccia pubblica
            = definire i metodi tramite la loro intestazione
            fare UML
        3. documentazione interfaccia pubblica
        4. progettare anche le variabili...
        5. realizzazione costruttori e metodi
            e il resto
            in caso riesaminare i casi precedenti
        6. collaudo/testing
            da non trascurare
            nei team complessi questo compito viene lasciato ad altri, non ai dev stessi
        (non rigare hard disk lmao)
        */
        /*
        TRE TIPI DI ENUNCIATI
        1. enunciato semplice
            balance = balance - amount
        2. Blocco di enunciati
            {zero o più enunciati di qualsiasi tipo}
        3. Enunciato composto
            if(x >= 0) x = 0;
        */
        /*
        IF THEN ELSE
        per evitare che facendo un if dopo l'altro si facciano errori banali 
        viene usato l'else

        il compilatore si usa in due modi
        1. la modalità di testing, dove si vedono i valori di ogni variabile
        2. la modalità finale(?), dove tutto è ottimizzato al massimo

        se si fanno confronti 'maggiore di' -> 'n > m' bisogna mettere prima i valori più grandi
        aka non essere ritardati quando si scrivono gli if

        avere piu return all interno di una funzione la rende poco leggibile
        il prof risolve questo problema salvando i potenziali return in una variabile cosi da debuggare meglio

        possibilità di if annidati
        usa ste parentesi graffe che tolgono ambiguità
        
        quando si entra in un progetto/azienda/gruppo capire le coding rules
        per esempio se mettere le graffe a capo o no

        switch case 
            devo ancora capire perche non usa delle cazzo di sane parentesi invece dei : e il break;

        fare attenzione a '=' != '=='

        NON ESISTE COSTRUTTO 'ELSE IF'

        /*
        metodi static -> non serve creare un oggetto

        STRING
            se faccio str1 == str2 restituisce true se entrambi puntano allo stesso oggetto string
            restituisce false anche se i due oggetti stringa hanno lo stesso contenuto
            per verificare il contenuto usare il metodo .equals() della classe Object

        confronto LESSICOGRAFICO
        ok...?

        ricordo che il metodo .equals() vale per qualsiasi tipo di oggetto, non solo le stringhe

        lazy evaluation || great stuff I guess

        semplifica gli && || ! nelle condizioni sfruttando la legge di de morgan
        */
    }
}
