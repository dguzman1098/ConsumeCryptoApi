package com.example.apiexchange;

import com.example.apiexchange.models.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class ApiExchangeApplication {

	private static final Logger logger = LoggerFactory.getLogger(ApiExchangeApplication.class);
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	public static void main(String[] args) {
		SpringApplication.run(ApiExchangeApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();

	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
		return args -> {

		};
	}

	@Scheduled(fixedRate = 3000)
	public void fetchData(){
		RestTemplate restTemplate = new RestTemplate();
		Data[] data = restTemplate.getForObject(
				"https://api.n.exchange/en/api/v1/price/BTCLTC/latest/?market_code=nex", Data[].class);
		logger.info("The time is now {}", dateFormat.format(new Date()));
		logger.info(Arrays.toString(data));
	}

}
