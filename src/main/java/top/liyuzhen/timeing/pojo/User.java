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
@TableName("t_user")
@ApiModel(value="User对象", description="")
public class User extends BaseModel {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "用户账号")
    private String userName;

    @ApiModelProperty(value = "用户密码")
    private String password;


}
