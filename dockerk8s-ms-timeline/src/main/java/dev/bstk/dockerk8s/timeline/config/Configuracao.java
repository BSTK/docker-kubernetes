package dev.bstk.dockerk8s.timeline.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuracao {

    @Bean
    public ModelMapper mapper() {
        return new ModelMapper();
    }
}
