/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumeracion;

/**
 *
 * @author Alumno Mañana
 */
public enum Gimnasio {
    Espalda(5),
    biceps(5),
    triceps(7),
    Pierna(8),
    Pecho(7);
    
    //maquinas para respectivo musculo
    private final int num_maquina;
    
    private Gimnasio(int maquina){
    this.num_maquina=maquina;
    
    } 

    public int getNum_maquina() {
        return num_maquina;
    }

  
    
    
    
    
    
    
}
