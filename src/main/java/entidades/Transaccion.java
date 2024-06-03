/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;

/**
 *
 * @author alexa
 */
public class Transaccion {
    
    private int transaction_id;
    private int sender_user_id;
    private int receiver_user_id;
    private double importe;
    private Date transaction_date;

    public Transaccion() {
    }

    public Transaccion(int transaction_id, int sender_user_id, int receiver_user_id, double importe, Date transaction_date) {
        this.transaction_id = transaction_id;
        this.sender_user_id = sender_user_id;
        this.receiver_user_id = receiver_user_id;
        this.importe = importe;
        this.transaction_date = transaction_date;
    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public int getSender_user_id() {
        return sender_user_id;
    }

    public void setSender_user_id(int sender_user_id) {
        this.sender_user_id = sender_user_id;
    }

    public int getReceiver_user_id() {
        return receiver_user_id;
    }

    public void setReceiver_user_id(int receiver_user_id) {
        this.receiver_user_id = receiver_user_id;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Date getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(Date transaction_date) {
        this.transaction_date = transaction_date;
    }

    @Override
    public String toString() {
        return "Transaccion{" + "transaction_id=" + transaction_id + ", sender_user_id=" + sender_user_id + ", receiver_user_id=" + receiver_user_id + ", importe=" + importe + ", transaction_date=" + transaction_date + '}';
    }
    
    
    
}
