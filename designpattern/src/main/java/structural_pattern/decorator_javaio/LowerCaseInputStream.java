package structural_pattern.decorator_javaio;

import java.io.*;

public class LowerCaseInputStream extends FilterInputStream {

	public LowerCaseInputStream(InputStream in) {
		// TODO:
		super(in);
	}
 
	@Override
	public int read() throws IOException {
		// TODO:
		int c = super.read();
		return (c == -1 ? c : Character.toLowerCase((char)c));
	}
}
