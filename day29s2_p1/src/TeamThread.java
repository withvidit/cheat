
public class TeamThread extends Thread {

	public TeamThread() {
		// TODO Auto-generated constructor stub
		
		
	}
	Main threadMain;
	int numOfPlayrs;
	public TeamThread(Main threadMain, int numOfPlayrs) {
		super();
		this.threadMain = threadMain;
		this.numOfPlayrs = numOfPlayrs;
	}
	
	@Override
	public void run() {
		synchronized (this) {
			
		}
		super.run();
	}
	

}
