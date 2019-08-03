package com.hbc.chatroom.dao;

import com.alibaba.druid.pool.DruidPooledConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @Author: Beer
 * @Date: 2019/8/3 9:59
 * @Description:
 */
public class AccountDao  extends BaseDao{
    private BaseDao accountDao = new AccountDao();

    //用户登录
    public static ResultSet userLogin(String username, String password) {

        return null;
    }

    //用户注册
    public static void userRegister() {
        Connection connection = null;
        PreparedStatement statement = null;



    }


}
