package com.endos.groupon.service.framework.common.page;

import com.endos.groupon.service.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 分页查询结果
 * Created by Endos on 2017/04/21.
 */
@AllArgsConstructor
public class PagingResult<T extends BaseEntity> {
    /* 当前页码 */
    @Getter @Setter private int page;
    /* 每页记录数 */
    @Getter @Setter private int pageSize;
    /* 总记录数 */
    @Getter @Setter private long total;
    /* 每页数据记录 */
    @Getter @Setter private List<T> rows;
}
