package logcapture_rpm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LogCapture {

	private static String CURSOR = "s=b6386171a0454461a5ea78d0c6c6b7e2;i=4;b=8ccff3238af141b1aa23cd7210ffd4d3;m=cb3db;t=57988060c9c33;x=4921323527c8958f";
	
	public static void main(String[] args) throws IOException {
		
		StringBuilder cmd = new StringBuilder();
		cmd.append("journalctl -o json --cursor=");
		cmd.append(CURSOR);
		
		List<String> command = new ArrayList<String>();
		//command.add(cmd.toString());
		command.add("date");
		
		ProcessBuilder builder = new ProcessBuilder();
		builder.command(command);
		
		builder.inheritIO().start();

	}

}
