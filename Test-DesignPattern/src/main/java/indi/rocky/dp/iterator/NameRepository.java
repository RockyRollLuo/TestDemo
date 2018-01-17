package indi.rocky.dp.iterator;

/**
 * @Date: 2018/1/17
 * @Author: luoqi3
 */
public class NameRepository implements Container {

    //创建的迭代对象
    public String names[] = {"Robert", "John", "Julie", "Lora"};


    //重写Container接口方法，获取下一个对象
    public Iterator getIterator() {
        return new NameIterator();
    }


    //实现迭代器接口的内部类
    private class NameIterator implements Iterator {

        int index;

        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}

