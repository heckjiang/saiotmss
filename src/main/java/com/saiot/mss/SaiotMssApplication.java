package com.saiot.mss;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 启动程序
 * 
 * @author jiangjun
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.saiot.mss.project.*.*.mapper")
public class SaiotMssApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(SaiotMssApplication.class, args);
        System.out.println("Saiot启动成功 \n" +
                ":'######:::::'###::::'####::'#######::'########:\n" +
                "'##... ##:::'## ##:::. ##::'##.... ##:... ##..::\n" +
                " ##:::..:::'##:. ##::: ##:: ##:::: ##:::: ##::::\n" +
                ". ######::'##:::. ##:: ##:: ##:::: ##:::: ##::::\n" +
                ":..... ##: #########:: ##:: ##:::: ##:::: ##::::\n" +
                "'##::: ##: ##.... ##:: ##:: ##:::: ##:::: ##::::\n" +
                ". ######:: ##:::: ##:'####:. #######::::: ##::::\n" +
                ":......:::..:::::..::....:::.......::::::..:::::");
    }
}