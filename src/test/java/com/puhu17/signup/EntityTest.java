package com.puhu17.signup;

import com.puhu17.signup.entity.UserInformation;
import com.puhu17.signup.persistence.UserInformationRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class EntityTest {

    @Autowired
    private UserInformationRepository userInformRepository;


    //@Test
    public void insertTest(){
        UserInformation userInform = UserInformation.builder().email("puhu11@gmail.com").id("puhu17").name("기현").password("23fcj23kclzia").build();
        userInformRepository.save(userInform);
    }
    @Test
    public void getOne(){
        List<UserInformation>  userInformation =userInformRepository.findAll();
        userInformation.stream().forEach(i->{
            System.out.println(i);
            System.out.print(i.getRegDate());
        });
    }

}
