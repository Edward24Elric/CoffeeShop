	package DAO;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import DTO.hoaDon;
import DTO.nhanVien;
import SqlServer.DataConnection;

public class hoaDonDAO implements DAOintenface<hoaDon>{


		
		public static hoaDonDAO getInstance() {
			return new hoaDonDAO();
		}
	@Override
	public int Insert(hoaDon t) {
		try {
			DataConnection c = new DataConnection();
			
			Statement s = c.getConnection().createStatement();
			String sql ="INSERT INTO hoaDon(tenNuoc,soLuong,donGia,thanhTien,maHD,date,time)"+
			"VALUES (N'"+t.getTenNuoc()+"','"+t.getSoluong()+"','"+t.getDonGia()+"','"+t.getThanhTien()+"','"+t.getMaHD()+"','"+t.getDate()+"','"+t.getTime()+"');";
			int resultSet=s.executeUpdate(sql);
			System.out.println("Có"+ resultSet+" bị thay đổi");
			JOptionPane.showMessageDialog(null, "Nhập Thành Công");
			c.getConnection().close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}



	@Override
	public int Delete(hoaDon t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(hoaDon t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<hoaDon> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public hoaDon selectById(hoaDon t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public hoaDon selectById(String t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<hoaDon> selectByCondition(String t) {
		// TODO Auto-generated method stub
		return null;
	}

}
