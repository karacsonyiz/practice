package server.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    DataSource dataSource;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth)
            throws Exception {
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("select name, password, enabled from user where name=?")
                .authoritiesByUsernameQuery("select name, role from user where name=?");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests ()
                .requestMatchers("/login").permitAll()
                .requestMatchers("/js/**", "/css/**").permitAll()
                .requestMatchers("/**").hasAnyRole("USER", "ADMIN")
                .requestMatchers("/admin").hasAnyRole("ADMIN")
                .and()
                .formLogin()
                .loginPage("/login.html")
                .loginProcessingUrl("/process-login")
                .defaultSuccessUrl("/shop.html",true)
                .failureUrl("/login?error=true")
                .permitAll()
                .and()
                .logout()
                .logoutSuccessUrl("/login?logout=true")
                .deleteCookies("JSESSIONID")
                .invalidateHttpSession(true)
                .permitAll()
                .and()
                .csrf()
                .disable();

        return http.build();
    }

}
