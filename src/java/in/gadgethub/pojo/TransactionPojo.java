/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.pojo;

import java.sql.Date;

/**
 *
 * @author Sujit Prajapati
 */
public class TransactionPojo {
    private String transId;
    private String useremail;
    private Date transTime;
    private double amount;

    public TransactionPojo() {
    }

    public TransactionPojo(String transId, String useremail, Date transTime, double amount) {
        this.transId = transId;
        this.useremail = useremail;
        this.transTime = transTime;
        this.amount = amount;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
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
        return "TransactionPojo{" + "transId=" + transId + ", useremail=" + useremail + ", transTime=" + transTime + ", amount=" + amount + '}';
    }
    
}
