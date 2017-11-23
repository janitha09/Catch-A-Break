package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}
        @Test
        public void CanITakeABreak(){
            //receive call to service
            //can I go on break now
            DemoApplication app = new DemoApplication();
            boolean actual = app.canILeaveNow();
            //assertAreEq
        }

}
