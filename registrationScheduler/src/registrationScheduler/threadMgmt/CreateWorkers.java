package registrationScheduler.threadMgmt;

import registrationScheduler.store.Results;
import registrationScheduler.util.FileProcessor;
import registrationScheduler.util.Logger;
import registrationScheduler.util.ObjectPool;

public class CreateWorkers {
	private FileProcessor fp = null;
	private Results re = null;
	
	/**
	 * Constructor of CreateWorkers initializes data members.
	 * @param fpIn
	 * @param reIn
	 */
	public CreateWorkers(FileProcessor fpIn, Results reIn){
		Logger.writeOutput("Constructor of CreateWorkers class is called.", 4);
		setFp(fpIn);
		setRe(reIn);
	}
	
	/**
	 * Creates the threads and join on them.
	 * @param numThreads
	 */
	public void startWorkers(int numThreads) {
		try{
			this.addCourses();
			int i=numThreads;
			Thread[] threads = new Thread[numThreads];
			while(i>0){
				WorkerThread wt = new WorkerThread(getFp(), getRe());
				Thread t = new Thread(wt);
				threads[numThreads-i] = t;
				t.start();
				i--;
			}
			
			for(int j=0;j<threads.length;j++){
				threads[j].join();
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
			System.exit(-1);
		}
		catch(Exception e){
			e.printStackTrace();
			System.exit(-1);
		}
		finally{
			
		}
	}
	
	/**
	 * Adds courses to the pool.
	 */
	public void addCourses(){
		ObjectPool coursePool = ObjectPool.getInstance();
		coursePool.addCourses(1);
		coursePool.addCourses(2);
		coursePool.addCourses(3);
		coursePool.addCourses(4);
		coursePool.addCourses(5);
		coursePool.addCourses(6);
		coursePool.addCourses(7);
	}

	public FileProcessor getFp() {
		return fp;
	}

	public void setFp(FileProcessor fp) {
		this.fp = fp;
	}

	public Results getRe() {
		return re;
	}

	public void setRe(Results re) {
		this.re = re;
	}
}