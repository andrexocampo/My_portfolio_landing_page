package com.portafolio.My_portfolio_landing_page;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MyPortfolioLandingPageApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyPortfolioLandingPageApplication.class, args);
	}

}
