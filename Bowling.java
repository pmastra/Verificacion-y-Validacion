package Bowling;

public class Bowling {
	private int puntaje;
	private int lanzamientosJug1[] = new int[21];
	private int lanzamientosJug2[] = new int[21];
	
	private boolean tocaJugador1=true;//cuando es false le toca al jug2
	
	private int lanzamientoIndice = 0;
     
    public void lanzarBola(int pinosTirados) {
    	int[] lanzamientosJug;
    	
    	if(tocaJugador1) {
    		lanzamientosJug=lanzamientosJug1;
    	}else {
    		lanzamientosJug=lanzamientosJug2;

    	}
    	
    	
    	if(pinosTirados==0) {
    		lanzamientosJug[lanzamientoIndice]=pinosTirados;
    		lanzamientoIndice++;
    		
    		puntaje+=0;
    	}
    }
    
    
    public int getPuntaje() {
    	return puntaje;
    }

	
}
