import java.util.ArrayList;

public class Manager {
    private ArrayList<ATM_account> accs = new ArrayList<ATM_account>();

    public Manager(ArrayList<ATM_account> accs) {
        this.accs = accs;
    }

    public Manager() {
    }

    public void add(ATM_account acc) {
        accs.add(acc);
    }
    public boolean have(int idd){
        for (int i = 0; i < accs.size(); i++) {
            if (accs.get(i).getId() == idd) {
                return true;
            }
        }
        return false;
    }
    public ATM_account seachr(int idd) {
        for (int i = 0; i < accs.size(); i++) {
            if (accs.get(i).getId() == idd) {
                return accs.get(i);
            }
        }
        return null;
    }
}
