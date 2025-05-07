public class Rettangolo {
    private double altezza;
    private double larghezza;
    //costruttore
    public Rettangolo (double altezza, double larghezza){
        this.altezza=  altezza;
        this.larghezza= larghezza;
    }
    public double calcolaArea(){
        return altezza * larghezza;
    }
    //metodo per stampare area e perimetro
    public double calcolaPerimetro (){
        return 2 *( altezza + larghezza);
    }
    public void stampaRettangolo (){
        System.out.println("Area:" + calcolaArea());
        System.out.println("Altezza:" + calcolaPerimetro());
    }
}
