/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumeracion;

/*\
|*| @author el novio de tu mama
\*/
public enum Continentes {
   africa(53,1000),
   europa(46,4324),
   asia(51,7888),
   america(34,100),
   oceania(14,32033);
   //Propiedad numero de paises de cada continente
     private final int numcontinentes;
     private final int superficie;
   
    //
   private Continentes(int continentes, int superficie){
       this.numcontinentes = continentes;
       this.superficie = superficie;
   }

    public int getNumcontinentes() {
        return numcontinentes;
    }
   
}
