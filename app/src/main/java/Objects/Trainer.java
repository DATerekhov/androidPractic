package Objects;

import org.bson.types.ObjectId;

import java.util.List;

public class Trainer extends User {

    protected String information;
    protected List<Client> clients;

    public Trainer(ObjectId _id, String _login, String _password, String _role, String _fio, Object _foto, String _contacts, String information, List<Client> clients) {
        super(_id, _login, _password, _role, _fio, _foto, _contacts);
        this.information = information;
        this.clients = clients;
    }

    public Trainer(String information, List<Client> clients) {
        this.information = information;
        this.clients = clients;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public void AddClient(Client client) {
        clients.add(client);
    }
}