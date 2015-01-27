
package ejerreloj;

public class EjerReloj {

    public static void main(String[] args) {
        //Declaramos un reloj con la hora en 0
        Reloj reloj = new Reloj();
        //Declaramos un reloj con una hora
        Reloj reloj2 = new Reloj(12,34,12);
        //Ponemos en hora el primer reloj
        reloj.ponerHora();
        //Ponemos en hora el segundo reloj
        reloj2.ponerHora();
        //Ponemos el reloj en una hora de la tarde
        reloj.ponerHora(15,34,34);
        //Ponemos el reloj en una hora de la mañana
        reloj.ponerHora(07,34,23);
        
        
        //Pasamos la hora segun el formato AM o PM 
        // -- Que nos muestre las 10 de la noche
        Reloj reloj3 = new Reloj(15,23,12);
        reloj3.mostrarHora(true);
       
    }
    
}
