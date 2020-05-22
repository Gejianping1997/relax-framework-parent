package com.relax.service.search.service;

import com.relax.framework.domain.course.CoursePub;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
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
        /** 定义要返回给前端的Map */
        Map<String,CoursePub> coursePubMap = new HashMap<>();

        /** 定义一个搜索对象 */
        SearchRequest searchRequest = new SearchRequest(COURSE_INDEX);
        /** 指定索引对象的文件类型 */
        searchRequest.types(COURSE_TYPE);

        /** 定义SearchBuilder */
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        /** 使用termQuery */
        searchSourceBuilder.query(QueryBuilders.termQuery("id",courseId));

        searchRequest.source(searchSourceBuilder);
        try {
            /** 定义一个临时变量CoursePub 用于封装返回给前端的数据 */
            CoursePub coursePub = new CoursePub();
            SearchResponse search = restHighLevelClient.search(searchRequest);
            SearchHits hits = search.getHits();
            SearchHit[] searchHits = hits.getHits();
            /** 取出每个的源文档内容 */
            for (SearchHit searchHit:searchHits ) {
                Map<String,Object> sourceMap = searchHit.getSourceAsMap();
                coursePub.setId(sourceMap.get("id").toString());
                coursePub.setName(sourceMap.get("name").toString());
                coursePub.setUsers(sourceMap.get("users").toString());
                coursePub.setFirst_level_tag(sourceMap.get("first_level_tag").toString());
                coursePub.setSecond_level_tag(sourceMap.get("second_level_tag").toString());
                coursePub.setGrade(sourceMap.get("grade").toString());
                coursePub.setStudy_mode(sourceMap.get("study_mode").toString());
                coursePub.setTeach_mode(sourceMap.get("teach_mode").toString());
                coursePub.setDescription(sourceMap.get("description").toString());
                coursePub.setTimestamp((Date) sourceMap.get("timestamp"));
                coursePub.setCharge(sourceMap.get("charge").toString());
                coursePub.setValid(sourceMap.get("valid").toString());
                coursePub.setQq(sourceMap.get("qq").toString());
                coursePub.setPrice((Double) sourceMap.get("price"));
                coursePub.setPrice_old((Double) sourceMap.get("price_old"));
                coursePub.setExpires(sourceMap.get("expires").toString());
                coursePub.setStart_time((Date) sourceMap.get("start_time"));
                coursePub.setEnd_time((Date) sourceMap.get("end_time"));
                coursePub.setPic(sourceMap.get("pic").toString());
                coursePub.setTeaching_plan(sourceMap.get("teaching_plan").toString());
                coursePub.setPub_time(sourceMap.get("pub_time").toString());

                coursePubMap.put(courseId,coursePub);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return coursePubMap;
    }
}
