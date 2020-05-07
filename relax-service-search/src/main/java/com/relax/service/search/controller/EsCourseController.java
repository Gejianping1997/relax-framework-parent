package com.relax.service.search.controller;

import com.relax.framework.model.response.QueryResponseResult;
import com.relax.service.api.search.EsCourseControllerApi;
import com.relax.service.search.service.EsCourseService;
import com.relaxframework.model.course.CoursePub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

/**
 * @author Gejianping
 * @version 1.0
 * @date 2020/5/7 16:48
 */
@Controller
public class EsCourseController implements EsCourseControllerApi {

    @Autowired
    EsCourseService esCourseService;

    @Override
    public QueryResponseResult<CoursePub> queryAllCoursePub(Integer pageNum, Integer pageSize, com.relaxframework.model.search.CourseSearchParam courseSearchParam) {
        return null;
    }

    @Override
    @GetMapping("/getAll/{id}")
    public Map<String, CoursePub> queryAllCoursePubByCourseId(@PathVariable("id") String courseId) {
        return esCourseService.queryAllCoursePubByCourseId(courseId);
    }
}
