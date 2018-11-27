package com.lyt.lyt.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
@Configuration
@MapperScan(basePackages = "com.lyt.lyt.mapper.kaas",sqlSessionFactoryRef = "kaasSqlSessionFactory")
public class KaasDataSourceConfig {
    @Bean(name="kaasDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.kaas")
    public DataSource kaasDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean(name="kaasSqlSessionFactory")
    public SqlSessionFactory kaasSqlSessionFactory(@Qualifier("kaasDataSource") DataSource dataSource) throws Exception{
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
        return bean.getObject();
    }

    @Bean(name="kaasTransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("kaasDataSource")DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
    @Bean(name="kaasSqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("kaasSqlSessionFactory")SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
