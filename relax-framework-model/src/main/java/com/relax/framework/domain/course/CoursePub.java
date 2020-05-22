package com.relax.framework.domain.course;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Gejianping
 * @version 1.0
 * @date 2020/5/7 15:22
 */
@Data
@ToString
@Entity
@Table(name="course_pub")
@GenericGenerator(name = "jpa-assigned", strategy = "assigned")
public class CoursePub implements Serializable {
    private static final long serialVersionUID = -916357110051689487L;
    @Id
    @GeneratedValue(generator = "jpa-assigned")
    @Column(length = 32)
    /** 课程id 主键 */
    private String id;
    /** 课程名称 */
    private String name;
    /** 适用人群 */
    private String users;
    /** 课程大分类 */
    private String first_level_tag;
    /** 课程小分类 */
    private String second_level_tag;
    /** 课程等级 */
    private String grade;
    /** 学习模式 */
    private String study_mode;
    /** 教育模式 */
    private String teach_mode;
    /** 课程描述信息 */
    private String description;
    /** 时间戳LogStash使用 */
    private Date timestamp;
    /** 收费规则，对应数据字典 */
    private String charge;
    /** 有效性，对应数据字典 */
    private String valid;
    /** 咨询 QQ */
    private String qq;
    /** 课程现价 */
    private Double price;
    /** 课程原价 */
    private Double price_old;
    /** 过期时间 */
    private String expires;
    /** 课程有效期-开始时间 */
    private Date start_time;
    /** 课程有效期-结束时间 */
    private Date end_time;
    /** 存储在 FastDFS 中的图片 url */
    private String pic;
    /** 教学计划 */
    private String teaching_plan;
    /** 课程发布时间 */
    private String pub_time;
}