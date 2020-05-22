package com.relax.service.search.controller;

import com.relax.framework.domain.response.QueryResponseResult;
import com.relax.framework.domain.search.CourseSearchParam;
import com.relax.service.api.search.EsCourseControllerApi;
import com.relax.service.search.service.EsCourseService;
import com.relax.framework.domain.course.CoursePub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Gejianping
 * @version 1.0
 * @date 2020/5/7 16:48
 */
@RestController
@RequestMapping("/search/course")
public class EsCourseController implements EsCourseControllerApi {

    @Autowired
    EsCourseService esCourseService;

    @Override
    public QueryResponseResult<CoursePub> queryAllCoursePub(Integer pageNum, Integer pageSize, CourseSearchParam courseSearchParam) {
        return null;
    }

    @Override
    @GetMapping("/queryAllCoursePubByCourseId/{courseId}")
    public Map<String, CoursePub> queryAllCoursePubByCourseId(@PathVariable("courseId") String courseId) {
        return esCourseService.queryAllCoursePubByCourseId(courseId);
    }
}
