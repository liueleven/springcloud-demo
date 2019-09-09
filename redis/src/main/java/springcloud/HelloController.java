package springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springcloud.zk.DistributedLock;

/**
 * @description: 一定要写注释啊
 * @date: 2019-09-09 19:37
 * @author: 十一
 */
@RestController
public class HelloController {

    @Autowired
    private DistributedLockHandler distributedLockHandler;

    @Autowired
    private DistributedLocker distributedLocker;

    @RequestMapping("index")
    public String index() {
        Lock lock = new Lock("lynn", "min");
        if (distributedLockHandler.tryLock(lock)) {
            try {
                //为了演示锁的效果，这里睡眠5000毫秒
                System.out.println("执行方法");
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            distributedLockHandler.releaseLock(lock);
        }
        return "hello world!";
    }
    @RequestMapping("index2")
    public String index2()throws Exception{
        distributedLocker.lock("test",new AquiredLockWorker<Object>() {

            @Override
            public Object invokeAfterLockAquire() {
                try {
                    System.out.println("执行方法！");
                    Thread.sleep(5000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                return null;
            }

        });
        return "hello world!";
    }

    @RequestMapping("index3")
    public String index3()throws Exception{
        DistributedLock lock   = new DistributedLock("localhost:2181","lock");
        lock.lock();
        //共享资源
        if(lock != null){
            System.out.println("执行方法");
            Thread.sleep(5000);
            lock.unlock();
        }
        return "hello world!";
    }
}