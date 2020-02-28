package arrayPractice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Thread.State;

public class Main {
	
	private static void writeThreadInfo(PrintWriter pw, Thread t, State s) {
		pw.printf("Id%d - Name%s\n", t.getId(),t.getName());
		pw.printf("Priority%s\n", t.getPriority());
		pw.printf("Old state%s\n", s);
		pw.printf("New state%s\n", t.getState());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("Minimum priority: %s\n",Thread.MAX_PRIORITY);
		System.out.printf("Minimum priority: %s\n",Thread.NORM_PRIORITY);
		System.out.printf("Minimum priority: %s\n",Thread.MIN_PRIORITY);

		Thread threads[];
		Thread.State states[];

		threads = new Thread[10];
		states = new Thread.State[10];
		for(int i = 0; i<10;i++) {
			threads[i] = new Thread(new Calculator());
			if((i%2)==0) {
				threads[i].setPriority(Thread.MAX_PRIORITY);
			}
			else {
				threads[i].setPriority(Thread.MIN_PRIORITY);
			}
			threads[i].setName("My Thread "+i);
		}
		try( FileWriter file = new FileWriter(".\\data\\log.txt");
				PrintWriter pw = new PrintWriter(file);){
			for(int i=0;i<10;i++) {
				pw.println("Main status of thread "+i+" : "+threads[i].getState());
			}
			for(int i=0;i<10;i++) {
				threads[i].start();
			}


			boolean finish = false;
			while(!finish) {
				for(int i=0;i<10;i++) {
					if(threads[i].getState()!=states[i]) {
						writeThreadInfo(pw, threads[i], states[i]);
						states[i] = threads[i].getState();
					}
				}
				finish = true;
				for(int i=0;i<10;i++) {
					finish = finish && (threads[i].getState() == State.TERMINATED);
				}
			}
		}catch(IOException ie) {
			ie.printStackTrace();
		}

	}

}
