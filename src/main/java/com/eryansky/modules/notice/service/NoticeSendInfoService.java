/**
 * Copyright (c) 2012-2014 http://www.eryansky.com
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.eryansky.modules.notice.service;

import com.eryansky.common.orm.entity.StatusState;
import com.eryansky.core.orm.mybatis.service.CrudService;
import com.eryansky.modules.notice.dao.NoticeSendInfoDao;
import com.eryansky.modules.notice.mapper.Notice;
import com.eryansky.modules.notice.mapper.NoticeSendInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 尔演&Eryan eryanwcp@gmail.com
 * @date 2015-10-16 
 */
@Service
@Transactional(readOnly = false)
public class NoticeSendInfoService extends CrudService<NoticeSendInfoDao,NoticeSendInfo> {

    /**
     * 通知发送配置信息
     * @param noticeId 通知ID
     * @return
     */
    public List<NoticeSendInfo> findNoticeSendInfos(String noticeId){
        return findNoticeSendInfos(noticeId, null);
    }

    /**
     * 通知发送配置信息
     * @param noticeId 通知ID
     * @param receiveObjectType {@link com.eryansky.modules.mail._enum.ReceiveObjectType}
     * @return
     */
    public List<NoticeSendInfo> findNoticeSendInfos(String noticeId,Integer receiveObjectType){
        NoticeSendInfo noticeSendInfo = new NoticeSendInfo();
        Notice notice = new Notice(noticeId);
        notice.setStatus(StatusState.NORMAL.getValue());
        noticeSendInfo.setNotice(notice);
        noticeSendInfo.setReceiveObjectType(receiveObjectType);
        return dao.findQueryList(noticeSendInfo);
    }
}
