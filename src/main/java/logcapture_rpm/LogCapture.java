package logcapture_rpm;

import java.io.IOException;
import org.apache.commons.exec.*;

public class LogCapture {

	private static String CURSOR = "s=b6386171a0454461a5ea78d0c6c6b7e2;i=4;b=8ccff3238af141b1aa23cd7210ffd4d3;m=cb3db;t=57988060c9c33;x=4921323527c8958f";
	
	public static void main(String[] args) throws IOException {
		
		
		CommandLine cmdLine = new CommandLine("journal");
		cmdLine.addArgument("-o json");
		cmdLine.addArgument("--cursor=\"" + CURSOR + "\"");
		DefaultExecutor executor = new DefaultExecutor();
		int exitvalue = executor.execute(cmdLine);

	}

}
