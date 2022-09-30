
public class Ejercicio5 {

	public static void main(String[] args) {
		
		//variables
		int a = 1, b=2, c=3, d=4;
		
		System.out.println("B tome el valor de C");
		b=c;
		System.out.println("El valor de B es de: "+b+"\n");

		
		System.out.println("C tome el valor de A");
		c=a;
		System.out.println("El valor de C es de: "+c+"\n");
		
		
		System.out.println("A tome el valor de D");
		a=d;
		System.out.println("El valor de A es de: "+a+"\n");
		
		
		System.out.println("D tome el valor de B");
		d=b;
		System.out.println("El valor de D es de: "+d+"\n");
		
	}

}
