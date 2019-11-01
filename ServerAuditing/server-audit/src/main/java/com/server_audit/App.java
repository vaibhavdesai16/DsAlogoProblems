package com.server_audit;

import java.util.List;

/**
 * Program Entry
 *
 */
public class App {
	public static void main(String[] args) {

		Operations fr = new Operations();
		/*get list of configuration lines contained in server auditing file*/
		List<String> lineList = fr.fileToString("C:\\Users\\admin\\Documents\\doc.txt");
		
		/*get list of servers objects by using list of configuration lines */
		List<Server> allServers = fr.serverInitialiser(lineList);
		
		/*compare list of server objects to print out dated server list */
	}
}
