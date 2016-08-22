package br.com.chainofresponsibility;

public abstract class AbstractLogger {
	
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	
	
	private int level;
	private AbstractLogger proximo;
	
	public AbstractLogger(int level, AbstractLogger proximo) {
		super();
		this.level = level;
		this.proximo = proximo;
	}
	
	
	public void logMessage (int level, String mensagem){
		if (this.level <= level) {
			write(mensagem);
		}
		if (proximo != null) {
			proximo.logMessage(level, mensagem);
		}
	}
	
	abstract protected void write(String message);
	
}
