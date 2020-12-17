package cn.kgc.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.kgc.user.mapper")
@SpringBootApplication
public class KmallManagerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KmallManagerServiceApplication.class, args);
	}

}
