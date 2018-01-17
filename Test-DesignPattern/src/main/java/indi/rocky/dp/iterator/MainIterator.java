package indi.rocky.dp.iterator;

/**
 * @Date: 2018/1/17
 * @Author: luoqi3
 */
public class MainIterator {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext(); ) {
            String name = (String) iterator.next();
            System.out.println("Name:" + name);
        }
    }

}
