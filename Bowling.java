package Bowling;

public class Bowling {
	private int puntaje;
	private int lanzamientosJug[] = new int[21];
	private int pinos;
	private boolean spare=false;
	private boolean strike=false;
	
	private int lanzamientoIndice = 0;
     
    public void lanzarBola(int pinosTirados) {
    		
    			if(pinosTirados!=10) {
    			//Si entra aca es porque no hizo strike ni spare
    				if(pinosTirados==0) {
    					//Si entro aca es porque tiro 0 pinos
    		    		lanzamientosJug[lanzamientoIndice]=pinosTirados;
    		    		lanzamientoIndice++;
    		    		puntaje+=0;
    		    	}
    				else {
    					//Si entro aca es porque tiro algunos pinos
    					lanzamientosJug[lanzamientoIndice]=pinosTirados;
    					lanzamientoIndice++;
        				puntaje+=pinosTirados;
    				}
        		}
    			else {
    				if(lanzamientoIndice%2!=0) {
    					spare=true;
    					//Si entramos aca es porque hizo un spare
    					lanzamientosJug[lanzamientoIndice]=pinosTirados;
    					lanzamientoIndice++;
        				puntaje+=10;	
    				}
    				else {
    					strike=true;
    					//Si entramos aca es porque hizo un strike
    					lanzamientosJug[lanzamientoIndice]=pinosTirados;
    					lanzamientoIndice++;
        				puntaje+=10;
    				}
    			} 
    }
    
    
    public int getPuntaje() {
    	return puntaje;
    }	
}
