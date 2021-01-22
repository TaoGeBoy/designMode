package com.daitao.Prototype.demo.PrototypeManager;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 戴涛
 * @Content 原型管理器
 * @CreateTime 2021/1/22
 */
public class ProtoTypeManager {
    Map<String,Shape> ht = new HashMap<String,Shape>();
    public ProtoTypeManager() {
        ht.put("Circle", new Circle());
        ht.put("Square", new Square());
    }
    public void addshape(String key, Shape obj) {
        ht.put(key, obj);
    }

    public Shape getShape(String key) {
        Shape temp = ht.get(key);
        return (Shape) temp.clone();
    }
}
