package br.com.kaiomelo.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tab_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String number;
    private String agency;
    @Column(precision = 13, scale = 2)
    private BigDecimal balance;
    @Column(name = "additional_limit", precision = 13, scale = 2)
    private BigDecimal limit;

    public Account() {
    }

    public Account(Long id, String number, String agency, BigDecimal balance, BigDecimal limit) {
        this.id = id;
        this.number = number;
        this.agency = agency;
        this.balance = balance;
        this.limit = limit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}