package top.liyuzhen.timeing.service;

import top.liyuzhen.timeing.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author MpGenerator
 * @since 2019-08-04
 */
public interface UserService extends IService<User> {

    List<User> getList();
}
