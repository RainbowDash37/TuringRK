package algo;

public class Band {
     //Band ArrayList, 1 Dimensional, char;
	 //Methods: getValue(int position); getLenght(); update() (trimToSize());
	 //setValue(int postition, char e);

	int[] b = new int[10];
	
	public Band(){
	}
	
	public int getBand(int i){
		return b[i];
	}
	
	public void setBand(int i, int k){
		b[k] = i;
	}

}
