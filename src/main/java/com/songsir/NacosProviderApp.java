package com.songsir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PackageName com.songsir
 * @ProjectName nocas-provider
 * @Auther: SongYapeng
 * @Date: Create in 7:52 2020/7/6
 * @Description:
 * @Copyright Copyright (c) 2020, songsir01@163.com All Rights Reserved.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(NacosProviderApp.class, args);
    }

}
