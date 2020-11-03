package com.zhang.cloudlike.provider.service.impl;

import com.zhang.cloudlike.common.dto.LikeAddDto;
import com.zhang.cloudlike.common.vo.R;
import com.zhang.cloudlike.entity.Like;
import com.zhang.cloudlike.provider.dao.LikeDao;
import com.zhang.cloudlike.provider.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: CloudLike
 * @Author: 张尚斌
 * @Time: 2020/10/30 18:37
 * @Description:
 */
@Service
public class LikeServiceImpl implements LikeService {
    @Autowired
    private LikeDao dao;

    @Override
    public R likev1(LikeAddDto dto) {
        //发起点赞
        //参数非法校验
        if (dto !=null && dto.getCid()>0 && dto.getUid()>0){
            //校验是否点赞
            Like like = dao.querySingle(dto);
            if (like == null){
                //需要点赞
                //新增
                if (dao.insert(dto)>0){
                    return R.ok();
                }else{
                    return R.fail("点赞失败");
                }
            }else{
                //取消点赞
                //删除
                if (dao.del(dto)>0){
                    return R.ok();
                }else {
                    return R.fail("取消点赞失败");
                }
            }
        }else{
            return R.fail("非法参数");
        }

    }

    //@Override
    //public R likev2(LikeAddDto dto) {
    //    return null;
    //}
    //
    //@Override
    //public R likev3(LikeAddDto dto) {
    //    return null;
    //}

    @Override
    public R queryCount() {
        return R.ok(dao.queryCount());
    }
}