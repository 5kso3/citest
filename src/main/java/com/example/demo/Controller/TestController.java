package com.example.demo.Controller;

import com.example.demo.Response.CommonResponse;
import com.example.demo.Response.ResponseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
public class TestController {

    private final ResponseService responseService;

    @GetMapping ("/success")
    public CommonResponse success() {
        CommonResponse response = responseService.getSuccessfulResult();
        return response;
    }

    @GetMapping ("/fail")
    public CommonResponse fail() {
        CommonResponse response = responseService.getFailResponse(-1000, "Fail");
        return response;
    }
}
