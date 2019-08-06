package top.liyuzhen.timeing.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import top.liyuzhen.timeing.pojo.User;
import top.liyuzhen.timeing.service.UserService;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author MpGenerator
 * @since 2019-08-04
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/baidu/{id}")
    public User getUserById(@PathVariable("id") String id) {
        return userService.getById(id);
    }

    @GetMapping("/baidu")
    public List<User> getAllUser() {
        return userService.getList();
    }

    @GetMapping("/baidu/name/{userMane}")
    public User getUser(@PathVariable("userMane")String user){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(User::getUserName, user);
        return userService.getOne(wrapper);
    }
}