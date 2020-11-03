package com.zhang.cloudlike.api.service;

import com.zhang.cloudlike.common.dto.LikeAddDto;
import com.zhang.cloudlike.common.vo.R;
import com.zhang.cloudlike.entity.Like;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: CloudLike
 * @Author: 张尚斌
 * @Time: 2020/10/30 20:02
 * @Description:
 */
@Service
public class LikeServiceImpl {
    @Autowired
    private RestTemplate restTemplate;

   public R dz(LikeAddDto dto){
       return restTemplate.postForObject("http://LikeProvider825/provider/like/dz.do",dto,R.class);
   }

    public R all(){
        return restTemplate.getForObject("http://LikeProvider/provider/like/count.do",R.class);
    }



}