package com.example.housemanagement.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HouseAttri {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int houseId ;
    private int houseNo ;
    private String status ;
    private String type ;

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "HouseAttri{" +
                "houseId=" + houseId +
                ", houseNo=" + houseNo +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
