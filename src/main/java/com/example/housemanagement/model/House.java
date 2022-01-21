package com.example.housemanagement.model;

public class House {
    private int reqid ;
    private int houseNo ;
    private String status ;
    private String type;


    public int getReqid() {
        return reqid;
    }

    public void setReqid(int reqid) {
        this.reqid = reqid;
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
        return "{" +
                "reqid=" + reqid +
                ", houseNo=" + houseNo +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
