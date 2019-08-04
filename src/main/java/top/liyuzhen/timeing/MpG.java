package top.liyuzhen.timeing;

import top.liyuzhen.timeing.util.MpGenerator;
import top.liyuzhen.timeing.util.MpGeneratorConfig;


/**
 * @author liyuzhen
 * @version 1.0
 * @date 2019-07-10 19:28
 */
public class MpG {

    public static void main(String[] args) {
        String projectPath = MpG.class.getResource("/").getPath().replace("/target/classes", "");
        MpGeneratorConfig config = new MpGeneratorConfig();
        //指定表名
        config.setTables(new String[]{"t_user"});
        config.setProjectPath(projectPath);
        config.setBasePackage(MpG.class.getPackage().getName());
        MpGenerator mpGenerator = new MpGenerator(config);
        mpGenerator.execute();
    }

}