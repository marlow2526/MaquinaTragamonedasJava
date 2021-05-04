package maquina;


//import java.util.*;

/**
 * 
 */
public class Premio {

    /**
     * Default constructor
     */
    public Premio() {
    }

    /**
     * 
     */
   

    /**
     * 
     */
    private int cantCasillasPremio=3;

    private int cantidadFrutas=6;

    
    private int multiPremio=1;
    /**
     * 
     */
    public int generarCombiancion() {
   
    //0=frutillas, 1=pera, 2=uva, 3=manzana, 4=banana, 5=naranja
    
    int a=(int) Math.floor(Math.random()*(0-cantidadFrutas)+cantidadFrutas);
    
    return a;
    }
    
    public int getcantCasillasPremio() {
    	return this.cantCasillasPremio;
    	
    }
    public int comprobarCombinacion3(int a,int b, int c) {
        // TODO implement here
    	
    	if (a==b&&b==c) {
    	if(a==0&&b==0&&c==0) {
    		return 6000*this.multiPremio;
    		
    	}
    	
    	if(a==1&&b==1&&c==1) {
    		return 5000*this.multiPremio;
    	}
    	if(a==2&&b==2&&c==2) {
    		return 4000*this.multiPremio;
    	}
    	if(a==3&&b==3&&c==3) {
    		return 3000*this.multiPremio;
    	}
    	if(a==4&&b==4&&c==4) {
    		return 2000*this.multiPremio;
    	}
    	if(a==5&&b==5&&c==5) {
    		return 1000*this.multiPremio;
    	}
    	}
    	else {
    	if(a==b|| b==c) {
    		return 500*this.multiPremio;
    	}
    	else {
    		return 0;
    	}
    	}
    	return 0;
    }

    public int comprobarCombinacion4(int a,int b, int c, int d) {
        // TODO implement here
    	
    	if (a==b&&b==c&&c==d) {
    	if(a==0&&b==0&&c==0) {
    		return 60000*this.multiPremio;
    		
    	}
    	
    	if(a==1&&b==1&&c==1) {
    		return 5000*this.multiPremio;
    	}
    	if(a==2&&b==2&&c==2) {
    		return 4000*this.multiPremio;
    	}
    	if(a==3&&b==3&&c==3) {
    		return 3000*this.multiPremio;
    	}
    	if(a==4&&b==4&&c==4) {
    		return 2000*this.multiPremio;
    	}
    	if(a==5&&b==5&&c==5) {
    		return 1000*this.multiPremio;
    	}
    	}
    	else {
    	if(a==b|| b==c) {
    		return 1000*this.multiPremio;
    	}
    	if(a==b|| b==c||c==d) {
    		return 1000*this.multiPremio;
    	}
    	if(a==b&&b==c) {
    		return 6666*this.multiPremio;
    	}
    	else {
    		return 0;
    	}
    	}
    	return 0;
    }
    
    public int comprobarCombinacion5(int a,int b, int c, int d, int e) {
        // TODO implement here
    	
    	if (a==b&&b==c&&c==d&&d==e) {
    	if(a==0&&b==0&&c==0) {
    		return 600000*this.multiPremio;
    		
    	}
    	
    	if(a==1&&b==1&&c==1) {
    		return 5000*this.multiPremio;
    	}
    	if(a==2&&b==2&&c==2) {
    		return 4000*this.multiPremio;
    	}
    	if(a==3&&b==3&&c==3) {
    		return 3000*this.multiPremio;
    	}
    	if(a==4&&b==4&&c==4) {
    		return 2000*this.multiPremio;
    	}
    	if(a==5&&b==5&&c==5) {
    		return 1000*this.multiPremio;
    	}
    	}
    	else {
    	if(a==b|| b==c) {
    		return 1000*this.multiPremio;
    	}
    	if(a==b|| b==c||c==d||d==e) {
    		return 1000*this.multiPremio;
    	}
    	if(a==b&&b==c&&c==d) {
    		return 6666*this.multiPremio;
    	}
    	else {
    		return 0;
    	}
    	}
    	return 0;
    }
    
    /**
     
     */
   public int getMultiPremio() {
	   return this.multiPremio;
   }
   public void setMultiPremio(int mult) {
	  this.multiPremio=mult;
   }
   
    
    public void setCantidadDeFrutas(int x) {
    this.cantidadFrutas=x;
    }
}