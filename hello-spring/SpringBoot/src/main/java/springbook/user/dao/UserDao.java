package springbook.user.dao;

import springbook.user.domain.User;

import java.sql.Connection;
import java.sql.SQLException;

public class UserDao {
    private ConnectionMaker connectionMaker;

    public UserDao(ConnectionMaker connectionMaker){
        this.connectionMaker = connectionMaker;
    }

    public void add(User user) throws ClassNotFoundException, SQLException{
        Connection c = connectionMaker.makeConnection();
    }

    public User get(String id) throws ClassNotFoundException, SQLException{
        Connection c = connectionMaker.makeConnection();
    }
}
