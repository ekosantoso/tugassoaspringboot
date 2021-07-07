package com.tugassoa.tugassoa.controller;

import com.tugassoa.tugassoa.entity.Listrik;
import com.tugassoa.tugassoa.repository.ListrikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("listrik")
public class ListrikController {
    @Autowired
    private ListrikRepository listrikRepository;


    @GetMapping("/{userId}")
    public List<Listrik> getByUserId(@PathVariable("userId") String userId){
        System.out.println("aaa"+userId);
        return listrikRepository.findByUserID(userId);
    }

    @PostMapping
    public Listrik saveListrik(@RequestBody Listrik listrik){
        return listrikRepository.save(listrik);
    }
}
