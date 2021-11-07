package com.hasng.gitrepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitRepositoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitRepositoryApplication.class, args);
    }
    public void test(){
        System.out.println("第一个");
        System.out.println("分支上操作");
        System.out.println("怎么找不到了");
    }

}
