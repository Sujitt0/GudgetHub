/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.pojo;

import java.util.Date;

/**
 *
 * @author prashant yadav
 */
public class TransactionPojo {
    private String TransactionId;
    private String userEmail;
    private Date transTime;
    private double amount;

    public TransactionPojo() {
    }

    public TransactionPojo(String transcationId, String userEmail, Date transTime, double amount) {
        this.TransactionId = transcationId;
        this.userEmail = userEmail;
        this.transTime = transTime;
        this.amount = amount;
    }

    public String getTransactionId() {
        return TransactionId;
    }

    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Date getTransTime() {
        return transTime;
    }

    public void setTransTime(Date transTime) {
        this.transTime = transTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "TransactionPojo{" + "transcationId=" + TransactionId + ", userEmail=" + userEmail + ", transTime=" + transTime + ", amount=" + amount + '}';
    }
    
}
