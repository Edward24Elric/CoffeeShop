package com.mycompany.qlnu;
import net.sf.jasperreports.engine.*;

import net.sf.jasperreports.view.JasperViewer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class T {


	 public static void main(String[] args) {
	        try {
	            // Đường dẫn đến file .jrxml
	            String reportPath = "src/main/java/com/mycompany/qlnu/Blank_A4_Landscape.jrxml";

	            // Compile file .jrxml thành file .jasper
	            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);

	            // Tạo một nguồn dữ liệu (DataSource), ví dụ từ cơ sở dữ liệu hoặc một Collection
	            JRDataSource dataSource = new JREmptyDataSource();

	            // Tạo các tham số báo cáo (nếu có)
	            Map<String, Object> parameters = new HashMap<>();
	            parameters.put("", "");

	            // Điền dữ liệu vào báo cáo
	            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);

	            // Hiển thị báo cáo bằng JasperViewer
	            JasperViewer.viewReport(jasperPrint, false);

	        } catch (JRException e) {
	            e.printStackTrace();
	        }
	    }

}
