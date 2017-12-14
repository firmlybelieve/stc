package com.stc.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stc.entity.UserEntity;

/**
 * Created by Administrator on 2017/5/12.
 */

@Repository
public interface UserDao extends CrudRepository<UserEntity,Long>{

    public UserEntity findByUsernameAndPassword(String username,String password);

}
