package com.zhang.cloudlike.provider.controller;

import com.zhang.cloudlike.common.dto.LikeAddDto;
import com.zhang.cloudlike.common.vo.R;
import com.zhang.cloudlike.provider.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ProjectName: CloudLike
 * @Author: 张尚斌
 * @Time: 2020/10/30 19:07
 * @Description:
 */
@RestController
@RequestMapping("/provider/like/")
public class LikeController {
    @Autowired
    private LikeService likeService;

    //点赞
    @PostMapping("dz.do")
    public R da(@RequestBody LikeAddDto dto){
        return likeService.likev1(dto);
    }

    //查询
    @GetMapping("count.do")
    public R all(){
        return likeService.queryCount();
    }
}