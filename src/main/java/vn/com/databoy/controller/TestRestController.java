package vn.com.databoy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.com.databoy.entity.Regions;
import vn.com.databoy.repository.RegionsRepository;

@RestController
public class TestRestController {

    @Autowired
    private RegionsRepository regionsRepository;

    @GetMapping("/test")
    @Transactional
    public String index() {
        Regions regions = regionsRepository.findOne(1L);
        System.out.println(regions);
        return regions.toString();
    }
}