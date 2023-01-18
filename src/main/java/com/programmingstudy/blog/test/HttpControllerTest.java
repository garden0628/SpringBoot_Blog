package com.programmingstudy.blog.test;

import org.springframework.web.bind.annotation.*;

@RestController
public class HttpControllerTest {

    // http;//localhost:8080/http/get(select)
    @GetMapping("/http/get")
    public String getTest(){
        return "get요청";
    }

    // http://localhost:8080/http/post(insert)
    @PostMapping("/http/post")
    public String postTest(){
        return "post요청";
    }

    // http://localhost:8080/http/put(update)
    @PutMapping("/http/put")
    public String putTest(){
        return "put요청";
    }

    // http://localhost:8080/http/delete(delete)
    @DeleteMapping("/http/delete")
    public String deleteTest(){
        return "delete요청";
    }
}
