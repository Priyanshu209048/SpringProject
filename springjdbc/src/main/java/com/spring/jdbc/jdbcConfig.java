package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImple;

@Configuration  //This is used when we want to use the java file to make connection instead of xml file
@ComponentScan(basePackages = {"com.spring.jdbc.dao"})
public class jdbcConfig {
	
	@Bean(name = {"ds"})
	public DataSource getDataSource() {		//Data source is the parent class which is interface
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("mysql12345");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	//This can not be required if we do autowiring
//	@Bean("studentDao")
//	public StudentDao getStudentDao() {		//StudnetDao is an interface and StudentDaoImple implement that interface
//		StudentDaoImple studentDaoImple = new StudentDaoImple();
//		studentDaoImple.setJdbcTemplate(getTemplate());
//		return studentDaoImple;
//	}
}
