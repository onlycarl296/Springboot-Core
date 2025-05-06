package com.springboot.core.controller;

import com.springboot.core.dto.request.ApiResponse;
import com.springboot.core.exception.ErrorCode;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
@RequestMapping("/check")
@FieldDefaults(level = AccessLevel.PUBLIC, makeFinal = true)
public class CheckController {

    @RequestMapping(method = {RequestMethod.GET})
    ResponseEntity<?> checkAPI(HttpServletRequest request){
        ErrorCode errorCode = ErrorCode.CHECK_API;
        var check = request.getAttribute("test");
        ResponseEntity<?> response = ResponseEntity.status(errorCode.getStatusCode())
                .body(ApiResponse.builder()
                        .message("Check API ")
                        .build());
        return  response ;
    }
}
