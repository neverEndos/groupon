package com.endos.groupon.service.framework.common.search;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * 查询条件
 * Created by Endos on 2017/04/21.
 */
@NoArgsConstructor// 无参构造器
@AllArgsConstructor// 所有参数的构造器
public class Condition implements Serializable{
    private static final long serialVersionUID = 3721505531304840357L;

    /**
     * 参数名称
     */
    @Getter @Setter private String name;

    /**
     * 参数值
     */
    @Getter @Setter private Object value;
}
