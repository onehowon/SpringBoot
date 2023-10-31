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
}
