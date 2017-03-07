package win.liudk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dengke.liu on 2017/03/07.
 */
@RestController
public class Index {

    @Autowired
    HessianTestService hessianTestService;

    @RequestMapping("/test")
    public String Index(){
        return hessianTestService.helloWorld();
    }
}
