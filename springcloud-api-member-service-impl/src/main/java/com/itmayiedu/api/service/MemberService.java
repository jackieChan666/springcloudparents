package com.itmayiedu.api.service;

import com.itmayiedu.api.dao.IMemberDao;
import com.itmayiedu.api.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService implements IMemberService{

    @Autowired
    private IMemberDao memberDao;

    public User getMember(Integer id){

        System.out.println("Service层："+id);


        User user=memberDao.getMember(id);

        return user;



        }

}
