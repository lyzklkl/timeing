package lambda_test;

import cn.hutool.core.util.NumberUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 测试
 *
 * @author liyuzhen
 * @version 1.0
 * @date 2019-08-06 14:57
 */
@Slf4j
public class ZkgTest {

    public static void main(String[] args) {

        //用户 列表 有10条信息
        List<User> userList = User.getUserList();

        //任务 列表 有60条信息
        List<Task> taskList = Task.getTaskList();

        /*
         * 题目1: 统计 男生 比例
         * 例子: 男女生比例::[1:1]
         * 格式说明: 左边为男生数量,右边为女生数量,中间加冒号
         */

        //获取男生数量
        int man = (int) userList.stream().filter(u -> u.getGender() == 0).count();

        //获取女生数量
        int woman = (int) userList.stream().filter(u -> u.getGender() == 1).count();

        //获得最大公约数
        int divisor = NumberUtil.divisor(man, woman);

        //打印记录
        log.info("男女生比例::[{}:{}]",man/divisor,woman/divisor);


        /*
         * 题目2: 统计 男生 完成的 任务数量
         * 男生完成的任务数量::[3]
         * 格式说明: 直接显示数字
         */

        //获取到所以的 男的id
        List<String> userId2 = userList.stream().filter(u -> u.getGender() == 0).map(u -> u.getUserId()).collect(Collectors.toList());

        //获取所有完成的任务
        List<Task> taskList2 = taskList.stream().filter(t -> t.getStatus() == 1).collect(Collectors.toList());

        //构建返回参数
        List<Task> tasks3 = new ArrayList<>();

        //向构建参数传入值
        taskList2.forEach(t-> userId2.forEach(u->{
            if (t.getUserId().equals(u)) {
                tasks3.add(t);
        }}));

        //打印结果
        log.info("男生完成的任务数量::[{}]",tasks3.size());


        /*
         * 题目3: 显示 完成 3个任务及以上的任务 的 男生及完成数量
         * 例子: 完成3个任务及以上以男生::[{李玉泽=3, 万荣轩=4}]
         * 格式说明: 左边为用户名，右边为该用户完成的任务个数
         */

        //过滤出来所有男生
        List<User> userList3 = userList.stream().filter(u -> u.getGender() == 0).collect(Collectors.toList());

        //过滤出来所有完成的任务
        Map<String, List<Task>> taskList3 = taskList.stream().filter(t -> t.getStatus() == 1).collect(Collectors.groupingBy(Task::getUserId));

        //构建返回参数
        Map<String, Integer> userTask = new HashMap<>();

        //向构建参数传入值
        taskList3.forEach((k,v)-> userList3.forEach(u->{
            if (k.equals(u.getUserId())&&v.size()>=3) {
                userTask.put(u.getName(), v.size());
            }
        }));

        //打印结果
        log.info("完成3个任务及以上以男生::[{}]",userTask);


    }
}
