
package ejerreloj;

public class Reloj {
    int Hora;
    int Minuto;
    int Segundo;
    
    Reloj(){
        Hora = 0;
        Minuto = 0;
        Segundo = 0;
    }
    
    Reloj(int Hor,int Min,int Seg){
        this.Hora = Hor;
        this.Minuto = Min;
        this.Segundo = Seg;
    }
     
     void ponerHora(){
         if(Segundo>=60){
            Segundo = 0;
            Minuto++;
        }
        Segundo = 0;
        System.out.println("Hora actual es: "+Hora+":"+Minuto+":"+Segundo); 
     }
     
     void ponerHora(int Hora,int Min,int Seg){
         this.Hora = Hora;
         this.Minuto = Min;
         this.Segundo = Seg;
         if(Hora<24){
             if(Hora>12){
                 System.out.println("Hora actual es: "+Hora+":"+Minuto+":"+Segundo+" PM");
             }else{
                 System.out.println("Hora actual es: "+Hora+":"+Minuto+":"+Segundo+" AM");
             }
         }
     }
    
     void mostrarHora(boolean AM){         
        if(AM && Hora==00){           
            System.out.println("Hora actual es: "+Hora+":"+Minuto+":"+Segundo);
        }else{
            if(AM && Hora>12){
            int hora = Hora - 12;
            System.out.println("Hora actual es: "+hora+":"+Minuto+":"+Segundo);
        }
     }
     }
}
