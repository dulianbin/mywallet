package com.wallet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author Du LianBin
 * @since 2019-05-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TActivity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "activity_id", type = IdType.AUTO)
    private Integer activityId;
    /**
     * 活动编号
     */
    private String activityNo;
    /**
     * 活动标题
     */
    private String activityTitle;
    /**
     * 活动详情
     */
    private String activityDetail;
    /**
     * 访问量
     */
    private Integer accessNumber;
    /**
     * 总投票数
     */
    private Integer voteNumber;
    /**
     * 分享总次数
     */
    private Integer shareNumber;
    /**
     * 投票开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime voteStartTime;
    /**
     * 投票结束时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime voteEndTime;
    /**
     * 报名开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime signStartTime;
    /**
     * 报名结束时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime signEndTime;
    /**
     * 活动状态:0未开始，1进行中，2，已结束，3，已删除
     */
    private Integer activityStatus;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
    /**
     * 活动链接
     */
    private String activityUrl;
    /**
     * 活动二维码链接
     */
    private String activityErcode;
    /**
     * 操作人id
     */
    private Integer operateId;
    /**
     * 操作人
     */
    private String operator;
    /**
     * 微信投票规则，1每个微信每天可以投票，2每个微信只能投一票
     */
    private Integer weixinVoteRule;
    /**
     * 一个用户一天可投票次数
     */
    private Integer oneUserVote;
    /**
     * 微信分享缩略图
     */
    private String weixinShareImg;
    /**
     * 微信分享标题
     */
    private String weixinShareTitle;
    /**
     * 微信分享描述
     */
    private String weixinShareDescription;


}
