package br.com.dowglas.DAO;

import br.com.dowglas.domain.Client;

interface IClient {
    public Boolean registerClient();
    public void updateClient();
    public void removeClient();
    public Client consultClient();
    public Collections<Client> getCients();
}
