package container;

import tech.powerjob.worker.core.processor.ProcessResult;
import tech.powerjob.worker.core.processor.TaskContext;
import tech.powerjob.worker.core.processor.sdk.BasicProcessor;

/**
 * By   : ghd.bright
 * Time : 2021/11/22
 * Description: 容器测试处理器
 */
public class ContainerStart implements BasicProcessor {
    @Override
    public ProcessResult process(TaskContext taskContext) throws Exception {
        System.out.println("这是一个powerJob容器");
        return null;
    }
}
