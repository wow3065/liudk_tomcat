package win.liudk;

import org.springframework.stereotype.Component;

/**
 * Created by dengke.liu on 2017/03/06.
 */
@Component
public class RmiServerImpl implements RmiServer{


    @Override
    public String getUserName() {
        return "rmiServer Name is first";
    }

    @Override
    public int getUserAge() {
        return 31;
    }
}
