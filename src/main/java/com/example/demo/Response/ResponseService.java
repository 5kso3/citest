package com.example.demo.Response;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseService {

    public <T> SingleResponse<T> singleResponse(T data) {
        SingleResponse<T> response = new SingleResponse<T>();
        response.setData(data);
        this.setSuccessResult(response);
        return response;
    }

    public <T> ListResponse<T> listResponse(List<T> list) {
        ListResponse<T> result = new ListResponse<T>();
        result.setList(list);
        this.setSuccessResult(result);
        return result;
    }

    public CommonResponse getSuccessfulResult() {
        CommonResponse result = new CommonResponse();
        this.setSuccessResult(result);
        return result;
    }

    public CommonResponse getFailResponse(int code, String message) {
        CommonResponse response = new CommonResponse();
        response.setSuccess(false);
        response.setCode(code);
        response.setMessage(message);
        return response;
    }

    private void setSuccessResult(CommonResponse response) {
        response.setSuccess(true);
        response.setCode(200);
        response.setMessage("Success");
    }
}
