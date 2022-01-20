import javax.swing.*;

public class Uso_coche {

    public static void main(String[] args){


        //instanciamos el objeto seat de la clase coche

        Coche seat = new Coche();

       
        System.out.println(seat.dime_datos_generales());

      seat.establece_climatizador(JOptionPane.showInputDialog("Lleva climatizador?"));
      System.out.println(seat.dime_climatizador());

        seat.establece_color(JOptionPane.showInputDialog("Introduce color"));
        seat.establece_cv(150);
        
        System.out.println(seat.dime_color());

        seat.establece_asientos_cuero(JOptionPane.showInputDialog("Lleva asientos de cuero?"));
        
        System.out.println(seat.dime_asientos_cuero());

        System.out.println(seat.dime_cv()+" CV");

        System.out.println(seat.dime_peso_coche());

        System.out.println("el precio del coche es de: "+seat.precio_coche());

        seat.establece_modelo("León FR");

        System.out.println("el modelo es: " + seat.dime_modelo());



  



        }
    }

    
    
    

