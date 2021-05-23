package com.blithe.xwj.dao;

import com.blithe.xwj.entity.Question;
import com.blithe.xwj.util.JdbcUtil;
import jakarta.servlet.http.HttpServletRequest;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QuestionDao {

    public int add(Question question, HttpServletRequest request){
        String sql = "insert into question(title,optionA,optionB,optionC,optionD,answer) values(?,?,?,?,?,?)";
        PreparedStatement ps = JdbcUtil.createStatement(sql,request);
        int result = 0;
        try {
            ps.setString(1, question.getTitle());
            ps.setString(2, question.getOptionA());
            ps.setString(3, question.getOptionB());
            ps.setString(4, question.getOptionC());
            ps.setString(5, question.getOptionD());
            ps.setString(6, question.getAnswer());
            result = ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            JdbcUtil.close(request);
        }
        return result;
    }

    public List findAll(HttpServletRequest request) {
        String sql = "select * from question";
        PreparedStatement ps = JdbcUtil.createStatement(sql,request);
        List<Question> questionList = new ArrayList<Question>();
        ResultSet rs = null;
        try {
            rs = ps.executeQuery();
            while(rs.next()){
                Integer questionId = rs.getInt("questionId");
                String title = rs.getString("title");
                String optionA = rs.getString("optionA");
                String optionB = rs.getString("optionB");
                String optionC = rs.getString("optionC");
                String optionD = rs.getString("optionD");
                String answer = rs.getString("answer");
                Question question = new Question(questionId,title,optionA,optionB,optionC,optionD,answer);
                questionList.add(question);
            }
        } catch(SQLException e){
            e.printStackTrace();
        } finally{
            JdbcUtil.close(rs,request);
        }
        return questionList;
    }

    public int delete(int questionId, HttpServletRequest request) {
        int result = 0;
        String sql = "delete from question where questionId = ?";
        PreparedStatement ps = JdbcUtil.createStatement(sql,request);
        try {
            ps.setInt(1, questionId);
            result = ps.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        } finally{
            JdbcUtil.close(request);
        }
        return result;
    }

    public Question findById(int questionId ,HttpServletRequest request){
        String sql = "select * from question where questionId = ?";
        PreparedStatement ps = JdbcUtil.createStatement(sql,request);
        Question question = null;
        ResultSet rs = null;
        try {
            ps.setInt(1, questionId);
            rs = ps.executeQuery();
            while (rs.next()) {
                questionId = rs.getInt("questionId");
                String title = rs.getString("title");
                String optionA = rs.getString("optionA");
                String optionB = rs.getString("optionB");
                String optionC = rs.getString("optionC");
                String optionD = rs.getString("optionD");
                String answer = rs.getString("answer");
                question = new Question(questionId,title,optionA,optionB,optionC,optionD,answer);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            JdbcUtil.close(rs,request);
        }
        return question;
    }

    public int update(Question question,HttpServletRequest request){
        String sql = "update question set title = ?,optionA = ?,optionB = ?,optionC = ? ,optionD = ?,answer = ? where questionId =? ";
        PreparedStatement ps = JdbcUtil.createStatement(sql,request);
        int result = 0;
        try {
            ps.setString(1, question.getTitle());
            ps.setString(2, question.getOptionA());
            ps.setString(3, question.getOptionB());
            ps.setString(4, question.getOptionC());
            ps.setString(5, question.getOptionD());
            ps.setString(6, question.getAnswer());
            ps.setInt(7,question.getQuestionId());
            result = ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            JdbcUtil.close(request);
        }
        return result;
    }

    public List findRand(HttpServletRequest request){
        String sql = "select * from question order by rand() limit 0,4";
        PreparedStatement ps = JdbcUtil.createStatement(sql,request);
        List<Question> questionList = new ArrayList<Question>();
        ResultSet rs = null;
        try {
            rs = ps.executeQuery();
            while(rs.next()){
                Integer questionId = rs.getInt("questionId");
                String title = rs.getString("title");
                String optionA = rs.getString("optionA");
                String optionB = rs.getString("optionB");
                String optionC = rs.getString("optionC");
                String optionD = rs.getString("optionD");
                String answer = rs.getString("answer");
                Question question = new Question(questionId,title,optionA,optionB,optionC,optionD,answer);
                questionList.add(question);
            }
        } catch(SQLException e){
            e.printStackTrace();
        } finally{
            JdbcUtil.close(rs,request);
        }
        return questionList;
    }
}
