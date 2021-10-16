package com.example.data;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(DataRepository repository) {
        return args -> {
            log.info("Preloading" + repository.save(new Data(1234568L, "GALAKSI", "POPPIE PERTIWI",
                    "2018", "NOVEL", 39000L )));
            log.info("Preloading" + repository.save(new Data(123466L, "SEJARAH MUSIK 2", "RHODERICK J.MCNEILL",
                    "2000", "SEJARAH", 172000L )));
            log.info("Preloading" + repository.save(new Data(1242465L, "KUNGFU BOY LEGENDS", "TAKESHI MAEKAWA",
                    "2007", "KOMIK", 28000L )));
        };
    }
}
