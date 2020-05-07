package com.relax.service.search.service;

import com.relaxframework.model.course.CoursePub;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Gejianping
 * @version 1.0
 * @date 2020/5/7 16:53
 */
@Service
public class EsCourseService {

    @Value("${relax.course.index}")
    private String COURSE_INDEX;
    @Value("${relax.course.type}")
    private String COURSE_TYPE;
    @Value("${relax.course.source_field}")
    private String COURSE_SOURCE_FIELD;

    @Value("${relax.media.index}")
    private String MEDIA_INDEX;
    @Value("${relax.media.type}")
    private String MEDIA_TYPE;
    @Value("${relax.media.source_field}")
    private String MEDIA_SOURCE_FIELD;

    @Autowired
    RestHighLevelClient restHighLevelClient;

    /** 使用 ES客户端 向ES 请求查询索引信息  */
    public Map<String, CoursePub> queryAllCoursePubByCourseId(String courseId) {
        /** 定义一个搜索对象 */
        SearchRequest searchRequest = new SearchRequest(COURSE_INDEX);
        return null;
    }
}
