package top.liyuzhen.timeing.util;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author liyuzhen
 * @version 1.0
 * @date 2019-07-10 18:58
 */
@Data
@ApiModel
public class BaseModel implements Serializable {

    @ApiModelProperty(value = "主键")
    private String id;

    @TableLogic
    @ApiModelProperty(value = "是否删除：0未删除，1删除")
    private Integer isDel;

    @ApiModelProperty(value = "创建者id")
    private String createUserId;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新者id")
    private String updateUserId;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

}
