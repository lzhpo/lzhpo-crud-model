package com.lzhpo.lzhpocrudmodel.constant;

/**
 * 公共参数
 *
 * @author Zhaopo Liu
 * @date 2020/8/27 11:18
 */
public class CrudModelConstant {

    /** 列表 => mybatis => ids */
    public static final String PARAM_IDS = "ids";

    //============================分页start============================

    /** 页码 */
    public static final String PAGE_NUM = "pageNum";

    /** 分页大小 */
    public static final String PAGE_SIZE = "pageSize";

    /** 排序 */
    public static final String SORT = "sort";

    /** 排序方向 */
    public static final String ORDER = "order";

    /** 默认页数 */
    public static final String PAGE_NUM_DEFAULT = "1";

    /** 默认分页大小 */
    public static final String PAGE_SIZE_DEFAULT = "10";

    /** 默认排序 */
    public static final String PAGE_SORT_DEFAULT = "create_date";

    /** 默认排序方向 */
    public static final String PAGE_ORDER_DEFAULT = " desc";

    //============================分页end============================

}
