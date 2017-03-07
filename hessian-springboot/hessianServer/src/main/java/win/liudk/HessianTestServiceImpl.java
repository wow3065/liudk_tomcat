package win.liudk;

import org.springframework.stereotype.Component;

/**
 * Created by dengke.liu on 2017/03/06.
 */
@Component
public class HessianTestServiceImpl implements HessianTestService {

    @Override
    public String helloWorld() {
        return "This is hessian test...";
    }
}
