package registrationScheduler.driver;

import registrationScheduler.util.FileProcessor;
import registrationScheduler.util.Logger;
import registrationScheduler.store.Results;
import registrationScheduler.threadMgmt.CreateWorkers;

/**
 * Registration Scheduler Program that simply schedules the
 * registration using multithreading to allocate courses. 
 * @author Sagar
 *
 */
public class Driver {
	private FileProcessor fp = null;
	private Results re = null;
	private CreateWorkers cw = null;
	private int NumThreads = 0;
	private int debugValue = 0;
	
	/**
	 * Main method validates, initializes and process.
	 * @param args
	 */
	public static void main(String args[]){
		try{
			if(args.length<4){
				System.out.println("INPUT ERROR: Invalid Number of arguments passed");
				System.exit(0);
			}
			Driver dr = new Driver();
			dr.validation(args);
			dr.initialize(args);
			dr.process();
		}
		catch(NumberFormatException e){
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
	 * Validates the arguments for Number of Threads and Debug Value range.
	 * @param args
	 */
	private void validation(String[] args) {
		try{
			if(Integer.parseInt(args[2]) < 1 || Integer.parseInt(args[2]) > 3){
				System.out.println("INPUT ERROR: Invalid Number of Threads");
				System.exit(0);
			}
			else if(Integer.parseInt(args[3]) < 0 || Integer.parseInt(args[3]) > 4){
				System.out.println("INPUT ERROR: Invalid Debug Value");
				System.exit(0);
			}
		}
		catch(NumberFormatException e){
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
	 * Initializes the parameters to use later.
	 * @param args
	 */
	private void initialize(String[] args) {
		String inputFile = args[0];
		String outputFile = args[1];
		NumThreads = Integer.parseInt(args[2]);
		debugValue = Integer.parseInt(args[3]);
		new Logger(debugValue);
		fp = new FileProcessor(inputFile, outputFile);
		re = new Results(fp);
		cw = new CreateWorkers(fp, re);
	}
	
	/**
	 * Calls the methods for processing.
	 */
	private void process(){
		cw.startWorkers(NumThreads);
		re.writeSchedulestoFile();
		re.writeSchedulesToScreen();
	}
}
