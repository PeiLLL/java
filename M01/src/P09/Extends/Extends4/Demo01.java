package P09.Extends.Extends4;
/*
方法重写的注意事项：
1.必须保证父子类之间的方法名称相同，参数列表也相同
    @Override:写在方法前面，用来检测是不是有效的方法重写（不写也算是有效的重写）
2.子类方法的返回值必须 小于等于 父类方法的返回值范围。(java.long.Object是最高父类，Java.long.String是Object的子类)
3.子类方法的权限必须 大于等于 父类方法的权限修饰符。
    (public > protected > (default)> privare)
备注；(default)不是关键字default，而是什么都不写，留空
 */
public class Demo01 {
}
