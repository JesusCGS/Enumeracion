/*
 * trabajando enumeracion
 */
package Principal;

import Enumeracion.Continentes;
import Enumeracion.Dias;
import java.util.Scanner;

/*\
|*|@author EL novio de tu mama
\*/

public class principal {
    static Scanner ent = new Scanner(System.in);
    public static void main(String[] args) {
      //saber dia
        System.out.println("hoy es dia "+Dias.lunes);
        dias_santi(Dias.martes);
        //asignacion directa del dia
        Dias midia= Dias.jueves;
        //asignacion de un dia en base a un String a traves de un valueof
        Dias misegundoDia= Dias.valueOf("Viernes");
        //declaracion de un listado de dias inciandolos cn los values de mi enum
        Dias[] todoslosDias = Dias.values();
        //imprimo el cotenido de mi listado de dias
        for (Dias d : todoslosDias) {
            System.out.println("d = "+d);
        }
        
        
        //visualizar un pais
        System.out.println("continente..."+Continentes.america);
        System.out.println("numero de paises de america: "+ Continentes.america.getNumcontinentes());
        
        
        imprimirdia();
        
    }
    
    public static void imprimirdia(){
        int num;
        System.out.println("SOlo valen los dias de este mes[Octubre]");
        System.out.println("introduzca el numero de dia de hoy");
        System.out.println("");
        num=ent.nextInt();
        if(num==1|num==8|num==15|num==22|num==29){
            System.out.println("EL dia de hoy es :"+Dias.sabado);
        }else if(num==2|num==9|num==16|num==23|num==30){
            System.out.println("EL dia de hoy es :"+Dias.domingo);
        }else if(num==3|num==10|num==17|num==24|num==31){
             System.out.println("EL dia de hoy es :"+Dias.lunes);
        }else if(num==4|num==11|num==18|num==25){
            System.out.println("EL dia de hoy es :"+Dias.martes);
        }else if(num==5|num==12|num==19|num==26){
            System.out.println("EL dia de hoy es :"+Dias.miercoles);
        }else if(num==6|num==13|num==20|num==27){
            System.out.println("EL dia de hoy es :"+Dias.jueves);
        }else if(num==7|num==14|num==21|num==28){
            System.out.println("EL dia de hoy es :"+Dias.viernes);
        }else if(num>31){
            System.out.println("solo valen los dias del mes de octubre");
            num=ent.nextInt();
        }else{
            
        }
            
        
    }
    
    public static void dias_santi(Dias dias) {
        switch (dias) {
            case lunes:
                System.out.println("Primer dia de la semana");
                break;
            case martes:
                System.out.println("Segundo dia de la semana");
                break;
            case miercoles:
                System.out.println("Tercer dia de la semana");
                break;
            case jueves:
                System.out.println("Cuarto dia de la semana");
                break;
            case viernes:
                System.out.println("Quinto dia de la semana");
                break;
            case sabado:
                System.out.println("Sexto dia de la semana");
                break;
            case domingo:
                System.out.println("Septimo dia de la semana");
                break;
            default:
                System.out.println("el dia de las semana introducido es incorrecto");
        }
        
    }
    
    
}
