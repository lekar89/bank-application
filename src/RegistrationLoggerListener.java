import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Влад on 05.01.2017.
 */
public class RegistrationLoggerListener implements ClientRegistrationListener  {




    @Override
    public void onClientAdded(Client c) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println("Client"+c.getName() +"added on "+dateFormat.format(date));
    }
}
