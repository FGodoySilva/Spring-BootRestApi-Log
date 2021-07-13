package br.com.fabiane.DesafioSpringLog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


/**
 * 
 * @author fabiane godoy
 *
 */

@SpringBootApplication
@ComponentScan(basePackages = { "br.com.fabiane.DesafioSpringLog" })
@EntityScan(basePackages = { "br.com.fabiane.DesafioSpringLog.model" })

public class DesafioSpringLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioSpringLogApplication.class, args);
	}

}
