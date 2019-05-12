package testmaker;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@MapperScan("testmaker.dao")
public class TestmakerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestmakerApplication.class, args);
    }

}
