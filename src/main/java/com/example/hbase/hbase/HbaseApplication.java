package com.example.hbase.hbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(scanBasePackages="com",exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication(scanBasePackages="com")
public class HbaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(HbaseApplication.class, args);
	}

}
