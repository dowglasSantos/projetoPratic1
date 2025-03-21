package br.com.dowglas.DAO;

import java.util.Map;
import java.util.HashMap;
import br.com.dowglas.domain.Client;

public class ClientMapDAO implements IClientDAO {
    Client client = new Client();
    private Map<String, Client> map;
    
    public ClientMapDAO() {
        this.map = new HashMap<>();
    }

    public Boolean registerClient() {
        System.out.println("registerClient");
        if(map.containsKey(client.getCpf())) {
            System.out.println("Usuario já cadastrado");
        } else {
            map.put(client.getCpf(), client);
        }
    }

    public void updateClient() {
        System.out.println("updateClient");
    }

    public void removeClient() {
        System.out.println("removeClient");
    }

    public Client consultClient() {
        System.out.println("consultClient");
    }

    public Collections<Client> getCients() {
        System.out.println("getCients");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((client == null) ? 0 : client.hashCode());
        result = prime * result + ((map == null) ? 0 : map.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ClientMapDAO other = (ClientMapDAO) obj;
        if (client == null) {
            if (other.client != null)
                return false;
        } else if (!client.equals(other.client))
            return false;
        if (map == null) {
            if (other.map != null)
                return false;
        } else if (!map.equals(other.map))
            return false;
        return true;
    }

    

}
