package myguru.springframework.didemo.config;

import myguru.springframework.didemo.examplebeans.FakeDataSource;
import myguru.springframework.didemo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration


public class PropertyConfig {
    @Value("${guru.username}")
    String user;
    @Value("${guru.password}")
    String password;
    @Value("${guru.dburl}")
    String url;

    @Value("${guru.jms.username}")
    String jmsUserName;

    @Value("${guru.jms.password}")
    String jmsPassword;

    @Value("${guru.jms.dburl}")
    String jmsUrl;
   @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }
    @Bean
    public FakeJmsBroker fakeJmsBroker(){
       FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
       fakeJmsBroker.setUser(jmsUserName);
       fakeJmsBroker.setPassword(jmsPassword);
       fakeJmsBroker.setUrl(jmsUrl);
       return fakeJmsBroker;
    }



}
