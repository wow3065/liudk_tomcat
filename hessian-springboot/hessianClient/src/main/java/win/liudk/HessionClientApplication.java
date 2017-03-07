package win.liudk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

@SpringBootApplication
public class HessionClientApplication {

	@Bean
	public HessianProxyFactoryBean HessianTestProxyBean(){
		HessianProxyFactoryBean hessianProxyFactoryBean = new HessianProxyFactoryBean();
		hessianProxyFactoryBean.setServiceUrl("http://localhost:8080/hessianTestBean");
		hessianProxyFactoryBean.setServiceInterface(HessianTestService.class);
		return hessianProxyFactoryBean;
	}

	public static void main(String[] args) {
		SpringApplication.run(HessionClientApplication.class, args);
	}


}
