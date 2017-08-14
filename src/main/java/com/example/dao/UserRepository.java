package com.example.dao;

import com.example.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 2017/8/14.
 */
public interface UserRepository  extends CrudRepository<User,Long>{

}
