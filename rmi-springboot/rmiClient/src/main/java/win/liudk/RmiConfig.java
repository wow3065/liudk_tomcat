package win.liudk;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

/**
 * Created by dengke.liu on 2017/03/06.
 */
@Configuration
public class RmiConfig {

    //创建rmi的代理

    @Bean(name="rmiServerProxy")
    public RmiProxyFactoryBean rmiProxy()
    {
        RmiProxyFactoryBean rpfb = new RmiProxyFactoryBean();
        //访问rmi，ip，端口，和rmi名字
        rpfb.setServiceUrl("rmi://172.16.120.20:1919/rmiServer");
        //设置代理类代理的接口
        rpfb.setServiceInterface(RmiServer.class);
        return rpfb;
    }
}
