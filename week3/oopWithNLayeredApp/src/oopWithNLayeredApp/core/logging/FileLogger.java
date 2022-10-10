package oopWithNLayeredApp.src.oopWithNLayeredApp.core.logging;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("File log added: " + data);

	}

}
