public class Coche {

    private int ruedas;
    private int motor;
    private int altura;
    private int largo;
    private double ancho;
    private String color;

    
    private String modelo;
    private int peso_plataforma;
    private int peso_total;
    private boolean asientos_cuero,climatizador;
    private double cv;
    


//metodo constructor

    public Coche(){
        ruedas=4;
        motor=1900;
        altura=133;
        largo=2000;
        ancho=180;
        peso_plataforma=500;


       
    }

 

    //SETTER

    public void establece_color(String color){
        this.color=color;      

    }

    public void establece_modelo(String escribe_modelo){
        this.modelo=escribe_modelo;
    }

    public void establece_cv(double cv){
        this.cv=cv;
    }

    public void establece_asientos_cuero(String asientos){

        if (asientos.equalsIgnoreCase("si")||asientos.equalsIgnoreCase("verdadero")){
            this.asientos_cuero=true;

        }else{
            this.asientos_cuero=false;
        }

    }

    public void establece_climatizador(String climatizador){
        if(climatizador=="si"){
            this.climatizador=true;

        }else{
            this.climatizador=false;
        }
        
    }

    //GETTER

    public String dime_modelo(){
        return modelo;
    }

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

    public String dime_asientos_cuero(){
        if(asientos_cuero==true){
            return "lleva asientos de cuero";


        }else{
            return "LLeva asientos de serie";
        }
       
    }

    public String dime_datos_generales(){
        return "datos: "+ruedas + altura+asientos_cuero;
    }

    public String dime_climatizador(){
        if(climatizador==true){
            return "lleva climatizador";
        }else{
            return "lleva aire acondicionado";
        }
    }

    public double dime_cv(){
        return cv;
    }

    //SETTER Y GETTER CONJUNTAMENTE

    public String dime_peso_coche(){
        int peso_carrocería=500;

        peso_total=peso_plataforma+peso_carrocería;

        if(asientos_cuero==true){
            peso_total=peso_total+50;
        }

        if(climatizador==true){
            peso_total=peso_total+20;
        }

        return "el peso del coche es"+peso_total;
    }

    public double precio_coche(){ //GETTER
        double precio_final=10000;
        if (asientos_cuero==true){
            precio_final=precio_final+2000;

        }
         if (climatizador==true){
             precio_final=precio_final+1000;

         }
         return precio_final;
}
}



