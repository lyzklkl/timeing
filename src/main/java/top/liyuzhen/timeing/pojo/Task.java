package top.liyuzhen.timeing.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import top.liyuzhen.timeing.util.BaseModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author MpGenerator
 * @since 2019-08-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_task")
@ApiModel(value="Task对象", description="")
public class Task extends BaseModel {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "任务内容")
    private String content;

    @ApiModelProperty(value = "完成进度：0，未完成；1，已完成")
    private Integer status;


}
