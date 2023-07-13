package com.revature.bootPipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class TestController {

    TestRepo testRepo;
    public TestController(TestRepo testRepo){
        this.testRepo = testRepo;
    }
    @GetMapping("/test")
    public String testingCiCd() {
        List<Member> emptyListCheckingConnection = (List<Member>) testRepo.findAll();
        return "Hello from the pipelines. You are request number: " + emptyListCheckingConnection.size();
    }
}
