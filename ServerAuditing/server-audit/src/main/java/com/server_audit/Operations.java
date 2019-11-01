package com.server_audit;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Class contains all operations required to built server object list 
 */
public class Operations {

	
	/**
	 * this method reads data from file and 
	 * stores each line in the file into string list
	 * @param filePath
	 * @return
	 */
	public List<String> fileToString(String filePath) {
		List<String> allLines = new ArrayList<String>();
		String fileName = filePath;
		Path path = Paths.get(fileName);
		try {
			allLines = Files.readAllLines(path, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return allLines;

	}

	/**
	 * this method creates server object list based on list of text received 
	 * each sentence has configuration required to built a server object  
	 * @param sentance
	 * @return
	 */
	public List<Server> serverInitialiser(List<String> eachserverConfig) {
		List<Server> serverList = new ArrayList<Server>();
		for (String eachSentance : eachserverConfig) {			
			Server server = serverObjectInit(eachSentance);
			serverList.add(server);
		}

		return serverList;

	}

	
	/** method creates single server object based on configuration string 
	 * received in parameter. Method internally gets called by serverInitialiser()
	 * @param configLog
	 * @return
	 */
	public Server serverObjectInit(String configLog) {
		List<String> serverDetails = Arrays.asList(configLog.split(", "));
		Server server = new Server(serverDetails.get(0), serverDetails.get(1), serverDetails.get(2), serverDetails.get(3));
		return server;
	}
	
	
	public List<Server> getOutdatedServer(List<Server> allServerList){
		List<Server> outdatedServers = new ArrayList<Server>();
		/*this will hold latest server of each type*/
		HashMap<String,Server> latestServer = new HashMap<String, Server>();
		for(Server server : allServerList) {
			
			String serverType = server.getSoftwareType().toLowerCase() + server.getSoftwareName().toLowerCase();
			
			/*check if server type already exists in hashmap*/
			if(latestServer.containsKey(serverType)) {
				/*retrive latest server*/
				Server latest = latestServer.get(serverType);
				//compare with current server 
				if(server.compareTo(latest) > 0) {
					/*current server is latest than earlier latest server then add current server to hashmap 
					 * and earlier server to outdated list */
					
					latestServer.put(serverType, server);
					outdatedServers.add(latest);
			        latest = null; //eligible for garbage collection 
				}
				else {
					outdatedServers.add(server);
				}
				
			}
			else {
				/*add new type to hashmap*/
				latestServer.put(serverType, server);
			}
			
			
		}		
		return outdatedServers;
	}
}
