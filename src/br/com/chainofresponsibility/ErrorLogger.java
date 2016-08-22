package br.com.chainofresponsibility;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		super(level, new FileLogger(AbstractLogger.DEBUG));
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void write(String message) {
		 System.out.println("Error Console::Logger: " + message);
	}

}
