package com.acme.mytrader.stocks.models.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.acme.mytrader.stocks.models.User;


@Transactional
@Repository
public interface UserDao extends CrudRepository<User, Integer> {

    User findByUserName(String userName);

    User findByUid(int uid);

}
