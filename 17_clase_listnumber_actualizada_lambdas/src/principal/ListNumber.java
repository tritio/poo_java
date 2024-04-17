package principal;

import java.util.ArrayList;
import java.util.Iterator;

class ListNumber extends ArrayList<Integer> {

	public Integer first() {
		if(this.size() == 0) {
			return null;
		}
 		return this.get(0);
	}
	
	public Integer last() {
		if(this.size() == 0) {
			return null;
		}
		return this.get(this.size() - 1);
	}
	
	public int sum() {
		int suma = 0;
//		for(int i=0;i<this.size();i++){
//			suma += this.get(i); 
//			}
		for(int n: this) {
			suma +=n;
		}
		return suma;
	}

	@Override
	public boolean add(Integer e) {
		if(!this.contains(e)) {
			return super.add(e);
		} 
		return false;
	}
	
	// nuevo método eliminarNumeros: elimina los números de la lista que cumplan una determinada condición
	public void eliminarNumeros( Condicion condicion ) {  // le pasamos un parámetro de un objeto que IMPLEMENTA un interfaz condición
//		for(Integer n: this) {
//			if(condicion.test(n)) {
//				remove(n); // también puede ponerse super.remove(n)				
//			}
//		} Esta forma no es segura, pues con un for se va recolocando cada posición al borrar y tendremos problema. Usar mejor Iterator
		
		Iterator<Integer> it = this.iterator();
		while(it.hasNext()) {
			if(condicion.test(it.next())) {  // el iterator es como un puntero delante del primero, por eso llamamos a next()
				it.remove();
			}		
		}
	}
	
	// método para transformar cada número de la lista en otro: debería ser capaz de transformar
	// cada número en su cuadrado, en la mitad, en su raíz cúbica

	public void tranformarNumeros(TransformarNumeros tx) {
		for(int i = 0; i < this.size(); i++) {
			this.set(i, tx.transformar(this.get(i)));  // set de la clase arrayList permite sustituir uno por otro
		}
	}
}

			
		
	



