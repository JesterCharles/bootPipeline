package com.revature.bootPipeline;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RestController;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class TestControllerTests {

	@Test
	public void testRestControllerAnnotationPresence(){
		Class<TestController> testControllerClass = TestController.class;
		boolean annotationFound = testControllerClass.isAnnotationPresent(RestController.class);
		Assertions.assertTrue(annotationFound);
	}

}
