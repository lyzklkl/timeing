package top.liyuzhen.timeing.util;

import com.baomidou.mybatisplus.annotation.DbType;
import lombok.Data;

/**
 * @author liyuzhen
 * @version 1.0
 * @date 2019-07-10 17:20
 */
@Data
public class MpGeneratorConfig {

    /**
     * table 前缀
     */
    private String presix;

    /**
     * 要生成的表名
     */
    private String[] tables;

    /**
     * 实体父类
     */
    private String entitySuperClass;

    /**
     * 实体和父类公用字段
     */
    private String[] entityCommonColumns;

    /**
     * 数据库地址
     */
    private String url;

    /**
     * 数据库用户名
     */
    private String username;

    /**
     * 数据库密码
     */
    private String password;

    /**
     * 是否需要给实体添加基类
     */
    private boolean isNeedEntitySuperClass = true;

    /**
     * 数据库配置四要素
     */
    private String driverName;

    /**
     * 数据库类型
     */
    private DbType dbType;

    /**
     * 项目路径
     */
    private String projectPath;

    /**
     * 基本包名
     */
    private String basePackage;

    /**
     * 作者
     */
    private String authorName;

}
