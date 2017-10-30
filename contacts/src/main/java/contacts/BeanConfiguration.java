package contacts;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
public class BeanConfiguration {
    
    @Bean
    @Qualifier(value="dataSource")
    @Primary
    @ConfigurationProperties(prefix="c3p0")
    public DataSource dataSource() {
        return DataSourceBuilder.create().type(ComboPooledDataSource.class).build();
    }
    
//    @Bean
//    @Qualifier(value="jdbcTemplate")
//    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
//        return jdbcTemplate(dataSource);
//    }
}
