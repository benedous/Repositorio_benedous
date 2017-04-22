

public class Main {

	  /**
  	 * Metodo Main.
  	 *
  	 * @param args the arguments
  	 */
  	public static void main(String[] args) {
		    // TODO Auto-generated method stub

		    
		    double lados[] = {5,5,5};
		    int ladosCuadrado[] = {5,5,5,5};
		    double Alados[] = {4.2,3,5};
		    Triangulo t = new Triangulo(3,3,lados);
		    Poligono c = new Cuadrado(3,ladosCuadrado);
		    Poligono c2 = new Cuadrado(5,ladosCuadrado);
		    System.out.println(t);
		    t.SetAngulos(Alados);
		    System.out.println(c);
		    System.out.println(c2);
		   
		   
		    
	  }

	  
	  
	  
	  
}
