package com.marlabs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootGitApplicationTests {
	public static Logger logger=LoggerFactory.getLogger(SpringBootGitApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Text Case Executing.....");
		logger.info("Text Case Executing Second Log Statement.....");
		assertEquals(true, true);
	}

}
