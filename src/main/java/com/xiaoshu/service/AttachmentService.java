package com.xiaoshu.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaoshu.dao.AttachmentMapper;
import com.xiaoshu.entity.Attachment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AttachmentService {
	
	@Autowired
	AttachmentMapper attachmentMapper;
	
	public  void insertAttachment(Attachment t) throws Exception{
		attachmentMapper.insert(t);
	};
	
	public PageInfo<Attachment> findAttachment(int page, int rows) throws Exception{
		PageHelper.startPage(page, rows);
		List<Attachment> attachmentList = attachmentMapper.selectAll();
        PageInfo<Attachment> pageInfo = new PageInfo<Attachment>(attachmentList);
        return pageInfo;
		
	};
	
	public int countAttachment(Attachment t) throws Exception{
		return attachmentMapper.selectCount(t);
	};
	
}
