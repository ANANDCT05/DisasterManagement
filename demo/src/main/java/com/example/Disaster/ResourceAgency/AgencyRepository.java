package com.example.Disaster.ResourceAgency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AgencyRepository {
    @Autowired
    private JdbcClient jc;


    RowMapper<Agency> ord=(rs, rowNo)->{
        String aname=rs.getString("aname");
        int tm=rs.getInt("tm");
        String exp=rs.getString("Exp");
        String email=rs.getString("Email");
        String pass=rs.getString("pass");
        String loc=rs.getString("loc");
        String phoneNo=rs.getString("phoneNo");
        String remark=rs.getString("remark");
        Agency a= new Agency(aname,tm,exp,email,pass,loc,phoneNo,remark);

        return a;

    };


    public void save(Agency a){
       jc.sql("insert into agency values (:aname,:t,:e,:em,:pas,:loc,:ph,:remark)")
               .param("aname",a.getAname())
               .param("t",a.getTm())
               .param("e",a.getExper())
               .param("em",a.getEmail())
               .param("pas",a.getPass())
               .param("loc",a.getLoc())
               .param("ph",a.getPhoneNo())
               .param("remark",a.getRemark())
               .update();
    }

    List<Agency> findAll(){
        return jc.sql("Select * from Agency")
                .query(ord).list();
    }
}
