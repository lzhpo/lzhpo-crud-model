package com.lzhpo.lzhpocrudmodel.utils;

import java.util.UUID;

/**
 * ID生成工具类
 *
 * @author Zhaopo Liu
 * @date 2020/8/27 11:18
 */
public class IdGenUtil {

    /**
     * 雪花算法生成唯一ID
     *
     * @return {Long}
     */
    public static Long snowflake() {
        Snowflake snowflake = new Snowflake(2, 3);
        return snowflake.nextId();
    }

    /**
     * 生成UUID
     *
     * @return {String}
     */
    public static String uuid() {
        return UUID.randomUUID().toString();
    }
}
