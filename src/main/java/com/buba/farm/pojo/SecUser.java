package com.buba.farm.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @ClassName SecUser
 * @Description TODO
 * @Author Chang
 * @Date 2020/2/17 15:58
 * @Version 1.0
 **/

/*链式写法：
Dept dept=new Dept();
dept.setDeptNo(11).setDname("开发部")*/
@Data
@NoArgsConstructor//无参构造
@Accessors(chain = true)//链式写法
public class SecUser {
    private int id;
    private String trueName;
    private String roleId;
    private String password;
    private String tel;
    private String bz;
    private Boolean disabled;
    private Timestamp createtime;

}
