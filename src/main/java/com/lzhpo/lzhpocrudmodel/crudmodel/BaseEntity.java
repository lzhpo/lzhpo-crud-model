package com.lzhpo.lzhpocrudmodel.crudmodel;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lzhpo.lzhpocrudmodel.utils.DateUtil;
import com.lzhpo.lzhpocrudmodel.utils.IdGenUtil;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * BaseEntity
 *
 * @author Zhaopo Liu
 * @date 2020/8/27 11:18
 */
@Data
@NoArgsConstructor
public class BaseEntity<T> implements Serializable {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    protected Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    protected Date createDate;

    @Length(min = 2, max = 255)
    protected String creator;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    protected Date modifyDate;

    @NotNull(message = "更新人不能为空")
    @Length(min = 2, max = 255)
    protected String modifier;

    /**
     * 是否为新记录
     */
    protected boolean isNewRecord;

    /**
     * 是否为新记录
     *
     * @return boolean
     */
    public boolean isNewRecord() {
        return this.isNewRecord || this.getId() == null;
    }

    /**
     * 设置基本属性
     *
     * @param username username
     */
    public void setCommonValue(String username) {
        Date currentDate = DateUtil.asDate(LocalDateTime.now());
        if (this.isNewRecord()) {
            this.setId(IdGenUtil.snowflake());
            this.setNewRecord(true);
            this.creator = username;
            this.createDate = currentDate;
        }
        this.modifier = username;
        this.modifyDate = currentDate;
    }

}
