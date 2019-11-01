package com.server_audit;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;


public class ServerTest {
	
	@Test
	public void versionCodeListGeneratorTest() {
		Server server = new Server("server1", "softwareType1", "software1", "1.12.333");
		List<Integer> versionList = Server.versionCodeListGenerator(server.getVersion());
		List<Integer> expected = new ArrayList<Integer>(); 
		expected.add(1);
		expected.add(12);
		expected.add(333);
		assertTrue(versionList.equals(expected));
		
	}
	
	@Test
	public void compareToTest() {
		/*based on length of version string*/
		Server server1 = new Server("server1", "softwareType1", "software1", "1.11.111");
		Server server2 = new Server("server2", "softwareType1", "software1", "1.11.111.5");
		Assert.assertEquals(-1, server1.compareTo(server2));
	}

}
