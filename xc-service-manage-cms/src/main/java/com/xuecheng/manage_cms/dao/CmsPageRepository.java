package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @AUTHOR LZG
 * @DATE 2020/1/1{TIME}
 * @VERSION 1.0
 */

public interface CmsPageRepository extends MongoRepository<CmsPage, String> {
}
