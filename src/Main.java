import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// its working properly//

class main{
    public static void main(String[] args) {

        String url ="jdbc:mysql://localhost:3306/your Database name here";
        String user = "root";
        String password ="password";
        String Qurys ="Select* from table";

        try(
                Connection con = DriverManager.getConnection(url,user,password);
                Statement  st =con.createStatement();
                ResultSet rs = st.executeQuery(Qurys);
                )
        {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getInt(2));
            System.out.println(rs.getInt(3));

        }
        catch (Exception p){
            p.printStackTrace();
        }
    }
}