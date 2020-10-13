package vmware.gemfiresample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.config.annotation.EnableClusterConfiguration;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;

@SpringBootApplication
@EnableEntityDefinedRegions(basePackageClasses = Sentiment.class)
@EnableClusterConfiguration()
public class GemfireSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GemfireSampleApplication.class, args);
	}

}
