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
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
@Configuration
@MapperScan(basePackages = "com.lyt.lyt.mapper.knet",sqlSessionFactoryRef = "knetSqlSessionFactory")
public class KnetDataSourceConfig {
    @Bean(name="knetDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.knet")
    @Primary
    public DataSource knetDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean(name="knetSqlSessionFactory")
    @Primary
    public SqlSessionFactory knetSqlSessionFactory(@Qualifier("knetDataSource") DataSource dataSource) throws Exception{
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);//设置驼峰映射
        return bean.getObject();
    }

    @Bean(name="knetTransactionManager")
    @Primary
    public DataSourceTransactionManager testTransactionManager(@Qualifier("knetDataSource")DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
    @Bean(name="knetSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("knetSqlSessionFactory")SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
