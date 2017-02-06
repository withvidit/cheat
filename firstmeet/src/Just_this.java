import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;



	class One extends Thread{
		public void run(){
		for(int i=0; i<2; i++){
		System.out.print(i);
		}
		}
		}

	public class Just_this {
		public static void main(String args[]){
		Just_this t = new Just_this();
		t.call(new One());
		}

		public void call(One o){
		o.start();
		}
		}
