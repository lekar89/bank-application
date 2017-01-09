/**
 * Created by Влад on 09.01.2017.
 */
public class EmailNotificationListener  implements ClientRegistrationListener {
    @Override
    public void onClientAdded(Client c) {
        System.out.println("Notification email for client "+c.getName()+" has been sent");
    }
}
