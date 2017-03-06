package win.liudk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.management.remote.rmi.RMIServer;

/**
 * Created by dengke.liu on 2017/03/06.
 */
@Controller
public class Index {

    @Autowired
    RmiServer rmiServer;
/*
    //注意，这个服务的代理要以注入的形式赋值给hello变量
    @Autowired
    public void setHello(RmiServer rmiServer) {
        this.rmiServer = rmiServer;
    }
    public void sayHello()
    {
    //使用的rmi远程服务
        System.out.println(rmiServer.getUserName());
    }
*/

    @RequestMapping(method = RequestMethod.GET,value = "/name")
    @ResponseBody
    public String Index(){
        return rmiServer.getUserName();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/age")
    @ResponseBody
    public int Age(){
        return rmiServer.getUserAge();
    }
}
