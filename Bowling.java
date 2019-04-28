package Bowling;

public class Bowling {
	private int puntaje;
	private int lanzamientosJug[] = new int[21];
	private int pinos;
	private boolean spare=false;
	private boolean strike=false;
	
	
	private boolean tocaJugador1=true;//cuando es false le toca al jug2
	
	private int lanzamientoIndice = 0;
     
    public void lanzarBola(int pinosTirados) {
    	if(pinosTirados==0) {
    		lanzamientosJug[lanzamientoIndice]=pinosTirados;
    		lanzamientoIndice++;

    		puntaje+=0;
    	}else {
    		
    		if(lanzamientoIndice%2==0) {
    			//primer lanzamiento
    			if(pinosTirados==10) {
        			//es strike
            		lanzamientosJug[lanzamientoIndice]=pinosTirados;

            		lanzamientoIndice++;
            		lanzamientoIndice++;
            		strike=true;
            		puntaje+=10;
        		}
    			else {
    				lanzamientosJug[lanzamientoIndice]=pinosTirados;
    				puntaje+=pinosTirados;
    				lanzamientoIndice++;
    			}
    		} else {   		
    		
    		lanzamientosJug[lanzamientoIndice]=pinosTirados;
    		puntaje+=pinosTirados;
    		lanzamientoIndice++;

    		}
    	}
    }
    
    
    public int getPuntaje() {
    	return puntaje;
    }	
}
