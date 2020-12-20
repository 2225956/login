package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tools.DBUtil;
import vo.DownloadList;

public class DownloadListDao {
	public static List<DownloadList> queryAllList() {

		ResultSet rs = null;
		String sql = "select * from t_downloadlist";
		Object[] params = null;
		List<DownloadList> list = new ArrayList<>();
		rs = DBUtil.executeQuery(sql, params);
		try {
			while(rs.next()){
				DownloadList load = new DownloadList();//user对象要写到while循环内，不然user内的数据会被最后一个数据替换
				load.setId(rs.getInt("id"));
				load.setName(rs.getString("name"));
				load.setPath(rs.getString("path"));
				load.setDescription(rs.getString("description"));
				load.setSize(rs.getDouble("size"));
				load.setStar(rs.getInt("star"));
				load.setImage(rs.getString("image"));
				list.add(load);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeAll(DBUtil.co, DBUtil.ps, rs);
		}
		return list;
	}
	
	public static DownloadList queryAllList1() {

		ResultSet rs = null;
		String sql = "select * from t_downloadlist";
		Object[] params = null;
		rs = DBUtil.executeQuery(sql, params);
		DownloadList load = new DownloadList();
		try {
			while(rs.next()){
				//user对象要写到while循环内，不然user内的数据会被最后一个数据替换
				load.setId(rs.getInt("id"));
				load.setName(rs.getString("name"));
				load.setPath(rs.getString("path"));
				load.setDescription(rs.getString("description"));
				load.setSize(rs.getDouble("size"));
				load.setStar(rs.getInt("star"));
				load.setImage(rs.getString("image"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeAll(DBUtil.co, DBUtil.ps, rs);
		}
		return load;
	}
}
///META-INF/img/gaokao.jpg
///META-INF/高考资料.zip
