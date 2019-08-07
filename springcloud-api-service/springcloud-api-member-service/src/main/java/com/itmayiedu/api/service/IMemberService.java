package com.itmayiedu.api.service;

import com.itmayiedu.api.entity.User;
import org.springframework.stereotype.Service;


public interface IMemberService {

    public User getMember(Integer id);

}
