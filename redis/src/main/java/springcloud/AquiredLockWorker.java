package springcloud;

/**
 * @description: 一定要写注释啊
 * @date: 2019-09-09 19:39
 * @author: 十一
 */
public interface AquiredLockWorker<T> {
    T invokeAfterLockAquire() throws Exception;
}
