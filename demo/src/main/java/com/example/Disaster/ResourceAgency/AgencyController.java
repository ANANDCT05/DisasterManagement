package com.example.Disaster.ResourceAgency;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@CrossOrigin(origins = "http://localhost:5500", allowedHeaders = "*")
public class AgencyController {
    @Autowired
    private AgencyService as;
@GetMapping("api/chat")
public String chat(){
    return "chat";
}
@GetMapping("/api/info")
public String info(){
    return "Info";
}
@GetMapping("/api/login")
public String login(){
    return "Login";
}

@GetMapping("/api/map")
public String map(){
    return "Map";
}
   @GetMapping("/api/disaster")
   public String home(){
       return "Disaster";
   }
    @GetMapping("api/findAll")
    public String findAll(Model m){
        List<Agency> l=as.get();
        m.addAttribute("agencies",l);
        return "AgencyHome";
    }
    @GetMapping("/api/signup")
    public String call(){
        return "AgencySignUp";
    }
    @PostMapping("/ainsert")
    public String insert(@RequestBody MultiValueMap<String,String> p, Model model){
       String aname=p.getFirst("aname");
       int tm=Integer.parseInt(p.getFirst("tm"));
       String exp=p.getFirst("exper");
       String loc=p.getFirst("loc");
       String email=p.getFirst("email");
       String pass=p.getFirst("pass");
       String phoneNo=p.getFirst("PhoneNo");
       String re=p.getFirst("remark");
       Agency a=new Agency(aname,tm,exp,email,pass,loc,phoneNo,re);

       as.save(a);
        return "Login";
    }


}
