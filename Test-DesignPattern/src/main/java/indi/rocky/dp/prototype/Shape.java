package indi.rocky.dp.prototype;

/**
 * 实现Cloneable接口的抽象类
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;//同一个包的类能访问，其他包的子类能访问

    /**
     * 主要方法
     */
    abstract void draw();


    public Object clone() {
        Object clone=null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    /*
     * getter setter
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
