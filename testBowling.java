package Bowling;

import static org.junit.Assert.assertEquals;
import org.junit.*;

public class testBowling {
	  private Bowling bowling;

	  public void nLanzamientos(Bowling juego, int cantidadLanzamientos, int cantPinos) {
		  
	    for(int i = 0; i < cantidadLanzamientos; i++) {
	        juego.lanzarBola(cantPinos);
	    }
	    
	  }
	 
	  @Before 
	  public void setUp() {
	    this.bowling = new Bowling();
	  }

	  @Test
	  public void todasMalas() {
		  
		  int cantidadlanzamientos=20, cantidadPinosTirados=0;
		  nLanzamientos(this.bowling, cantidadlanzamientos, cantidadPinosTirados);
		  
		  assertEquals(this.bowling.getPuntaje(), 0);
	    
	  }
	}
