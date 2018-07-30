package com.saiot.mss.project.monitor.job.task;

import org.springframework.stereotype.Component;

/**
 * 定时任务调度测试
 * 
 * @author jiangjun
 */
@Component("saiotTask")
public class SaiotTask
{

    public void saiotParams(String params)
    {
        System.out.println("执行有参方法：" + params);
    }

    public void saiotNoParams()
    {
        System.out.println("执行无参方法");
    }

}
