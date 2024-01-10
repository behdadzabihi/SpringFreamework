package com.spring.training.orm.jpa.conf;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.TransactionManager;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class AppConfig {

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource());
        entityManagerFactoryBean.setPackagesToScan("com.spring.training.orm.entity");
        Properties properties = new Properties();
        properties.put("hibernate.dialect", "org.hibernate.dialect.PostgresPlusDialect");
        properties.put("hibernate.hbm2ddl.auto", "create");
        entityManagerFactoryBean.setJpaProperties(properties);
        entityManagerFactoryBean.setPersistenceProvider(new HibernatePersistenceProvider());
        return entityManagerFactoryBean;
    }

    @Bean
    public TransactionManager transactionManager(){
        return new JpaTransactionManager();
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/hibernate");
        dataSource.setPassword("123456");
        dataSource.setUsername("postgres");
        dataSource.setDriverClassName("org.postgresql.Driver");
        return dataSource;
    }
}
