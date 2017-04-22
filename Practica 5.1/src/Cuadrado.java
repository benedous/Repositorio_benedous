/**
 * Clase Cuadrado.
 * @author Benedicto Santiago
 * @version 1.0
 */
public class Cuadrado extends Poligono {
	  
	  /** lado Cuadro. */
  	private double lado;
	  
  	/** Nº lados Cuadrado. */
  	private int [] lados = new int[4];
	
	  
	 // Constructor
	  /**
  	 * Constructor con 2 parametros
  	 *
  	 * @param lado de lado
  	 * @param lados de lados nº de lados de cuadrado
  	 */
  	public Cuadrado(double lado,int[] lados) {
		    super();
		    this.lado = lado;
		    this.lados= lados;
		  
	  }
	  //Metodos Publicos
  	
	  /* 
	   * Construccion del objeto
  	 * @see Poligono#toString()
  	 * @return informacion completa del objeto
  	 */
  	
  	public  String toString(){
		    
  		StringBuilder sb = new StringBuilder();
		   
  		sb.append("\n").append("El area del Cuadrado es: ").append(SetArea()).append("\n")
		   .append("El perímetro del Cuadrado es: ").append(SetPerimetro());
		   return sb.toString();
	  }
	  
	  
	  /* 
	   * Calcula el Area del Cuadrado
  	 * @see Poligono#SetArea()
  	 * @return area del Cuadrado
  	 */
  	@Override
	  public double SetArea() {
		    double result;
		    return result = this.lado*this.lado;
	  }
	  
  	/* 
  	 * Calcula el Perimetro del Cuadrado
  	 * @see Poligono#SetPerimetro()
  	 * @return Perimetro del Cuadrado
  	 */
  	
  	@Override
	  public double SetPerimetro() {
		    int result = 0;
		    for(int i=0;i< lados.length;i++){
			result +=lados[i];
			    
		    }
		    
		  return (double) result;   
	  }
	  
	 // SETTERS & GETTERS
  	
	  /**
  	 * Gets De lado.
  	 *
  	 * @return lado
  	 */
  	public double getLado() {
	  	  return lado;
	  }

	  /**
  	 * Sets De lado.
  	 *
  	 * @param lado De new lado
  	 */
  	public void setLado(double lado) {
	  	  this.lado = lado;
	  }

	  /**
  	 * Gets De lados.
  	 *
  	 * @return lados
  	 */
  	public int[] getLados() {
	  	  return lados;
	  }

	  /**
  	 * Sets De lados.
  	 *
  	 * @param lados De new lados
  	 */
  	public void setLados(int[] lados) {
	  	  this.lados = lados;
	  }


	
	  
	  
	  
	  
}
