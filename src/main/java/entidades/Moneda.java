/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author alexa
 */
public class Moneda {
    
   private int currency_id;
    private String currency_name;
    private String currency_symbol;

    public Moneda() {
    }

    public Moneda(int currency_id, String currency_name, String currency_symbol) {
        this.currency_id = currency_id;
        this.currency_name = currency_name;
        this.currency_symbol = currency_symbol;
    }

    public int getCurrency_id() {
        return currency_id;
    }

    public void setCurrency_id(int currency_id) {
        this.currency_id = currency_id;
    }

    public String getCurrency_name() {
        return currency_name;
    }

    public void setCurrency_name(String currency_name) {
        this.currency_name = currency_name;
    }

    public String getCurrency_symbol() {
        return currency_symbol;
    }

    public void setCurrency_symbol(String currency_symbol) {
        this.currency_symbol = currency_symbol;
    }

    @Override
    public String toString() {
        return "Moneda{" + "currency_id=" + currency_id + ", currency_name=" + currency_name + ", currency_symbol=" + currency_symbol + '}';
    }
    
    
    
}
