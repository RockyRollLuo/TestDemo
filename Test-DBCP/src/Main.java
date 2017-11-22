public class Main {

    public static void main(String[] args) {
        DBCPTest dbcpTest=new DBCPTest();
        try {
            dbcpTest.testWriteDBCP();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
