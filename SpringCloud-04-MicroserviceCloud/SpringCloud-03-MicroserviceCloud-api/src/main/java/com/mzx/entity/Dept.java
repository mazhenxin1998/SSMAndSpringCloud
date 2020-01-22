package com.mzx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author ZhenXinMa
 * @date 2020/1/15 13:50
 *
 *      注意:   微服务应用实体类应该都序列化
 *
 *      Lombok注解作用:
 *          1. @Data 自动生成get和set方法，equal和toString方法 hashCode方法
 *          2. @AllArgs  有参构造
 *          3. @NoArgs   无参构造
 *          4. @Accessors链式赋值
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {

    /**
     *   序列化接口的版本ID号
     */
    public  static  final  Long  seriaVersionUID  =  1L;

    /**
     *  自定义数据
     */

    private int deptno;
    private String dname;
    private String db_source;


}
