package maquina;


import java.util.*;

/**
 * 
 */
public class Maquina {

    /**
     * Default constructor
     */
    public Maquina() {
    }

    /**
     * 
     */
    

    /**
     * 
     */
    private int valorRecaudacionMinimo=1000;
    private int dineroActualdeMaquina=900000000;
    private int codigoSecreto=112233;
    /**
     * 
     */
    private int cantCasillasMaquina=3;
    private boolean hizoPrimerTiro=false;

    /**
     * 
     */
   
    
    
    
    

    


    /**
     * @param float Dinero
     */
    public boolean alcanzoRecaudacionMinima() {
        // TODO implement here
    	  if(dineroActualdeMaquina<valorRecaudacionMinimo){ return true;}
          else{ return false;}
    }
    
    public void restarDelTotal(int restar) {
    this.dineroActualdeMaquina=this.dineroActualdeMaquina-restar;
    }
    
    
    public boolean ingresarCodigoSecreto(int codigo) {
      
    	if(codigo==codigoSecreto) {
    	
    	return true;
    	
    		}else {
    	return false;
    		}
    		}
    
    public boolean comprobarCasillasMaquina(int cantCasillas) {
    if(this.cantCasillasMaquina==cantCasillas) {
   
    return true;
    }else {
    return false;
    }
    
    } 
    public int getValorRecaudacionMinimo() {
    	return this.valorRecaudacionMinimo;
    }
    
    
    public boolean getHizotiro() {

    	return this.hizoPrimerTiro;
    }
    
    public void hizoPrimerTiro() {
    this.hizoPrimerTiro=true;
    }
   }


