package com.programmingstudy.blog.test;

import org.springframework.web.bind.annotation.*;

@RestController
public class HttpControllerTest {

    private static final String TAG = "HttpControllerTest : ";

    @GetMapping("/http/lombok")
    public String lombokTest(){
        Member m = Member.builder().username("ssar").password("1234").email("ssar@nate.com").build();
        System.out.println(TAG + "getter : " + m.getUsername());
        m.setUsername("garden");
        System.out.println(TAG + "setter : " + m.getUsername());
        return "lombok test 완료";
    }

    // 인터넷 브라우저 요청은 무조건 get요청밖에 할 수 없다.
    // http://localhost:8080/http/get(select)
    @GetMapping("/http/get")
    public String getTest(Member m){
        return "get요청 : " + m.getId() + ", " + m.getUsername() + ", " + m.getPassword();
    }

    // http://localhost:8080/http/post(insert)
    @PostMapping("/http/post")
    public String postTest(@RequestBody Member m){
        return "post요청 : " + m.getId() + ", " + m.getUsername() + ", " + m.getPassword();
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
