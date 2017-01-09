 import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Bank privat = new Bank();


        privat.addListener(new RegistrationLoggerListener());
        privat.addListener(new PrintClientListener());
        privat.addListener(new EmailNotificationListener());

        Client yanukovich = new Client("Виктор Фёдорович Янукович", Client.Gender.MALE);
        Client juniorYanukovich = new Client("Виктор Викторович Януковичч", Client.Gender.MALE);
        Client luda = new Client("Людмила Александровна Янукович", Client.Gender.FEMALE);
        Client azyrov = new Client("Николай Янович Азаров", Client.Gender.MALE);
        Client yula = new Client("Юлия Владимировна Тимошенко", Client.Gender.FEMALE);







        yanukovich.addDeposit(new CheckingAccount(1000.0, 100000.0));
        yanukovich.addDeposit(new SavingAccount(-200000.0));

        juniorYanukovich.addDeposit(new CheckingAccount(10000.0, 10000.0));
        juniorYanukovich.addDeposit(new CheckingAccount(40000.0, 560000.0));
        juniorYanukovich.addDeposit(new SavingAccount(100000.0));

        luda.addDeposit(new CheckingAccount(10420.0, 10000.0));
        luda.addDeposit(new CheckingAccount(40034.0, 5600.0));
        luda.addDeposit(new SavingAccount(145340.0));

        azyrov.addDeposit(new CheckingAccount(1042.0, 1500.0));
        azyrov.addDeposit(new CheckingAccount(4000.0, 56000.0));
        azyrov.addDeposit(new SavingAccount(14500.0));

        yula.addDeposit(new CheckingAccount(1040.0, 100.0));
        yula.addDeposit(new CheckingAccount(40034.0, 560.0));
        yula.addDeposit(new SavingAccount(145340.0));

        privat.addClient(yanukovich);
        privat.addClient(juniorYanukovich);
        privat.addClient(luda);
        privat.addClient(azyrov);
        privat.addClient(yula);



       // System.out.println( privat.getClientInf(new Scanner(System.in).nextLine()));
    }

}