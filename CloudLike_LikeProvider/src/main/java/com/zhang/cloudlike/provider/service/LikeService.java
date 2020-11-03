package com.zhang.cloudlike.provider.service;

import com.zhang.cloudlike.common.dto.LikeAddDto;
import com.zhang.cloudlike.common.vo.R;

/**
 * @ProjectName: CloudLike
 * @Author: 张尚斌
 * @Time: 2020/10/30 18:37
 * @Description:
 */
public interface LikeService {
    //第一版点赞
    R likev1(LikeAddDto dto);

    ////第二版点赞  引入Redis
    //R likev2(LikeAddDto dto);
    //
    ////第三版点赞 引入RabbitMQ
    //R likev3(LikeAddDto dto);

    //查询文章的点赞数量
    R queryCount();
}