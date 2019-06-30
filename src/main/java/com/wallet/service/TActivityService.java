package com.wallet.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wallet.entity.TActivity;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Du LianBin
 * @since 2019-05-17
 */
public interface TActivityService extends IService<TActivity> {

    int saveActivity(TActivity activity);
}
