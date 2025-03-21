package br.com.dowglas.domain;

public class Client {
    private String name;
    private String cpf;
    private Long tell;
    private String address;
    private Integer number;
    private String city;
    private String state;
    private String country;

    public Client() {
        this.name = "";
        this.cpf = "";
        this.tell = null;
        this.address = "";
        this.number = null;
        this.city = "";
        this.state = "";
        this.country = "";
    }

    public Client(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public Client(String name, String cpf, Long tell, String address, Integer number, String city, String state, String country) {
        this(name, cpf);
        this.tell = tell;
        this.address = address;
        this.number = number;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Long getTell() {
        return tell;
    }
    public void setTell(Long tell) {
        this.tell = tell;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    
}
