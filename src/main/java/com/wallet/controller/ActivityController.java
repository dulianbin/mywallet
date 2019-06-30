package com.wallet.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wallet.entity.TActivity;
import com.wallet.service.TActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activity")
public class ActivityController {

    @Autowired
    private TActivityService tActivityService;

    @RequestMapping(value="/save",method= RequestMethod.POST,produces="application/json")
    public String getHello(@RequestBody TActivity activity) {
        return tActivityService.saveActivity(activity)+"";
    }


    @RequestMapping(value="/getActivityList",method= RequestMethod.GET)
    public String getActivityList(){
        IPage<TActivity> page=new Page<TActivity>();
        page.setPages(1);
        page.setSize(2);

        IPage<TActivity> activity=tActivityService.page(page);
        System.out.println(JSONObject.toJSONString(activity));
        return JSONObject.toJSONString(activity);
        //throw new GlobalDefaultException(1000);
    }
}
