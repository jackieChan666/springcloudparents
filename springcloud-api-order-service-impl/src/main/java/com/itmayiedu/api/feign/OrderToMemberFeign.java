package com.itmayiedu.api.feign;

import com.itmayiedu.api.controller.IMemberController;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("app-itmayiedu-member")
public interface OrderToMemberFeign extends IMemberController {
//        @GetMapping("/getMember")
//        public String getMember(Integer id);
}
