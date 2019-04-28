package Bowling;

public class Bowling {
	private int puntaje;
	private int lanzamientosJug[] = new int[21];
	private boolean spare=false;
	private boolean strike=false;
	private int lanzamientoIndice = 0;
	
	public void lanzarBola(int n) {
        this.lanzamientosJug[lanzamientoIndice] = n;
        this.lanzamientoIndice++;
    }
     
    public int calcularPuntaje() {
    		for(int i=0; i<lanzamientoIndice; i++){
    			
    			int pinosTirados=lanzamientosJug[i];
    			
    			if(pinosTirados!=10) {
    			//Si entra aca es porque no hizo strike ni spare
    				if(pinosTirados==0) {
    					//Si entro aca es porque tiro 0 pinos
    		    		puntaje+=0;
    		    	}else {
    		    		
    		    		if((i-1)>=0) {
    		    			if((lanzamientoIndice%2)!=0 && (pinosTirados+lanzamientosJug[i-1])==10) {

            					if((i+1)<lanzamientosJug.length) {
    	        					//Si entramos aca es porque hizo un strike
    	            				puntaje+=lanzamientosJug[i+1];
            					}
            					
        					} 
    		    		}
        				puntaje+=pinosTirados;

    				}
    				
        		}else {

    				if((lanzamientoIndice%2)==0) {
    					strike=true;
    					//Si entramos aca es porque hizo un spare
    					if((i+1)<lanzamientosJug.length && (i+2)<lanzamientosJug.length){
    						
    						puntaje+=pinosTirados+lanzamientosJug[i+1]+lanzamientosJug[i+2];
    					
    					}
    				}
    				else {
    					spare=true;
    					if((i+1)<lanzamientosJug.length) {
    					//Si entramos aca es porque hizo un strike
        				puntaje+=pinosTirados+lanzamientosJug[i+1];
    					}
    				}
    			}
    		}
    		return puntaje;
    }
    
    
    public int getPuntaje() {
    	return calcularPuntaje();
    }	
}