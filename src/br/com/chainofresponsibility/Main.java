package br.com.chainofresponsibility;

public class Main {
	
	public static void main(String[] args) {
		
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		//AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		//AbstractLogger errorlogger = new ErrorLogger(AbstractLogger.ERROR);
	    
		consoleLogger.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
		
	}

}
