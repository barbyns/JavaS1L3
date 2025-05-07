public class Main {
    public static void main(String[] args) {
        // Creazione di due rettangoli
        Rettangolo rett1 = new Rettangolo(4, 5);
        Rettangolo rett2 = new Rettangolo(3, 6);

        // Stampa delle informazioni di ciascun rettangolo
        rett1.stampaRettangolo();
        System.out.println(); // Spazio

        rett2.stampaRettangolo();
        System.out.println(); // Spazio

        // Stampa delle informazioni di entrambi i rettangoli insieme
        Util.stampaDueRettangoli(rett1, rett2);
    }
}




