/**
 * Clase Poligono.
 * @author Benedicto Santiago
 * @version 1.0
 */
public abstract class Poligono{

	  // Atributos
	  
	  /** Lados Poligono. */
	  private double lados;
	  	
	  /**
  	 * Instantiates a new poligono.
  	 */
	  	
	//Constructor
	  	
  	public Poligono() {
	
	  }
	  
	  /** 
	   * Metodo abstracto
  	 * @see java.lang.Object#toString()
  	 * @return informacion completa del objeto
  	 */
  	public abstract String toString();
	  
  	/**
  	 * metodo abstracto
  	 * @return double Area
  	 */
  	public abstract double SetArea();
	  
  	/**
  	 * metodo abstracto
  	 * @return double Perimetro
  	 */
  	public abstract double SetPerimetro();

 
	  
}
