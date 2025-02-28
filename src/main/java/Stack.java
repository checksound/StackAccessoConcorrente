
public class Stack {

	private int pointer = 0;
	/* creiamo un array di 100 elementi, dimensione massima 
	   dello stack */
	private char[] values = new char[100];

	public void push(char value) {
		knap();
		values[pointer] = value; // A
		knap();
		pointer++;    //B
	}

	public char pop() {
		knap();
		pointer--;   //C
		knap();
		return values[pointer];  //D
	}

	public boolean isEmpty() {
		if(pointer == 0)
			return true;
		return false;
	}

	private void knap() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException ex) {}
	}
}