package com.example.Disaster.ResourceAgency;

public class Agency {
    private String aname;
    private int tm;
    private String exper;
    private String email;
    private String pass;
    private String loc;

    private String PhoneNo;
    private String remark;

    public String getAname() {
        return aname;
    }
    public void setAname(String aname) {
        this.aname = aname;
    }
    public int getTm() {
        return tm;
    }
    public void setTm(int tm) {
        this.tm = tm;
    }
    public String getExper() {
        return exper;
    }
    public void setExper(String exper) {
        this.exper = exper;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getLoc() {
        return loc;
    }
    public void setLoc(String loc) {
        this.loc = loc;
    }
    public String getPhoneNo() {
        return PhoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Agency(String aname, int tm, String exper, String email, String pass, String loc, String phoneNo,
                  String remark) {
        super();
        this.aname = aname;
        this.tm = tm;
        this.exper = exper;
        this.email = email;
        this.pass = pass;
        this.loc = loc;
        PhoneNo = phoneNo;
        this.remark = remark;
    }

}

