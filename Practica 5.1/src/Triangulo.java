
/**
 * Clase  Triangulo.
 * @author Benedicto
 * @version 1.0
 */
public class Triangulo extends Poligono {
	  
	//Atributos
	 
	  
	/** Base Triangulo. */
  	private double base;
	  
  	/** Altura Triangulo. */
  	private double altura;
	  
  	/** Lados Triangulo. */
  	private double [] lados = new double[3];
	  
	 // Constructor
  	
	  /**
  	 * Constructor con 4 Parámetros.
  	 *
  	 * @param base de base del Triangulo
  	 * @param altura de altura del Triangulo
  	 * @param lados de lados nº de lados del Triangulo
  	 */
  	public Triangulo(double base, double altura, double[] lados) {
		    super();
		    this.base = base;
		    this.altura = altura;
		    this.lados= lados;
		  
	  }
	
  	
  	// Metodos Publicos
  	
  	  
  	/* Construccion del objeto
  	 * @see Poligono#toString()
  	 * @return informacion completa del objeto
  	 */
	  public  String toString(){
		    
		   StringBuilder sb = new StringBuilder();
		   sb.append("El area del Triangulo es: ").append(SetArea()).append("\n")
		   .append("El perímetro del triangulo es: ").append(SetPerimetro()).append("\n");
		   return sb.toString();
	  }
	  
	  
	  
	  /* 
	   * Calcula el area del Triangulo
  	 * @see Poligono#SetArea()
  	 * @return Area de triangulo
  	 */
	  
  	/* (non-Javadoc)
  	 * @see Poligono#SetArea()
  	 */
  	@Override
	  public double SetArea() {

		    double result;
		    return result = (this.base*this.altura)/2;
	  }
	  
  	/* 
  	 * Calcula el Perimetro del Triangulo
  	 * @see Poligono#SetPerimetro()
  	 * @return Perimetro de Triangulo
  	 */
  	
 
	  @Override
	  public double SetPerimetro() {
		    
		    int result = 0;
		    for(int i=0;i< lados.length;i++){
			result +=lados[i];
			    
		    }
		    
		    return (double) result;   
	  }
  	
  	
  	/* 
  	 * Teorema del Coseno Calcula los ángulos de un Triángulo a partir de sus lados
	   * @see Triangulo#SetAngulos(double[])
	   * @param recibe un array de double
	   * Imprime por pantalla los ángulos calculados en grados
	   */
	  public void SetAngulos(double[] Alados){
  		  
		double AngA;
		double AngB;
	  	double AngC;
  		
	  	AngA = Math.toDegrees(Math.acos((Math.pow(Alados[1], 2)+Math.pow(Alados[2], 2)-Math.pow(Alados[0], 2))/(2*Alados[1]*Alados[2])));
  		AngB = Math.toDegrees(Math.acos((Math.pow(Alados[0], 2)+Math.pow(Alados[2], 2)-Math.pow(Alados[1], 2))/(2*Alados[0]*Alados[2])));
  		AngC = Math.toDegrees(Math.acos((Math.pow(Alados[0], 2)+Math.pow(Alados[1], 2)-Math.pow(Alados[2], 2))/(2*Alados[0]*Alados[1])));
  		System.out.println("Angulo A: "+Math.floor(AngA*100)/100+"\n"+ "Angulo B: "+ Math.floor(AngB*100)/100 +"\n"+ "Angulo C: "+ Math.floor(AngC*100)/100);
  	}
  	
  	
	 
  	// GETTERS & SETTERS
	  /**
  	 * Gets De base.
  	 *
  	 * @return base
  	 */
  	
  	public double getBase() {
	  	  return base;
	  }
	  
  	/**
  	 * Gets De altura.
  	 *
  	 * @return altura
  	 */
  	
  	public double getAltura() {
	  	  return altura;
	  }
	
	  /**
  	 * Gets De lado.
  	 *
  	 * @return lado
  	 */
  	
  	public double[] getLado() {
	  	  return lados;
	  }
	 
	  

}
	  
	  
	  
	


