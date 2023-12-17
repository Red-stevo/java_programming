package com.practice.redsteve.springbeanlifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBeanLifeCycleApplication {

    public static void main(String[] args)throws Exception {
        //SpringApplication.run(SpringBeanLifeCycleApplication.class, args);

        MemberDAO memberDAO = new MemberDAO();

        //run the connection function.
        memberDAO.createConnection();


        memberDAO.readTable("memeberTable");

        //sql injection
       // memberDAO.readTable(" trasportCompanySchema.memeberTable WHERE memberRegNo='M0010'");
        memberDAO.deleteMember("M005");

        memberDAO.closeConnection();

    }

}
