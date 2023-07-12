package liuzhao.lzservlet;


import liuzhao.lzpojo.LzUserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

/**
 * @author 刘昭
 * 用户登录操作
 */
@WebServlet(name = "LiuzhaoUserServlet ",urlPatterns = "/lz_user")
public class LiuzhaoUserServlet extends HttpServlet {
    ResultSet liuzhaoresultSet = null;
    PreparedStatement liuzhaopreparedStatement = null;
    Connection liuzhaoconnection = null;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name=req.getParameter("userName");
        String pass=req.getParameter("passWord");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            liuzhaoconnection= DriverManager.getConnection("jdbc:mysql://localhost:3306/dbliuzhao?useUnicode=" + "true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2B8 ", "root", "root");
           String sql="select * from lzuserinfo where liuzhaoLoginName = ? and liuzhaoLoginPassword=?;";
            liuzhaopreparedStatement = liuzhaoconnection.prepareStatement(sql);
            liuzhaopreparedStatement.setObject(1,name);
            liuzhaopreparedStatement.setObject(2,pass);
            liuzhaoresultSet = liuzhaopreparedStatement.executeQuery();
           LzUserInfo user = null;
           while (liuzhaoresultSet.next()){
               int id=liuzhaoresultSet.getInt("liuzhaoUserID");
               String name1=liuzhaoresultSet.getString("liuzhaoLoginName");
               String password=liuzhaoresultSet.getString("liuzhaoLoginPassword");
               int gender=liuzhaoresultSet.getInt("liuzhaoUserGender");
               String phone=liuzhaoresultSet.getString("liuzhaoUserPhone");
               String email=liuzhaoresultSet.getString("liuzhaoUserEmail");
               int age=liuzhaoresultSet.getInt("liuzhaoUserAge");
               String name2=liuzhaoresultSet.getString("liuzhaoUserName");
               Date createDate=liuzhaoresultSet.getDate("liuzhaoUserCreateDate");
               user = new LzUserInfo(id,name1,password,gender,phone,email,age,name2,createDate);
           }
           if (user != null){
               req.getSession().setAttribute("user",user);
               req.getRequestDispatcher("index.jsp").forward(req,resp);
           }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                liuzhaoresultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                liuzhaopreparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                liuzhaoconnection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);

    }
}
