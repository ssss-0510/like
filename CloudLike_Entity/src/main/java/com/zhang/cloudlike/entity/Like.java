package com.zhang.cloudlike.entity;

import lombok.Data;

import java.util.Date;

/**
 * @ProjectName: CloudLike
 * @Author: 张尚斌
 * @Time: 2020/10/30 17:32
 * @Description:
 */
@Data
public class Like {

    private Integer id;
    private Integer cid;
    private Integer uid;
    private Date ctime;
}