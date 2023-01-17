package com.programmingstudy.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Spring이 com.programmingstudy.blog package 이하를 스캔해서 모든 파일을 메모리에 new하는 것이 아닌
// 특정 annotation이 붙어있는 class file들을 new해서 (IoC) spring container에 관리해준다.
@RestController
public class BlogControllerTest {

    //http://localhost:8080/test/hello
    @GetMapping("/test/hello")
    public String hello(){
        return "<h1>hello spring boot</h1>";
    }
}