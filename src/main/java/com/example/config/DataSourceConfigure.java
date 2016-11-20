package com.example.config;

import net.chandol.logjdbc.LogJdbcDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import javax.sql.DataSource;

import static org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType.H2;

/**
 * Created by hwang on 2016-11-17.
 */

//Q. Configuration 어노테이션 원리
@Configuration
public class DataSourceConfigure {
    @Bean
    public DataSource getDataSource(ResourceLoader resourceLoader) {
        EmbeddedDatabase database = new EmbeddedDatabaseBuilder(resourceLoader)
                 .setType(H2)
                .build();

        return new LogJdbcDataSource(database);
    }
}
