package br.com.chainofresponsibility;

public class ConsoleLogger extends AbstractLogger {
	
	public ConsoleLogger(int level) {
		super(level, new ErrorLogger(AbstractLogger.ERROR));
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void write(String message) {
		 System.out.println("Standard Console::Logger: " + message);

	}

}
