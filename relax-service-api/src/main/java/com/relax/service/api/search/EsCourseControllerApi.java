package com.relax.service.api.search;

import com.relax.framework.model.response.QueryResponseResult;
import com.relaxframework.model.course.CoursePub;
import com.relaxframework.model.search.CourseSearchParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 搜索模块中 搜索课程相关信息的Api
 * @author Gejianping
 * @version 1.0
 * @date 2020/5/7 14:38
 */

@Api(value = "课程搜索",description = "课程搜索",tags = {"课程搜索"})
public interface EsCourseControllerApi {
    /** 课程综合信息搜索*/
    @ApiOperation("课程综合信息搜索")
    QueryResponseResult<CoursePub> queryAllCoursePub(Integer pageNum, Integer pageSize, CourseSearchParam courseSearchParam);

}
