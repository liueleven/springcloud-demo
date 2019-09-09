package springcloud;

/**
 * @description: 一定要写注释啊
 * @date: 2019-09-09 19:40
 * @author: 十一
 */
/**
 * 异常类
 */
public class UnableToAquireLockException extends RuntimeException {

    public UnableToAquireLockException() {
    }

    public UnableToAquireLockException(String message) {
        super(message);
    }

    public UnableToAquireLockException(String message, Throwable cause) {
        super(message, cause);
    }
}