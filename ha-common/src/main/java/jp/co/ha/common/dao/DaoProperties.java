package jp.co.ha.common.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import jp.co.ha.common.util.BeanUtil;

public class DaoProperties {

	private static final DaoProperties instance = new DaoProperties();

	private String driverClassName;
	private String url;
	private String username;
	private String password;

	private DaoProperties() {
		if (BeanUtil.isNull(instance)) {
			init();
		}
	}

	public static DaoProperties getInstance() {
		return instance;
	}

	private void init() {
		String classPath = this.getClass().getClassLoader().getResource("").getPath();
		String propertiesPath = "META-INF" + File.separator + "jdbc.properties";
		File propFile = new File(classPath, propertiesPath);
		Properties prop = new Properties();
		try (InputStream is = new FileInputStream(propFile.getAbsolutePath())) {
			prop.load(is);
			this.driverClassName = prop.getProperty("driverClassName");
			this.url = prop.getProperty("url");
			this.username = prop.getProperty("username");
			this.password = prop.getProperty("password");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("<><><><>classPath : " + classPath);
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
