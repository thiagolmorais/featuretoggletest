package featuretoggletest;

import java.util.concurrent.ExecutionException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.rollout.rox.server.Rox;

@SpringBootApplication
public class Configuration {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		SpringApplication.run(Configuration.class, args);
		Rox.setup("5d35c45dcef26d2993d4e5fa").get();
	}
}
