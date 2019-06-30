package com.wallet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wallet.entity.TActivity;
import com.wallet.mapper.TActivityMapper;
import com.wallet.service.TActivityService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Du LianBin
 * @since 2019-05-17
 */
@Service
public class TActivityServiceImpl extends ServiceImpl<TActivityMapper, TActivity> implements TActivityService {


    @Override
    @Transactional(rollbackFor = Exception.class)
    public int saveActivity(TActivity activity) {

        activity.setAccessNumber(1);
        activity.setActivityDetail("回滚测试别的方法异常");
        activity.setActivityErcode("23431");
        activity.setActivityNo("54325345431");
        activity.setActivityStatus(1);
        activity.setActivityUrl("http://www.baidu.com");
        activity.setSignEndTime(LocalDateTime.now());
        int result=save(activity) ? 1 : 0;

        testTwoMethod();

        return result;
    }

    private void testTwoMethod(){
        double aa=1/0;
    }
}
