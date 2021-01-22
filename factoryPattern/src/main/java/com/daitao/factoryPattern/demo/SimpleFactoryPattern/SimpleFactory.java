package com.daitao.factoryPattern.demo.SimpleFactoryPattern;

/**
 * @author 戴涛
 * @Content 简单工厂
 * @CreateTime 2021/1/22
 */
public class SimpleFactory {
    public static Product makeProduct(int kind) {
        switch (kind) {
            case Const.PRODUCT_A:
                return new ConcreteProduct1();
            case Const.PRODUCT_B:
                return new ConcreteProduct2();
        }
        return null;
    }
}
