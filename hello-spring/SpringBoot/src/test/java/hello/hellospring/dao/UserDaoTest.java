package hello.hellospring.dao;

import springbook.user.dao.ConnectionMaker;
import springbook.user.dao.UserDao;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException,
            SQLException{
        ConnectionMaker connectionMaker = new DConnectionMaker();
        UserDao dao = new UserDao(connectionMaker);
    }
}
