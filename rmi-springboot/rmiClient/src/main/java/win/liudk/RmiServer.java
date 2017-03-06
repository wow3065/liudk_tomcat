package win.liudk;

import org.springframework.stereotype.Component;

/**
 * Created by dengke.liu on 2017/03/06.
 */
@Component
public interface RmiServer {

    public String getUserName();
    public int getUserAge();

}
