import java.util.ArrayList;


public class Client {
    private String name;
    //private String gender;
    private ArrayList<AbstractAccount> deposits;
    private AbstractAccount activeDeposit;
    Gender gender;
    enum Gender { male,female }


    public Client(String name, Gender gender) {
        this.name = name;
        this.gender=gender;

    }

    public void addDeposit(AbstractAccount newDeposit) {
        if (deposits == null) {
            deposits = new ArrayList<AbstractAccount>();
            deposits.add(newDeposit);
            activeDeposit = newDeposit;
        }
        else deposits.add(newDeposit);
    }


    public void makeActive(AbstractAccount deposit) {
        if (deposits == null) return;
        if (deposits.contains(deposit)) activeDeposit = deposit;

    }

    public double getTotalBalance() {
        double res = 0;
        for (AbstractAccount deposit : deposits
                ) {
            res += deposit.getBalance();
        }
        return res;
    }

    @Override
    public String toString() {
        String res = getName() + " " + getGender() + " ";
        for (AbstractAccount deposit : deposits
                ) {
            res += deposit.toString();
        }
        return res;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Client equalsClient = (Client) obj;
        if (equalsClient.getName().equals(this.getName()) && equalsClient.getGender().equals(this.getGender())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + gender.hashCode();
        return result;
    }


    //    @Override
//    public int hashCode() {
//        int res = 0;
//        char[] tmpGender = gender.toCharArray();
//        char[] tmpName = name.toCharArray();
//        for (int i = 0; i < tmpName.length; i++) {
//            res += (int) tmpName[i];
//        }
//        for (int i = 0; i < tmpGender.length; i++) {
//            res += (int) tmpGender[i];
//        }
//        return res;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {

        this.gender = gender;
    }

    public ArrayList<AbstractAccount> getDeposits() {
        return deposits;
    }

    public void setDeposits(ArrayList<AbstractAccount> deposits) {
        this.deposits = deposits;
    }

    public AbstractAccount getActiveDeposit() {
        return activeDeposit;
    }

    public void setActiveDeposit(AbstractAccount activeDeposit) {
        this.activeDeposit = activeDeposit;
    }
}
