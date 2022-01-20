public class Coche {

    //private int ruedas;
    private int motor;
   // private int altura;
    private int largo;
    private double ancho;
    private String color;

    //Propiedades que pueden variar

    
    String modelo;
    int peso_total;
    boolean asientos_cuero,climatizador;


//metodo constructor

    public Coche(){
        //ruedas=4;
        motor=1900;
        //altura=133;
        largo=2000;
        ancho=180;


       
    }

 

    //SETTER

    public void establece_color(String color_coche){

       

    }

    public void establece_asientos_cuero(){

        asientos_cuero = true;

    }

    //GETTER

    public String dime_largo(){
        return "El largo del coche es "+ largo;
    }

    public double dime_ancho(){
        return ancho;
    }

    public int dime_motor(){
        return motor;
    }

    public String dime_color(){
        return "el color es: "+color;
    }

    public boolean dime_asientos_cuero(){
        return asientos_cuero;
    }
}




