package maquina;


import java.util.*;

/**
 * 
 */
public class Jugador {

  
    public Jugador() {
    }

  
    private int dinero=0;




    public void ingresarDinero(int Dinero) {
    	
        this.dinero=this.dinero+Dinero;
    }

  
    public void incrementarCredito(int Incremento) {
        this.dinero=this.dinero+Incremento;
        }
    
    public int getDinero() {
    	
        return this.dinero;
        
       }

    public void resetDespuesDelCobro() {
    	
    	this.dinero=0;
    	}
    
    public void restarTirada() {
    this.dinero=this.dinero-100;
    }
}