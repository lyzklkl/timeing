package lambda_test;

import java.util.List;

/**
 * 测试
 *
 * @author liyuzhen
 * @version 1.0
 * @date 2019-08-06 14:57
 */
public class ZkgTest {

    public static void main(String[] args) {

        //用户 列表 有10条信息
        List<User> userList = User.getUserList();

        //任务 列表 有60条信息
        List<Task> taskList = Task.getTaskList();


        // 题目1: 统计 男生 比例
        // 例子: 2:3, 格式说明: 左边为男生数量,右边为女生数量,中间加冒号


        // 题目2: 统计 男生 完成的 任务数量
        // 例子: 3, 格式说明: 直接显示数字


        // 题目3: 显示 完成一半任务及以上的 用户列表
        // 例子: ["郑坚白",3], 格式说明: 左边为用户名，右边为该用户完成的任务个数


    }
}
