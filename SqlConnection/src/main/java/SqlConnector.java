import java.sql.*;
import java.util.Scanner;

import static java.lang.System.exit;

public class SqlConnector {
    static Scanner sc = new Scanner(System.in);
    private static Connection con;
    private static Statement stm;
    public static void main(String[] args) throws SQLException {
        try {
            String addr = "jdbc:mysql://localhost:3306/college";
            String username = "root";
            String password = "root";
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Sql connected");
            con = DriverManager.getConnection(addr, username, password);
            stm=con.createStatement();
            Scanner op=new Scanner(System.in);
            while (true) {
                System.out.println("enter option");
                System.out.println("1:insert,2:delete,3:display,4:exit");
                int option = op.nextInt();
                switch (option) {
                    case 1:
                        insertInfo();
                        break;
                    case 2:
                        removeInfo();
                        break;
                    case 3:
                        getInfo();
                        break;
                    case 4:
                        exit(0);
                        break;
                    default:
                        System.out.println("Enter valid option");
                }
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }


    

    public static void insertInfo() throws SQLException {
        System.out.println("enter usn");
        String usn=sc.next();
        System.out.println("enter name");
        String name=sc.next();
        System.out.println("ente age");
        int age=sc.nextInt();
        System.out.println("enter branch");
        String branch=sc.next();
        System.out.println("enter place");
        String place=sc.next();
            String sql1 = "insert into student values(?,?,?,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql1);
            pstm.setString(1, "usn");
            pstm.setString(2, "name");
            pstm.setInt(3, 30);
            pstm.setString(4, "branch");
            pstm.setString(5, "place");
            //System.out.println(pstm.getMetaData());
            int status=pstm.executeUpdate();
            System.out.println("Insertion done");
        }

    private static void getInfo() throws SQLException {
        System.out.println("enter usn");
        String usn=sc.next();
            String sql = "select * from student where usn="+usn+"";
            stm.executeQuery(sql);
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                System.out.println("usn:" + rs.getString(1) + "name:" + rs.getString(2) + "age : " + rs.getInt(3) + "branch : " + rs.getString(4) + "place : " + rs.getString(4));
            }

        }
    private static void removeInfo() throws SQLException {
        System.out.println("enter usn");
        String usn=sc.next();
        String sid=sc.next();
        String sql="delete from student where usn="+usn+"";
        stm.executeUpdate(sql);
        System.out.println(("deleted sucess"));

    }
}
        
