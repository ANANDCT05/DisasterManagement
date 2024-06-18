package com.example.Disaster.ResourceAgency;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgencyService {

@Autowired
    private AgencyRepository ar;


public void save(Agency a){
    ar.save(a);
}
public List<Agency> get(){
    return ar.findAll();
}
}
