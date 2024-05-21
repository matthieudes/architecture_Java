package com.ipi.jva324;

import com.ipi.jva324.stock.model.ProduitEnStock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Jva324StockApplication {

	public static void main(String[] args) {
		SpringApplication.run(Jva324StockApplication.class, args);
	}
	@Bean
	public RepositoryRestConfigurer repositoryRestConfigurer(){
		return RepositoryRestConfigurer.withConfig(config -> { config.exposeIdsFor( ProduitEnStock.class);});
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	/**

	 else can't resolve HTML views because no defaultViewResolver
	 because no WebMvcAutoConfiguration even with @EnableWebMvc*////@Configuration
	public class TriggeringWebMvcAutoConfiguration extends WebMvcAutoConfiguration {

		public TriggeringWebMvcAutoConfiguration() {

		}

	}

}