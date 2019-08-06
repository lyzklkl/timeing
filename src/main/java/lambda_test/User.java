package lambda_test;

import cn.hutool.core.util.IdUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户表
 *
 * @author liyuzhen
 * @version 1.0
 * @date 2019-08-06 14:53
 */
@Data
@Builder
@ApiModel
public class User {

    @ApiModelProperty("用户id")
    private String userId;

    @ApiModelProperty("用户姓名")
    private String name;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("用户性别: 0,男; 1,女")
    private Integer gender;

    public static List<User> getUserList() {

        List<User> userList = new ArrayList<>();

        userList.add(User.builder().userId("b60dba9e-5f5d-4a56-a841-25d054fd334b").name("郑坚白").age(33).gender(0).build());
        userList.add(User.builder().userId("132ebbc0-838d-40ea-ad14-36c68eb403c0").name("万荣轩").age(20).gender(0).build());
        userList.add(User.builder().userId("5260c4cf-04dd-411a-8785-4894406cf5d3").name("郑阳伯").age(29).gender(1).build());
        userList.add(User.builder().userId("a1f3478d-fe61-4e4b-95c6-acdf6254a9fb").name("李玉泽").age(16).gender(0).build());
        userList.add(User.builder().userId("948ca9c4-d015-4baf-b65b-d5dd3fb7b542").name("鄂嘉运").age(33).gender(0).build());
        userList.add(User.builder().userId("7b95787e-167c-4ac4-9a56-c9e55fbb2c3b").name("易苏凉").age(34).gender(1).build());
        userList.add(User.builder().userId("89989bd5-f335-4c55-92d5-f6c1f4593592").name("殳芬璇").age(42).gender(1).build());
        userList.add(User.builder().userId("b02fbf2d-b60e-4b06-bbea-4a7d7264d9db").name("游碧巧").age(19).gender(1).build());
        userList.add(User.builder().userId("f6239b01-1d2f-4197-a197-d9d139c7fe08").name("朱尔珍").age(24).gender(1).build());
        userList.add(User.builder().userId("d33c9ea4-cd6f-4596-a6c6-0e5c0b9a68ed").name("袁寄灵").age(35).gender(0).build());

        return userList;
    }
}
