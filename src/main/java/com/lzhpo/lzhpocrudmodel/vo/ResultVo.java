package com.lzhpo.lzhpocrudmodel.vo;

import com.lzhpo.lzhpocrudmodel.status.HttpCode;
import lombok.Data;

import java.io.Serializable;

/**
 * 封装返回数据
 *
 * @author Zhaopo Liu
 * @date 2020/8/27 11:18
 */
@Data
public class ResultVo<T> implements Serializable {

    private int code;

    private String msg;

    private T data;

    public ResultVo() {
    }

    public ResultVo(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultVo(T data) {
        this.code = HttpCode.OK.code();
        this.msg = HttpCode.OK.codeMsg();
        this.data = data;
    }

    public ResultVo(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
