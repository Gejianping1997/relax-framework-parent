package com.relax.service.api.search;

import com.relax.framework.domain.response.QueryResponseResult;
import com.relax.framework.domain.course.CoursePub;
import com.relax.framework.domain.search.CourseSearchParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

/**
 * 搜索模块中 搜索课程相关信息的Api
 * @author Gejianping
 * @version 1.0
 * @date 2020/5/7 14:38
 */

@Api(value = "课程搜索",description = "课程搜索",tags = {"课程搜索"})
public interface EsCourseControllerApi {
    /** 课程综合信息搜索
     * @param pageNum 第几页
     * @param pageSize 每页几条记录
     * @param courseSearchParam  课程查询的一些条件
     * @return */
    @ApiOperation("课程综合信息搜索")
    QueryResponseResult<CoursePub> queryAllCoursePub(Integer pageNum, Integer pageSize, CourseSearchParam courseSearchParam);

    /** 根据课程id 从Elasticsearch中 查询课程所有信息
     * @param courseId 课程id
     * @return */
    @ApiOperation("根据课程id从Elasticsearch中查询课程所有信息")
    Map<String,CoursePub> queryAllCoursePubByCourseId(String courseId);

}
