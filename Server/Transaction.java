/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.Serializable;

/**
 *
 * @author Sundu
 */
public class Transaction implements Serializable {
    private String uid;
    private String comments;
    private java.sql.Timestamp dt;

    Transaction(String uid, String comments, java.sql.Timestamp dt)
    {
        this.uid=uid;
        this.comments=comments;
        this.dt = dt;
    }
    /**
     * @return the uid
     */
    public String getUid() {
        return uid;
    }

    /**
     * @param uid the uid to set
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * @return the dt
     */
    public java.sql.Timestamp getDt() {
        return dt;
    }

    /**
     * @param dt the dt to set
     */
    public void setDt(java.sql.Timestamp dt) {
        this.dt = dt;
    }
    
    
}
