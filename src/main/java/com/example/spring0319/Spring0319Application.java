package com.example.spring0319;

import com.example.spring0319.entiry.Company;
import com.example.spring0319.repository.CompanyRepository;
import com.example.spring0319.vo.ConsumerGreetingVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class Spring0319Application {

    @Autowired
    private CompanyRepository companyRepository;

    private static final Logger log = LoggerFactory.getLogger(Spring0319Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Spring0319Application.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        Company company = new Company();
        company.setCompanyName("美团");
        companyRepository.save(company);
        return args -> {
            ConsumerGreetingVO greetingVO = restTemplate.getForObject(
                    "http://localhost:8080/greeting", ConsumerGreetingVO.class);
            log.info(greetingVO.toString());
        };
    }


}
