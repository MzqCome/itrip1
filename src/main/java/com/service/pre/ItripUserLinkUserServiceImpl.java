package com.service.pre;

import com.dao.linkUser.ItripUserLinkUserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pojo.ItripUserLinkUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by main on 2018/1/2.
 */
@Service
public class ItripUserLinkUserServiceImpl implements ItripUserLinkUserService {

    @Autowired
    private ItripUserLinkUserMapper itripUserLinkUserMapper;

    @Override
    public PageInfo<ItripUserLinkUser> queryAllByUserId(Integer userId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<ItripUserLinkUser> linkUserList = itripUserLinkUserMapper.queryAllByUserId(userId);
        return new PageInfo<ItripUserLinkUser>(linkUserList);
    }

    @Override
    public PageInfo<ItripUserLinkUser> queryLinkUserByUserIdAndLiknUserName(Integer userId, String linkUserName, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<ItripUserLinkUser> linkUserList = itripUserLinkUserMapper.queryLinkUserByUserIdAndLiknUserName(userId, linkUserName);
        return new PageInfo<ItripUserLinkUser>(linkUserList);
    }

    @Override
    public ItripUserLinkUser queryLinkUserByID(Integer linkUserId) {
        return itripUserLinkUserMapper.queryLinkUserByID(linkUserId);
    }

    @Override
    public Integer addLinkUser(ItripUserLinkUser itripUserLinkUser) {
        return itripUserLinkUserMapper.addLinkUser(itripUserLinkUser);
    }

    @Override
    public Integer updateLinkUser(ItripUserLinkUser itripUserLinkUser) {
        return itripUserLinkUserMapper.updateLinkUser(itripUserLinkUser);
    }

    @Override
    public Integer delLinkUser(Integer linkUserId) {
        return itripUserLinkUserMapper.delLinkUser(linkUserId);
    }


}
