package com.relax.framework.model.search;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author Gejianping
 * @version 1.0
 * @date 2020/5/7 16:31
 */
@Data
@ToString
public class CourseSearchParam implements Serializable {
    /** 关键字 */
    String keyword;
    /** 一级分类 */
    String first_level_tag;
    /** 二级分类 */
    String second_level_tag;
    /** 难度等级 */
    String grade;
    /** 价格区间 */
    Float price_min;
    Float price_max;
    /** 排序字段 */
    String sort;
    /** 过虑字段 */
    String filter;
}
