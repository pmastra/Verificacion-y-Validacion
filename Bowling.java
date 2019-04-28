package Bowling;

public class Bowling {
	private int puntaje;
	private int lanzamientosJug[] = new int[21];

	private int lanzamientoIndice = 0;
	
	public void lanzarBola(int n) {
        this.lanzamientosJug[lanzamientoIndice] = n;
        
        if(this.lanzamientoIndice<18 && (this.lanzamientoIndice%2)==0 && n==10) {
        	//<18 para la jugada final que es especifica
            this.lanzamientoIndice++;

        }
        
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
    		    			if((i%2)!=0 && (pinosTirados+lanzamientosJug[i-1])==10) {

            					if((i+1)<lanzamientosJug.length) {
    	        					//Si entramos aca es porque hizo un strike
    	            				puntaje+=lanzamientosJug[i+1];
            					}
            					
        					} 
    		    		}
        				puntaje+=pinosTirados;

    				}
    				
        		}else {

    				if((i%2)==0) {
    					//Si entramos aca es porque hizo un spare
    					if((i+4)<lanzamientosJug.length){
    						if(i<16) {
    							//caso especifico
    							
    							if((lanzamientosJug[i+2]==10)) {
            						puntaje+=lanzamientosJug[i+2]+lanzamientosJug[i+4];
            					}else {
            						puntaje+=lanzamientosJug[i+2]+lanzamientosJug[i+3];

            					}
    						}else {
    							//para posicion 18
        						puntaje+=lanzamientosJug[i+1]+lanzamientosJug[i+2];

    						}
    					
    					}
    				}else {
    					if((i+1)<lanzamientosJug.length) {
	    					//Si entramos aca es porque hizo un strike
	        				puntaje+=lanzamientosJug[i+1];
    					}
    				}
    				puntaje+=pinosTirados;
    			}
    		}
    		
    		
    		return puntaje;
    }
    
    
    public int getPuntaje() {
    	return calcularPuntaje();
    }	
}