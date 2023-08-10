package com.revature.bootPipeline;

import org.springframework.http.HttpCookie;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("test/{id}")
public class TestController {

    TestRepo testRepo;
    public TestController(TestRepo testRepo){
        this.testRepo = testRepo;
    }
    @GetMapping()
    public String testingCiCd(@PathVariable int id) {
        testRepo.save(new Member(0, "testing", "hithere"));
        List<Member> emptyListCheckingConnection = (List<Member>) testRepo.findAll();
        System.out.println(emptyListCheckingConnection.get(0).toString());
        return "Hello from the pipelines. You are request number: " + emptyListCheckingConnection.size() + " " + id;
    }

    @PostMapping()
    public ResponseEntity<String> login(){
        final HttpCookie cookie = ResponseCookie.from("role", "admin")
                .path("/")
                .httpOnly(true)
                .secure(true)
                .maxAge(300)
                .build();
        final HttpCookie cookie2 = ResponseCookie.from("user", "userID")
                .path("/")
                .httpOnly(true)
                .secure(true)
                .maxAge(300)
                .build();
        return ResponseEntity.ok()
                .header(HttpHeaders.SET_COOKIE, cookie.toString())
                .header(HttpHeaders.SET_COOKIE, cookie2.toString())
                .body("Logged in");
    }

    @GetMapping("/loggedInAs")
    public String checkUser(@CookieValue String role, @CookieValue String user){
        return "Hey! I'm " + user + " logged in as a " + role;
    }

}
