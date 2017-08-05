package registrationScheduler.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProcessor {
	private String inputFile = "";
	private String outputFile = "";
	private FileReader fr = null;
	private BufferedReader br = null;
	private BufferedWriter bw = null;
	private FileWriter fw = null;
	private File outputfile = null;
	
	/**
	 * Constructor of CourseAllocation initializes data members.
	 * @param inputFileIn
	 * @param outputFileIn
	 */
	public FileProcessor(String inputFileIn, String outputFileIn){
		Logger.writeOutput("Constructor of FileProcessor class is called.", 4);
		setInputFile(inputFileIn);
		setOutputFile(outputFileIn);
		initialize();
	}
	
	/**
	 * Initializes the data members.
	 */
	private void initialize() {
		try{
			fr = new FileReader(getInputFile());
			br = new BufferedReader(fr);
			fw = new FileWriter(getOutputFile());
			bw = new BufferedWriter(fw);
			outputfile = new File(getOutputFile());
			
			if (!outputfile.exists()) {
				//outputfile.delete();
				outputfile.createNewFile();
				outputfile.setWritable(true, true);
			}
		}
		catch(FileNotFoundException e){
			System.out.println("ERROR: FILE NOT FOUND");
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
	 * Reads a line from File.
	 * @return String
	 */
	public synchronized String readLine(){
		String line ="";
		try{
			line = br.readLine();
		}
		catch(IOException e){
			e.printStackTrace();
			System.exit(-1);
		}
		catch(Exception e){
			e.printStackTrace();
			System.exit(-1);
		}
		finally{
			
		}
		return line;
	}
	
	/**
	 * Writes a line to File.
	 * @param line
	 */
	public void writeLine(String line){
		try{
			bw.write(line);
		}
		catch(IOException e){
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
	 * Closes the input File.
	 */
	public void terminateInputFile(){
		try{
			fr.close();
			br.close();
		}
		catch(IOException e){
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
	 * Closes the output File.
	 */
	public void terminateOutputFile(){
		try{
			bw.flush();
			fw.close();
			bw.close();
		}
		catch(IOException e){
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

	public String getInputFile() {
		return inputFile;
	}

	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}

	public String getOutputFile() {
		return outputFile;
	}

	public void setOutputFile(String outputFile) {
		this.outputFile = outputFile;
	}
	
	public BufferedWriter getBw() {
		return bw;
	}

	public void setBufferedWriter(BufferedWriter bw) {
		this.bw = bw;
	}

	public File getOutputfile() {
		return outputfile;
	}

	public void setOutputfile(File outputfile) {
		this.outputfile = outputfile;
	}
}
