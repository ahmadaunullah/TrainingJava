package com.ecommerce.ecommerce.service;

import com.ecommerce.ecommerce.dto.CreateUserDto;
import com.ecommerce.ecommerce.model.User;
import com.ecommerce.ecommerce.repository.UserRepo;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.Media;
import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Map;

@Service
@Transactional(rollbackOn = Exception.class)
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> create(CreateUserDto dto){
        Map<String, Object> res = new HashMap<String, Object>();

        User user = new User();
        user.setUsername(dto.getUsername().trim());
        user.setPhone(dto.getPhone().trim());
        user.setAddress((dto.getAddress().trim()));

        userRepo.save(user);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
