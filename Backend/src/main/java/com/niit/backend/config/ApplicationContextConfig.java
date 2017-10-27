package com.niit.backend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.backend.model.Cart;
import com.niit.backend.model.Category;
import com.niit.backend.model.Product;
import com.niit.backend.model.Supplier;
import com.niit.backend.model.User;

@Configuration
@ComponentScan("com.niit.backend")
@EnableTransactionManagement
public class ApplicationContextConfig {

    @Bean(name="datasource")
    public DataSource getDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:tcp://localhost/~/Placement");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        return dataSource;
    }
    
    @Bean
    public SessionFactory sessionFactory() {
        LocalSessionFactoryBuilder lsf=    new LocalSessionFactoryBuilder(getDataSource());
        Properties hibernateProperties=new Properties();
        hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
        hibernateProperties.setProperty("hibernate.show_sql", "true");
        lsf.addProperties(hibernateProperties);
        Class classes[]=new Class[]{Category.class,User.class,Product.class,Cart.class,Supplier.class};
        return lsf.addAnnotatedClasses(classes).buildSessionFactory();
    }
    @Bean
    public HibernateTransactionManager hibTransManagement(){
        return new HibernateTransactionManager(sessionFactory());
    }
    
  
}