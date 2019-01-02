package com.cloud.schedule;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CloudGpsApplicationTests {

	protected static RestTemplate restTemplate = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		restTemplate = new RestTemplate();
	}

}
