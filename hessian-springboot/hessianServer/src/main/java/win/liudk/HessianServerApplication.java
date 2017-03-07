package win.liudk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianServiceExporter;

@SpringBootApplication
public class HessianServerApplication {

	@Autowired
	HessianTestService hessianTestService;

	@Bean(name = "/hessianTestBean")
	public HessianServiceExporter hessianTestBean(){
		HessianServiceExporter hessianServiceExporter = new HessianServiceExporter();
		hessianServiceExporter.setService(hessianTestService);
		hessianServiceExporter.setServiceInterface(HessianTestService.class);
		return hessianServiceExporter;
	}

	public static void main(String[] args) {
		SpringApplication.run(HessianServerApplication.class, args);
	}

}
