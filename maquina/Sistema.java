package maquina;


import java.util.*;

/**
 * 
 */
public class Sistema {

	private Collection<Premio> premios;
    
    public Sistema() {
    }

   
   private Collection<Maquina> maquinas;

    private int casillasSistema=3;
    
    private boolean partidaEnCurso=false;

    private int Dinero;
    
    private int a,b,c,d,e;
    
    private int multiplicador;
    
   
    public void iniciarPartida() {
        // TODO implement here
    	
    	this.partidaEnCurso=true;
    	
    	
     }
    
  public int getDinero() {
	 return this.Dinero;
	  
 }
  
  public void setDinero(int plata) {
  this.Dinero=plata;
  }
  
    public boolean getStatus() {
    	
        return this.partidaEnCurso;
    }

    
    public int getCasillas() {
    return this.casillasSistema;
    }
    
    public void SetearCasiilas(int casilla) {
    	this.casillasSistema=casilla;
    	
    	
    	
    }
    
    public Collection<Maquina> cargarMaquina() {
   return this.maquinas;
    	
    }
    
    public boolean existeMaquina() {
    if(maquinas.isEmpty()==true)
    	return false;
    return true;
    }
    
    public void finalizarPartida() {
        // TODO implement here
    	this.partidaEnCurso=false;
    }
    
   public void set3(int a, int b, int c) {
	   this.a=a;
	   this.b=b;
	   this.c=c;
	   
   }
   public void set4(int a, int b, int c, int d) {
	   this.a=a;
	   this.b=b;
	   this.c=c;
	   this.d=d;
	   
   }
   public void set5(int a, int b, int c, int d, int e) {
	   this.a=a;
	   this.b=b;
	   this.c=c;
	   this.d=d;
	   this.e=e;
	   
   }
   
   public void setMulti( int multi) {
	   this.multiplicador=multi;
   }
   
   public int getMulti () {
	   return this.multiplicador;
   }
}