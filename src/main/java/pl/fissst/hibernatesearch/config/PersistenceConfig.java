package pl.fissst.hibernatesearch.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("pl.fissst.hibernatesearch.domain")
public class PersistenceConfig {
}
