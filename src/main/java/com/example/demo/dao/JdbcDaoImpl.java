package com.example.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.example.demo.model.Circle;

@Component
public class JdbcDaoImpl {
	
public Circle getCircle(int circleId) {
		
		Connection con = null;
		try {
			String driver = "jdbc:derby://localhost:1527/MydbTest";
			
			con = DriverManager.getConnection(driver);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement("select * from Circle where id = ?");
			ps.setInt(1,circleId);
			rs = ps.executeQuery();
			if (rs.next()) {
				return new Circle(circleId, rs.getString("name"));
			}
			
			ps.close();
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return null;
	}

}
