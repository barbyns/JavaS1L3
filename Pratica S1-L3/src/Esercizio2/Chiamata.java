package Esercizio2;

public class Chiamata {
    private int numeroChiamato;
    private int durata;

    public Chiamata( int numeroChiamato, int durata){
        this.numeroChiamato= numeroChiamato;
        this.durata= durata;
    }
    public String toString(){
        return "Numero chiamato:" + numeroChiamato + "durata:" + durata + "minuti";
    }
}
