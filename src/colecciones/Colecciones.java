package colecciones;


public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Declarando mi primer arreglo en java <3
		
		//Primero el tipo de dato que voy a almacenar, despues el nombre de mi arreglo y por ultimo la instancia.los datos que voy a guardar en este arreglo van dentro de llaves
		
		
		String[] listaCompras = new String[] {"leche","huevo","jamon"};	
		
		System.out.println(listaCompras);
		
		
		
		//forEach para imprimir cada elemento de la lista de compras
		
		
		
		
		for(String productoTemporal : listaCompras) {
			System.out.println(productoTemporal);
		}
		
String[] habitacion= new String[5];
		
		habitacion[0]= "101";
		habitacion[1]= "101";
		habitacion[2]= "101";
		habitacion[3]= "101";
		habitacion[4]= "101";
		
		for(String hab:habitacion) {
			System.out.println(hab);
		}

	}

}


/*

Colecciones


- Arrays

Un array es una estructura de datos linea que contiene elementos del mismo tipo. La longitud de un array se establece al momento de crearlo y no puede cambiar. No cuenta con metodos adicionales para agregar o eliminar elementos. Los elementos estan almacenados de forma contigua en memoria, y se puede acceder a ellos a traves de un indice. Sus principales caracteristicas son:

    1. Tamanio fijo.
    2. Acceso rapido.
    3. Coste elevado para insertar o eliminar elementos. 



*/


