package win.liudk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

/**
 * Created by dengke.liu on 2017/03/06.
 */
@Configuration
public class RMIClientConfig {

    //将实现stub的类注入
    @Autowired
    private RmiServer rmiServer;

    //下面的bean将远程调用的接口暴露给外界客户端
    @Bean
    public RmiServiceExporter serviceExporter()
    {

        RmiServiceExporter rse = new RmiServiceExporter();
        //rmi访问的名字是Hello
        rse.setServiceName("rmiServer");
        //rmi访问的端口号是1919
        rse.setRegistryPort(1919);
        //rmi暴露给外部的访问接口是HelloInterface接口
        rse.setServiceInterface(RmiServer.class);
        //rmi实际使用的是Hello类的对象
        rse.setService(rmiServer);

        return rse;

    }
}
