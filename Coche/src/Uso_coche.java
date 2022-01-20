import java.sql.Date;
import java.util.GregorianCalendar;


//import javax.swing.*;

public class Uso_coche {

    public static void main(String[] args){

      Empleado e1 = new Empleado("Jorge",1500,2020,4,2);

      System.out.println(e1.dameNombre());
      System.out.println(e1.dameSueldo());
      e1.subeSueldo(10);
      System.out.println(e1.dameSueldo());

      //Empleado[] misEmpleados=new Empleado[3];

      Empleado[] miArray=new Empleado [3];
      miArray[0]=new Empleado("Paco",1000, 3030, 3, 2);
      miArray[1]=new Empleado("Juan",3000, 3030, 3, 2);
      miArray[2]=new Empleado("manolo",2000, 3030, 3, 2);

      for(int i = 0; i<miArray.length; i++){

        miArray[i].subeSueldo(10);
      }

      for(int i=0; i<miArray.length;i++){
        System.out.println("nombre: "+ miArray[i].dameNombre()+" Sueldo: "+ miArray[i].dameSueldo());
      }

      

      
  
     

        }
    }

    class Empleado{

      public Empleado(String nom, double sue, int agno, int mes, int dia ){
        this.nombre=nom;
        this.sueldo=sue;
        GregorianCalendar altas = new GregorianCalendar(agno,mes-1,dia);

        altaContrato = altas.getTime();


      }

      //GETTERS
      public String dameNombre(){
        return nombre;
      }

      public double dameSueldo(){
        return sueldo;
      }

      public Date dameFechaContrato(){
        return (Date) altaContrato;
      }

      //SETTTERS

      public void subeSueldo(double porcentaje){
        double aumento = sueldo*porcentaje/100;
        sueldo=sueldo+aumento;

      }



      private String nombre;
      private double sueldo;
      private java.util.Date altaContrato;


    }

    
    
    

