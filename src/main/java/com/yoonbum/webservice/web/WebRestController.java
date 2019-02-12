package com.yoonbum.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@RestController는 @ResponseBody를 모든 메소드에서 적용
public class WebRestController {

    @GetMapping("/hello") //hello 메소드의 결과는 "HelloWorld" 라는 문자열을 JSON 형태로 반환
    public String hello() {
        return "HelloWorld";
    }
}
