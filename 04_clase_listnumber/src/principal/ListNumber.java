package principal;

import java.util.ArrayList;

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
}

			
		
	



