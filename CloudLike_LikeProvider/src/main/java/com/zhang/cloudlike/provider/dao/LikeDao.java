package com.zhang.cloudlike.provider.dao;

import com.zhang.cloudlike.common.dto.ContentLikeDto;
import com.zhang.cloudlike.common.dto.LikeAddDto;
import com.zhang.cloudlike.entity.Like;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ProjectName: CloudLike
 * @Author: Zsh
 * @Time: 2020/10/30 17:37
 * @Description:
 */
@Repository
public interface LikeDao {
    //新增
    @Insert("insert into t_like(uid,cid,ctime) values(#{uid},#{cid},now())")
    int insert(LikeAddDto dto);

    //删除
    @Delete("delete from t_like where uid=#{uid} and cid=#{cid}")
    int del(LikeAddDto dto);

    //查询某个内容的点赞记录
    @ResultType(Like.class)
    @Select("select * from t_like were cid=#{cid} order by ctime desc ")
    List<Like> queryByCid(int cid);

    //查询是否点赞
    @ResultType(Like.class)
    @Select("select * from t_like where uid=#{uid} and cid=#{cid} limit 1")
    Like querySingle(LikeAddDto dto);

    //查询点赞的数量
    @Select("select count (*) ct,cid from t_like group by cid")
    @ResultType(ContentLikeDto.class)
    List<ContentLikeDto> queryCount();

}
