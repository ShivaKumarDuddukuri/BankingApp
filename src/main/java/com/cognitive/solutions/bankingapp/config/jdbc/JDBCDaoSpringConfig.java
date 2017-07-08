package com.cognitive.solutions.bankingapp.config.jdbc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.naming.NamingException;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class JDBCDaoSpringConfig {

    private static final String DB_SCRIPTS_LOCATION = "db_scripts/mysql//";
    private static final String SQL_MIGRATION_PREFIX = "transactions_v";
    private static final String SCHEMA = "transactions";

    @Value("${com.cognitive.solutions.bankingapp.transaction.driverClassName}")
    private String driverClassName;

    @Value("${com.cognitive.solutions.bankingapp.transaction.url}")
    private String url;

    @Value("${com.cognitive.solutions.bankingapp.transaction.userName}")
    private String userName;

    @Value("${com.cognitive.solutions.bankingapp.transaction.password}")
    private String password;


    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        return dataSource;
    }

}
