package wx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ServletComponentScan
@SpringBootApplication(scanBasePackages = "wx")
@EnableJpaRepositories("wx.persistence.repo")
@EntityScan("wx.persistence.model")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
