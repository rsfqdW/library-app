package com.group.libraryapp.config;

import com.group.libraryapp.domain.user.UserRepository;
import com.group.libraryapp.repository.user.UserJdbcRepository;
import com.group.libraryapp.service.user.UserServiceV2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class UserConfiguration {

    @Bean(name = "UserRepository2")
    public UserJdbcRepository userRepository(JdbcTemplate jdbcTemplate){
        return new UserJdbcRepository(jdbcTemplate);
    }

    @Bean
    public UserServiceV2 userService(UserRepository userRepository){
        return new UserServiceV2(userRepository);
    }
}
