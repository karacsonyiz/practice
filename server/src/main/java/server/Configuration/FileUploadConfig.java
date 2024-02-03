package server.Configuration;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

@Configuration
public class FileUploadConfig {

    @Bean(name = "multipartResolver")
    public StandardServletMultipartResolver multipartResolver(HttpServletRequest request) {
        StandardServletMultipartResolver multipartResolver = new StandardServletMultipartResolver();
        multipartResolver.resolveMultipart(request);
        return multipartResolver;
    }
}
