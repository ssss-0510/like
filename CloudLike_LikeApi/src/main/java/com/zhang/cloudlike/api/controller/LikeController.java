package com.zhang.cloudlike.api.controller;

import com.zhang.cloudlike.api.service.LikeServiceImpl;
import com.zhang.cloudlike.common.dto.LikeAddDto;
import com.zhang.cloudlike.common.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ProjectName: CloudLike
 * @Author: 张尚斌
 * @Time: 2020/10/30 21:15
 * @Description:
 */
@RestController
@RequestMapping("api/like/")
public class LikeController {
    @Autowired
    private LikeServiceImpl service;

    //点赞
    @PostMapping("dz.do")
    public R dz(@RequestParam LikeAddDto dto){
        return service.dz(dto);
    }

    //查询
    @GetMapping("count.do")
    public R all(){
        return service.all();
    }
}