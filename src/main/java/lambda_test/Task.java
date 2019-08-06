package lambda_test;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 任务表
 *
 * @author liyuzhen
 * @version 1.0
 * @date 2019-08-06 14:37
 */
@Data
@Builder
@ApiModel
public class Task {

    @ApiModelProperty("任务id")
    private String taskId;

    @ApiModelProperty("用户id")
    private String userId;

    @ApiModelProperty("状态：0，为完成；1，已完成")
    private Integer status;

    public static List<Task> getTaskList() {

        List<Task> taskList = new ArrayList<>();

        taskList.add(Task.builder().taskId("6fa88c6d-5bea-487c-a302-ca3e27c53a02").userId("b60dba9e-5f5d-4a56-a841-25d054fd334b").status(1).build());
        taskList.add(Task.builder().taskId("3ed30535-3b17-4e97-9936-eaf459a9a787").userId("b60dba9e-5f5d-4a56-a841-25d054fd334b").status(0).build());
        taskList.add(Task.builder().taskId("1780c8fc-2381-426d-8814-73d8ec341744").userId("b60dba9e-5f5d-4a56-a841-25d054fd334b").status(0).build());
        taskList.add(Task.builder().taskId("522e7984-191f-4dc2-b064-57d7d200f2e2").userId("b60dba9e-5f5d-4a56-a841-25d054fd334b").status(1).build());
        taskList.add(Task.builder().taskId("8d8ac82b-0e1c-4e96-8ae1-dc68cf311804").userId("b60dba9e-5f5d-4a56-a841-25d054fd334b").status(0).build());
        taskList.add(Task.builder().taskId("5e3ffb0e-6a15-4865-95b9-c3dd3c09f831").userId("b60dba9e-5f5d-4a56-a841-25d054fd334b").status(0).build());

        taskList.add(Task.builder().taskId("d8d4bfec-74b3-4510-adaa-42f567d9cc70").userId("132ebbc0-838d-40ea-ad14-36c68eb403c0").status(1).build());
        taskList.add(Task.builder().taskId("de131441-da18-4ccb-aef8-704b10719ab8").userId("132ebbc0-838d-40ea-ad14-36c68eb403c0").status(0).build());
        taskList.add(Task.builder().taskId("3834fdd5-c21c-44e1-8d57-04f35ab7d6d3").userId("132ebbc0-838d-40ea-ad14-36c68eb403c0").status(1).build());
        taskList.add(Task.builder().taskId("9fc4f28b-ac27-4654-a603-70f655b0dabb").userId("132ebbc0-838d-40ea-ad14-36c68eb403c0").status(1).build());
        taskList.add(Task.builder().taskId("55e246d5-716b-4e60-a386-95f1ab18d2cc").userId("132ebbc0-838d-40ea-ad14-36c68eb403c0").status(1).build());
        taskList.add(Task.builder().taskId("052e0ae6-dc87-4de7-b72e-3bcfc2f77bd1").userId("132ebbc0-838d-40ea-ad14-36c68eb403c0").status(1).build());

        taskList.add(Task.builder().taskId("9b8fce25-8641-4c69-ae7f-13950ecf0f6a").userId("5260c4cf-04dd-411a-8785-4894406cf5d3").status(1).build());
        taskList.add(Task.builder().taskId("d68ac6bb-bf9f-4d49-b367-ed518f60e43c").userId("5260c4cf-04dd-411a-8785-4894406cf5d3").status(1).build());
        taskList.add(Task.builder().taskId("daa204f4-1310-4a48-8f24-e75cdd270e02").userId("5260c4cf-04dd-411a-8785-4894406cf5d3").status(0).build());
        taskList.add(Task.builder().taskId("a474956a-5fc3-4982-9ff4-c0fe97fd1e28").userId("5260c4cf-04dd-411a-8785-4894406cf5d3").status(0).build());
        taskList.add(Task.builder().taskId("565715f8-c95c-4a1a-8b25-e89b1704fc96").userId("5260c4cf-04dd-411a-8785-4894406cf5d3").status(1).build());
        taskList.add(Task.builder().taskId("5462dd27-3d59-4d04-9f01-accbe1a35287").userId("5260c4cf-04dd-411a-8785-4894406cf5d3").status(0).build());

        taskList.add(Task.builder().taskId("53b14bc9-6d0d-47b3-930a-68fc25f68a82").userId("a1f3478d-fe61-4e4b-95c6-acdf6254a9fb").status(1).build());
        taskList.add(Task.builder().taskId("ef7cf03c-f8f6-46a3-8bfb-405f2ea2097f").userId("a1f3478d-fe61-4e4b-95c6-acdf6254a9fb").status(0).build());
        taskList.add(Task.builder().taskId("2a70d404-8bb1-411c-a7f1-567d82cfa04d").userId("a1f3478d-fe61-4e4b-95c6-acdf6254a9fb").status(1).build());
        taskList.add(Task.builder().taskId("b4cb8064-e7cf-42b3-8843-7081fa4f6954").userId("a1f3478d-fe61-4e4b-95c6-acdf6254a9fb").status(1).build());
        taskList.add(Task.builder().taskId("d4e688a6-5d38-4bbb-b34d-751bab3c94cd").userId("a1f3478d-fe61-4e4b-95c6-acdf6254a9fb").status(1).build());
        taskList.add(Task.builder().taskId("836be91b-8bd2-40cc-8cc3-a1184b0c0e32").userId("a1f3478d-fe61-4e4b-95c6-acdf6254a9fb").status(0).build());

        taskList.add(Task.builder().taskId("a0adc44b-9610-4dd9-b8c7-eb4e0d818eab").userId("948ca9c4-d015-4baf-b65b-d5dd3fb7b542").status(0).build());
        taskList.add(Task.builder().taskId("890d1fa1-a624-4a85-b082-b696d3e790d8").userId("948ca9c4-d015-4baf-b65b-d5dd3fb7b542").status(0).build());
        taskList.add(Task.builder().taskId("ce1c56d3-174e-44a9-a4bb-4a441e1bd224").userId("948ca9c4-d015-4baf-b65b-d5dd3fb7b542").status(0).build());
        taskList.add(Task.builder().taskId("5860afc3-0ce4-4fc6-8d99-e8daddb770ad").userId("948ca9c4-d015-4baf-b65b-d5dd3fb7b542").status(1).build());
        taskList.add(Task.builder().taskId("2e72f7d2-abb4-4044-9eca-829a29f3c8ac").userId("948ca9c4-d015-4baf-b65b-d5dd3fb7b542").status(1).build());
        taskList.add(Task.builder().taskId("56f8e07e-8453-4d1b-b44f-e2dfd5d24967").userId("948ca9c4-d015-4baf-b65b-d5dd3fb7b542").status(0).build());

        taskList.add(Task.builder().taskId("1a8729ff-1619-4410-ad4d-5bd796253aba").userId("7b95787e-167c-4ac4-9a56-c9e55fbb2c3b").status(1).build());
        taskList.add(Task.builder().taskId("b6f4051b-c7e6-4271-a181-9fde81079f29").userId("7b95787e-167c-4ac4-9a56-c9e55fbb2c3b").status(1).build());
        taskList.add(Task.builder().taskId("75457bb5-0347-4069-b94d-7149cca014a6").userId("7b95787e-167c-4ac4-9a56-c9e55fbb2c3b").status(1).build());
        taskList.add(Task.builder().taskId("f17bb92a-6a31-4ed9-a75f-b9200e821cfa").userId("7b95787e-167c-4ac4-9a56-c9e55fbb2c3b").status(1).build());
        taskList.add(Task.builder().taskId("ddedabad-d585-4cdc-8dc4-347883d5794c").userId("7b95787e-167c-4ac4-9a56-c9e55fbb2c3b").status(0).build());
        taskList.add(Task.builder().taskId("6759ce8a-2970-452e-afbe-e52faddb579e").userId("7b95787e-167c-4ac4-9a56-c9e55fbb2c3b").status(1).build());

        taskList.add(Task.builder().taskId("fcf93dc9-2545-40c9-b5bc-f01f55f6ffb6").userId("89989bd5-f335-4c55-92d5-f6c1f4593592").status(1).build());
        taskList.add(Task.builder().taskId("d8b5a91f-6e17-43cc-b2b5-049fc3d2ff3f").userId("89989bd5-f335-4c55-92d5-f6c1f4593592").status(1).build());
        taskList.add(Task.builder().taskId("aca50726-ef0a-49b5-baa5-7153ab26b3d9").userId("89989bd5-f335-4c55-92d5-f6c1f4593592").status(0).build());
        taskList.add(Task.builder().taskId("f397d3b9-6cfe-4bc6-8366-87e6e4a49c55").userId("89989bd5-f335-4c55-92d5-f6c1f4593592").status(0).build());
        taskList.add(Task.builder().taskId("3a086b20-2d33-4400-b639-d45c0f6f3fa2").userId("89989bd5-f335-4c55-92d5-f6c1f4593592").status(1).build());
        taskList.add(Task.builder().taskId("bd9e216f-1724-4bd6-a2fd-74afffe9d33a").userId("89989bd5-f335-4c55-92d5-f6c1f4593592").status(1).build());

        taskList.add(Task.builder().taskId("b0871264-efb6-4bd5-9fbc-ca5bfbdc0c75").userId("b02fbf2d-b60e-4b06-bbea-4a7d7264d9db").status(0).build());
        taskList.add(Task.builder().taskId("5bfe2906-c2d1-4995-bb82-8d7d177de16f").userId("b02fbf2d-b60e-4b06-bbea-4a7d7264d9db").status(0).build());
        taskList.add(Task.builder().taskId("e9ad6f7b-42f4-44a8-8ae4-878e5ea71929").userId("b02fbf2d-b60e-4b06-bbea-4a7d7264d9db").status(0).build());
        taskList.add(Task.builder().taskId("5a84c7c9-a61e-4577-a167-d8736e7eef41").userId("b02fbf2d-b60e-4b06-bbea-4a7d7264d9db").status(0).build());
        taskList.add(Task.builder().taskId("91c91aab-3a78-4b6b-ac16-0274a737a139").userId("b02fbf2d-b60e-4b06-bbea-4a7d7264d9db").status(0).build());
        taskList.add(Task.builder().taskId("85073970-eb31-4478-b7fb-924e3e5749aa").userId("b02fbf2d-b60e-4b06-bbea-4a7d7264d9db").status(1).build());

        taskList.add(Task.builder().taskId("34fbc9a0-1881-4c1e-ba54-a72d6101827e").userId("f6239b01-1d2f-4197-a197-d9d139c7fe08").status(0).build());
        taskList.add(Task.builder().taskId("5b2f1cb9-b227-4d11-9c8f-e6c05d911ac0").userId("f6239b01-1d2f-4197-a197-d9d139c7fe08").status(1).build());
        taskList.add(Task.builder().taskId("64cb32fb-3dc5-42c1-aeaf-79ff924ee0ee").userId("f6239b01-1d2f-4197-a197-d9d139c7fe08").status(1).build());
        taskList.add(Task.builder().taskId("d4e6f049-1b13-4335-b49c-d7a93d6793a0").userId("f6239b01-1d2f-4197-a197-d9d139c7fe08").status(0).build());
        taskList.add(Task.builder().taskId("2dbd2257-9c65-4e3a-81ae-d59b36cbf3e1").userId("f6239b01-1d2f-4197-a197-d9d139c7fe08").status(0).build());
        taskList.add(Task.builder().taskId("7e3d6176-2faa-4547-86cb-e48a1caaf637").userId("f6239b01-1d2f-4197-a197-d9d139c7fe08").status(1).build());

        taskList.add(Task.builder().taskId("16d84392-0d75-4eb1-8650-5bd34c607129").userId("d33c9ea4-cd6f-4596-a6c6-0e5c0b9a68ed").status(1).build());
        taskList.add(Task.builder().taskId("cacc2213-67cc-40e1-95e7-416363241949").userId("d33c9ea4-cd6f-4596-a6c6-0e5c0b9a68ed").status(0).build());
        taskList.add(Task.builder().taskId("4c538677-eb52-4344-9847-ab18eabe89e4").userId("d33c9ea4-cd6f-4596-a6c6-0e5c0b9a68ed").status(1).build());
        taskList.add(Task.builder().taskId("72098a6d-c2bf-4226-9c29-cf3401b55fed").userId("d33c9ea4-cd6f-4596-a6c6-0e5c0b9a68ed").status(0).build());
        taskList.add(Task.builder().taskId("fbc1a30a-6165-48e7-a3c0-52c5f223480d").userId("d33c9ea4-cd6f-4596-a6c6-0e5c0b9a68ed").status(1).build());
        taskList.add(Task.builder().taskId("589da8a2-857f-497d-b55f-52c9fffb026c").userId("d33c9ea4-cd6f-4596-a6c6-0e5c0b9a68ed").status(1).build());

        return taskList;
    }
}
