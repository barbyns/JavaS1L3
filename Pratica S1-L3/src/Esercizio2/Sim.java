package Esercizio2;

import java.util.LinkedList;

public class Sim {
    private int numeroTelefono;
    private double credito;
    private LinkedList<Chiamata> ultimeChiamate;

    // Costruttore con numero di telefono
    public Sim(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0.0;
        this.ultimeChiamate = new LinkedList<>();
    }

    // Metodo per aggiungere una chiamata
    public void aggiungiChiamata(Chiamata chiamata) {
        if (ultimeChiamate.size() == 5) {
            ultimeChiamate.removeFirst(); // Rimuove la più vecchia
        }
        ultimeChiamate.add(chiamata);
    }

    // Metodo per stampare i dati della SIM
    public void stampaDatiSim() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito + " €");
        System.out.println("Ultime chiamate:");
        for (Chiamata c : ultimeChiamate) {
            System.out.println(" - " + c);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Sim miaSim = new Sim(333123456); // Crea SIM con credito 0 e lista vuota

        // Aggiungiamo alcune chiamate
        miaSim.aggiungiChiamata(new Chiamata(320111111, 5));
        miaSim.aggiungiChiamata(new Chiamata(320222222, 3));
        miaSim.aggiungiChiamata(new Chiamata(320333333, 7));
        miaSim.aggiungiChiamata(new Chiamata(320444444, 2));
        miaSim.aggiungiChiamata(new Chiamata(320555555, 6));
        miaSim.aggiungiChiamata(new Chiamata(320666666, 4)); // Questa farà uscire la prima

        miaSim.stampaDatiSim(); // Stampa tutto
    }
}


