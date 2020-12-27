package com.bale.kabang.samplespringbootdataneo4j;

import com.bale.kabang.samplespringbootdataneo4j.user.Role;
import com.bale.kabang.samplespringbootdataneo4j.user.User;
import com.bale.kabang.samplespringbootdataneo4j.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Neo4jRunner implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        User user1 = new User();
        user1.setName("bale");
        user1.setEmail("githong@kakao.com");

        User user2 = new User();
        user1.setName("miri");
        user1.setEmail("miri@kakao.com");

        Role role = new Role();
        role.setRoleName("family");

        user1.getRoles().add(role);
        user2.getRoles().add(role);

        userRepository.save( user1 );
        userRepository.save( user2 );

        System.out.println("___Bale___ FINISH!!!");
    }
}
