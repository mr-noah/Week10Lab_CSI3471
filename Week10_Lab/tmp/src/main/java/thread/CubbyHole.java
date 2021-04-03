//Noah Lambaria
package thread;
import java.util.ArrayList;
class CubbyHole {

	private boolean available = false;
	private ArrayList<Integer> list = null;
	private int seq;

	public CubbyHole(){
		list = new ArrayList<>();
	}

	public synchronized int get() {

		//while(!available){
		while (list.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(list.size() == 0) {
			available = false;
		}
		seq = list.remove(0);
		notify();
		return seq;
	}

	public synchronized void put(int value) {
		//while(available){
		while (list.size() == 10) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		notify();
		//add it to the list to store
		list.add(value);
		if(list.size() == 10){
			//once it hits 10, then it goes
			available = true;
		}
	}
}