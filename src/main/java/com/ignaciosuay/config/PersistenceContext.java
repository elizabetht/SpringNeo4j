package com.ignaciosuay.config;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by natxo on 17/12/16.
 */
@Configuration
@EnableTransactionManagement
@ComponentScan("com.ignaciosuay")
@EnableNeo4jRepositories("com.ignaciosuay.repository")
public class PersistenceContext extends Neo4jConfiguration {

    public static final String URL = System.getenv("NEO4J_URL") != null ? System.getenv("NEO4J_URL") : "http://neo4j:suayi@localhost:7474";

    @Bean
    public org.neo4j.ogm.config.Configuration getConfiguration() {
        org.neo4j.ogm.config.Configuration config = new org.neo4j.ogm.config.Configuration();
        config
                .driverConfiguration()
                .setDriverClassName("org.neo4j.ogm.drivers.http.driver.HttpDriver")
                .setURI(URL);
        return config;
    }


    @Override
    public SessionFactory getSessionFactory() {
        return new SessionFactory(getConfiguration(),"com.ignaciosuay.domain");
    }
}
