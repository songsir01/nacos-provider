package com.songsir.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageName com.songsir.controller
 * @ProjectName nocas-provider
 * @Auther: SongYapeng
 * @Date: Create in 9:42 2020/7/6
 * @Description:
 * @Copyright Copyright (c) 2020, songsir01@163.com All Rights Reserved.
 */
@RestController
public class ProviderController {

    @Value("${username:songsir2222}")
    private String username;

    @GetMapping("/helloWorld")
    public String helloWorld(@RequestParam(value = "name", defaultValue = "songsir", required = false) String name) {

        return username + name;
    }

}
