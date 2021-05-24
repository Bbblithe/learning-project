package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import JDBC.utils.DBUtil;

/**
 * Author:  blithe.xwj
 * Date:    2021/3/21 20:53
 * Description:
 */


class TestMain {
    public static void main(String[] args) {
        Scanner request = new Scanner(System.in);
        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;

        String userName,password,dname,loc;
        int deptNo;
        String sql_1 = "select count(*) from emp where ename=? and empno=?";
        String sql_2 = "insert into dept (deptNo,dname,loc) values(?,?,?)";
        String sql_3 = "select * from dept";
        String sql_4 = "delete from dept where deptno = ?";
        String sql_5 = "update dept set dname = ?,loc = ? where deptno = ?";

        int flag = 0;
        //------登陆验证-----Start
        System.out.print("请输入用户名:");
        userName = request.nextLine();
        System.out.print("请输入密码:");
        password = request.nextLine();
        try {
            conn = DBUtil.getConnection();
            ps = conn.prepareStatement(sql_1);
            ps.setString(1,userName);
            ps.setString(2,password);
            rs = ps.executeQuery();
            while(rs.next()){
                flag = rs.getInt("count(*)");
            }
            if(flag != 1) {
                System.out.println("输入的信息不存在，请重新登陆。。。");
                return;
            }
            //------登陆验证-----End

            while(true){
                //------具体功能页面----Start
                System.out.println("*****欢迎使用某某公司部门管理系统*****");
                System.out.println("*****1.添加部门*******");
                System.out.println("*****2.查询部门*******");
                System.out.println("*****3.删除部门*******");
                System.out.println("*****4.更新部门*******");
                System.out.println("*****请输入操作********");
                int flag_1 = request.nextInt();

                if(flag_1 == 1){
                    System.out.println("*****请输入部门编号*******");
                    deptNo = request.nextInt();
                    System.out.println("*****请输入部门名称*******");
                    dname = request.next();
                    System.out.println("*****请输入部门位置*******");
                    loc = request.next();

                    ps = conn.prepareStatement(sql_2);
                    ps.setInt(1,deptNo);
                    ps.setString(2,dname);
                    ps.setString(3,loc);

                    flag = ps.executeUpdate();

                    if(flag ==1){
                        System.out.println("插入成功");
                    }
                }else if(flag_1 == 2){
                    ps = conn.prepareStatement(sql_3);
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        System.out.println("   部门编号:"+rs.getString(1) + "   部门名称:" + rs.getString(2) + "      部门位置:" + rs.getString(3));
                    }
                }else if(flag_1 == 3){
                    System.out.println("*****请输删除部门编号*******");
                    deptNo = request.nextInt();
                    ps = conn.prepareStatement(sql_4);
                    ps.setInt(1,Integer.valueOf(deptNo));
                    flag = ps.executeUpdate();
                    if(flag == 1) {
                        System.out.println("删除成功！");
                    }else{
                        System.out.println("该部门不存在！");
                    }
                }else{
                    System.out.println("*****请输入部门编号*******");
                    deptNo = request.nextInt();
                    System.out.println("*****请输入部门名称*******");
                    dname = request.next();
                    System.out.println("*****请输入部门位置*******");
                    loc = request.next();

                    ps = conn.prepareStatement(sql_5);
                    ps.setString(1,dname);
                    ps.setString(2,loc);
                    ps.setInt(3,deptNo);
                    flag = ps.executeUpdate();
                    if(flag == 1){
                        System.out.println("部门信息更新成功");
                    }else{
                        System.out.println("更新失败");
                    }
                }
                System.out.println("退出系统轻按0，回到上一级菜单请按任意键");
                //------具体功能页面----End
                flag = request.nextInt();
                if(flag == 0){
                    System.out.println("系统关闭中....");
                    return;
                }
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally{
            DBUtil.close(conn,ps,rs);
            System.out.println("系统关闭成功，谢谢使用！！再见！");
        }
    }
}
