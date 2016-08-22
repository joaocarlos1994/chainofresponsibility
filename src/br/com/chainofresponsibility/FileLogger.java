package br.com.chainofresponsibility;

public class FileLogger extends AbstractLogger {

	public FileLogger(int level) {
		super(level, null);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void write(String message) {
		System.out.println("File::Logger: " + message);

	}

}
