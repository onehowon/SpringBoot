package springbook.user.dao;

import org.apache.logging.log4j.message.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springbook.user.domain.User;

@Configuration
public class DaoFactory {
    @Bean
    public UserDao userDao(){
        return new UserDao(connectionMaker());

    }

    public AccountDao accountDao(){
        return new AccountDao(connectionMaker());

    }

    public MessageDao messageDao(){
        return new MessageDao(connectionMaker());
    }

    @Bean
    public ConnectionMaker connectionMaker(){
        return new DConnectionMaker();
    }

    DaoFactory daoFactory = new DaoFactory();
    UserDao dao1 = factory.userDao();
    UserDao dao2 = factory.userDao();

    System.out.println(dao1);
    System.out.println(dao2);
}
