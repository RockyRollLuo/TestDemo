import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by luoqi3 on 2017/11/11.
 */
public class DBCPTest {


    public void testWriteDBCP() throws Exception{
        for(int i=0;i<2000;i++){
            writeDBCP(i);
        }
        System.out.println("DONE");
    }

    public void writeDBCP(int data){
        String sql="INSERT INTO dbcp values(?)";
        try{
            Connection conn= DBCPUtil.getConnection();
            PreparedStatement preparedStatement=conn.prepareStatement(sql);
            preparedStatement.setString(1,data+"");
            preparedStatement.executeUpdate(sql);
            conn.commit();
//            conn.close(); //连接池控制关闭，不需要这里控制
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
