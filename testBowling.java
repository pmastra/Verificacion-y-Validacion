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
	  
	  /* @Test
	  public void meteUnStrike() {
		  
		  int cantidadlanzamientos=1, cantidadPinosTirados=10;
		  nLanzamientos(this.bowling, 1, 2);

		  nLanzamientos(this.bowling, cantidadlanzamientos, cantidadPinosTirados);
		  nLanzamientos(this.bowling, 1, 2);
		  nLanzamientos(this.bowling, 1, 3);
		  //Test para verificar que se cumple un strike y luego suma los 2 proximos lanzamientos.
		  //assert(this.bowling.getPuntaje()>=15);
		  assertEquals(this.bowling.getPuntaje(), 17);

	  }
	  */
	  
	  @Test
	  public void dosLanzamientos() {
		  int cantidadLanzamientos=1, cantidadPinosTirados=5;
		  nLanzamientos(this.bowling, cantidadLanzamientos, cantidadPinosTirados);
		  nLanzamientos(this.bowling, cantidadLanzamientos, 4);
		  
		  assertEquals(this.bowling.getPuntaje(), 9);
	  }  
	  
	  @Test
	  public void unLanzamientoBienDeDos() {
		  //Xq tira 4 veces? En la 2da ronda deberia tener 10 pinos mas, x lo tanto, 
		  //el test seria <=18 ya que no tira strike pero como maximo puede tirar 9 en cada ronda
		  int cantidadLanzamientos=1, cantidadPinosTirados=5;
		  nLanzamientos(this.bowling, cantidadLanzamientos, 0);
		  nLanzamientos(this.bowling, cantidadLanzamientos, cantidadPinosTirados);
		  
		  
		  assertEquals(this.bowling.getPuntaje(), 5);
	  }  
	  
	  @Test
	  public void DiezPuntosALaPrimera() {
		  int cantidadLanzamientos=1, cantidadPinosTirados=10;
		  nLanzamientos(this.bowling, cantidadLanzamientos, cantidadPinosTirados);
		  
		  assertEquals(this.bowling.getPuntaje(), 10);
	  }
	  //Este test lo comente porque no es real que tire a la segunda o a que segunda nos referimos? Segundo 
	  // lanzamiento o segunda ronda?
	  /**
	  @Test
	  public void DiezPuntosALaSegunda() {
		  int cantidadLanzamientos=1, cantidadPinosTirados=10;
		  nLanzamientos(this.bowling, cantidadLanzamientos, cantidadPinosTirados);

		  nLanzamientos(this.bowling, cantidadLanzamientos, cantidadPinosTirados);
		  
		  assertEquals(this.bowling.getPuntaje(), 20);
	  }
	  */
	  
	}
