package microstamp.stpa.step2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @EnableFeignClients enablescomponent scanning for interfaces
 * that declare themselves as Feign clients
 */
@SpringBootApplication
@EnableFeignClients
public class MicrostampStep2BackendPagliaresApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrostampStep2BackendPagliaresApplication.class, args);
	}

}
