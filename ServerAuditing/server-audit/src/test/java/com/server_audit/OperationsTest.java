package com.server_audit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class OperationsTest {
	
	@Test
	public void getOutdatedServerTest() {
		
		Server server1 = new Server("server1", "softwareType1", "software1", "1.11.111");
		Server server2 = new Server("server2", "softwareType1", "software1", "1.11.111");
		Server server3 = new Server("server3", "softwareType1", "software1", "1.11.111.5");
		Server server4 = new Server("server4", "softwareType1", "software1", "1.11.111");
		
		Operations ops = new Operations();
		
		List<Server> allList = new ArrayList<Server>();
		allList.add(server1);
		allList.add(server2);
		allList.add(server3);
		allList.add(server4);
		
		List<Server> outdated = ops.getOutdatedServer(allList);
		List<Server> expectedOutDated = new ArrayList<Server>();
		expectedOutDated.add(server1);
		expectedOutDated.add(server2);
		expectedOutDated.add(server3);
		
		assertThat(outdated, is(outdated));
			
	}

}
