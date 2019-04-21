package Bowling;


public class Bowling {
	private int puntaje;
	private int lanzamientos[] = new int[21];
	private int lanzamientoIndice = 0;
    
    public void lanzarBola(int pinosTirados) {
    	
    	if(pinosTirados==0) {
    		lanzamientos[lanzamientoIndice]=pinosTirados;
    		lanzamientoIndice++;
    		
    		puntaje+=0;
    	}
    	
    }
    
    
    public int getPuntaje() {
    	return puntaje;
    }

	
}
