package springcloud;

/**
 * @description: 一定要写注释啊
 * @date: 2019-09-09 19:34
 * @author: 十一
 */
public class Lock {
    private String name;
    private String value;

    public Lock(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
