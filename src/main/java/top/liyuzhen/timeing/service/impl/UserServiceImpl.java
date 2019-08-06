package top.liyuzhen.timeing.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import top.liyuzhen.timeing.pojo.User;
import top.liyuzhen.timeing.mapper.UserMapper;
import top.liyuzhen.timeing.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author MpGenerator
 * @since 2019-08-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


    @Override
    public List<User> getList() {
        return baseMapper.selectList(null);
    }
}
