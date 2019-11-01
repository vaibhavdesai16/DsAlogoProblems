package com.server_audit;

import java.util.ArrayList;
import java.util.List;

public class Server implements Comparable<Server> {

	private String serverName;
	private String softwareType;
	private String softwareName;
	private String version;
	private List<Integer> versionDigitList;

	public Server(String serverName, String softwareType, String softwareName, String version) {

		this.serverName = serverName;
		this.softwareType = softwareType;
		this.softwareName = softwareName;
		this.version = version;
		this.versionDigitList = versionCodeListGenerator(version);
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getSoftwareType() {
		return softwareType;
	}

	public void setSoftwareType(String softwareType) {
		this.softwareType = softwareType;
	}

	public String getSoftwareName() {
		return softwareName;
	}

	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "serverName:" + this.serverName + " softwareType: " + this.softwareType + " softwareName: "
				+ this.softwareName + " softwareVersion: " + this.version;
	}

	public List<Integer> getVersionDigitList() {
		return versionDigitList;
	}

	public void setVersionDigitList(List<Integer> versionDigitList) {
		this.versionDigitList = versionDigitList;
	}

	
	/* (non-Javadoc)
	 * Method will compare current object with another object and will return 
	 * 0 if both are equal 
	 * 1 is current object is greater
	 * -1 otherwise
	 */
	public int compareTo(Server anotherServer) {
 		
		int isLatest = 0;
		int minVersionLength = this.versionDigitList.size() < anotherServer.versionDigitList.size()
				? this.versionDigitList.size()
				: anotherServer.versionDigitList.size();

		for (int i = 0; i < minVersionLength; i++) {
			if (this.versionDigitList.get(i) > anotherServer.versionDigitList.get(i)) {
				isLatest = 1;
				break;
			}
			else if(this.versionDigitList.get(i) < anotherServer.versionDigitList.get(i)) {
				isLatest = -1;
				break;
			}
		}
		
		/*if we found both version lists are equal till minimum version length the check which one has more length */
		if(isLatest == 0 && (this.versionDigitList.size() != anotherServer.versionDigitList.size()))
				isLatest = this.versionDigitList.size() > anotherServer.versionDigitList.size() ? 1 : -1 ;

		return isLatest;
	}
	
	/**method converts version string(integers separated by dots Eg. 14.1.20 to 14,1,20)
	 * to list of integers 
	 * @param versionString
	 * @return
	 */
	public static List<Integer> versionCodeListGenerator(String versionString) {
		// custom algorithm for version digit list
		List<Integer> versionDigitList = new ArrayList<Integer>();
		char[] versionchar = versionString.toCharArray();
		int versionDigit = 0;
		for (char digit : versionchar) {
			if (digit == '.') {
				versionDigitList.add(versionDigit);
				versionDigit = 0;
			}

			else
				versionDigit = versionDigit * 10 + Integer.parseInt("" + digit);
		}
		
		versionDigitList.add(versionDigit);
		
		
		return versionDigitList;
	}

}