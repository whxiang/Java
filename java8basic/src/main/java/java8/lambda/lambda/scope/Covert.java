package java8.lambda.lambda.scope;

/**
 * @author whxiang
 * @date 2017/11/29
 */
@FunctionalInterface
public interface Covert<F, S> {
    /**
     * 转换
     *
     * @param f
     * @return 一个转换类型
     */
    S convert(F f);
}
