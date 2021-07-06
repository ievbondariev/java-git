package homework4.services;

import homework4.entities.Client;
import homework4.utils.Helper;

public class ServiceTransaction {

    public void sendMoney (Client client, String account) {
        Helper helper = new Helper();
        helper.checkAccount(client.getAccount(), account);
    }
}
