package liuzhao.lzservlet;


import liuzhao.lzpojo.LzVegetableInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 刘昭
 * 通过菜品名称查询菜品
 */
@WebServlet(name = "LiuzhaoSelectVnameServlet",urlPatterns = "/lz_selectVname")
public class LiuzhaoSelectVnameServlet extends HttpServlet {
    ResultSet liuzhaoresultSet = null;
    PreparedStatement liuzhaopreparedStatement = null;
    Connection liuzhaoconnection = null;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String vName = req.getParameter("vName");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            liuzhaoconnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbliuzhao?useUnicode=" + "true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2B8 ", "root", "root");
            String sql = "select * from lzvegetableinfo where liuzhaoVegetableName = ?";
            liuzhaopreparedStatement = liuzhaoconnection.prepareStatement(sql);
            liuzhaopreparedStatement.setString(1, vName);
            liuzhaoresultSet = liuzhaopreparedStatement.executeQuery();
            List<LzVegetableInfo>list=new ArrayList<>();
            while (liuzhaoresultSet.next()) {
                int id = liuzhaoresultSet.getInt("liuzhaoVegetableInfoID");
                String name = liuzhaoresultSet.getString("liuzhaoVegetableName");
                double liuzhaoVegetablePrice = liuzhaoresultSet.getDouble("liuzhaoVegetablePrice");
                String liuzhaoVegetableMaterial = liuzhaoresultSet.getString("liuzhaoVegetableMaterial");
                String liuzhaoVegetableTaste = liuzhaoresultSet.getString("liuzhaoVegetableTaste");
                String liuzhaoVegetablePhoto = liuzhaoresultSet.getString("liuzhaoVegetablePhoto");
                LzVegetableInfo vegetableInfo = new LzVegetableInfo(id,name,liuzhaoVegetablePrice,liuzhaoVegetableMaterial,liuzhaoVegetableTaste,liuzhaoVegetablePhoto);
                list.add(vegetableInfo);
            }
            req.setAttribute("list", list);
            req.getRequestDispatcher("type.jsp").forward(req, resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
