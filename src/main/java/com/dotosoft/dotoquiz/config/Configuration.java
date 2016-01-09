package com.dotosoft.dotoquiz.config;

import static java.lang.String.format;

import java.util.List;

public class Configuration {
	private Connection connection;
	private String dialect;
	private String currentSessionContextClass;
	private String hbm2ddl;
	private String showSQL;
	private List<String> mappingClasses;
	private List<String> mappingPackages;

	public List<String> getMappingPackages() {
		return mappingPackages;
	}

	public void setMappingPackages(List<String> mappingPackages) {
		this.mappingPackages = mappingPackages;
	}

	public String getHbm2ddl() {
		return hbm2ddl;
	}

	public void setHbm2ddl(String hbm2ddl) {
		this.hbm2ddl = hbm2ddl;
	}

	public String getShowSQL() {
		return showSQL;
	}

	public void setShowSQL(String showSQL) {
		this.showSQL = showSQL;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public String getDialect() {
		return dialect;
	}

	public void setDialect(String dialect) {
		this.dialect = dialect;
	}

	public String getCurrentSessionContextClass() {
		return currentSessionContextClass;
	}

	public void setCurrentSessionContextClass(String currentSessionContextClass) {
		this.currentSessionContextClass = currentSessionContextClass;
	}

	public List<String> getMappingClasses() {
		return mappingClasses;
	}

	public void setMappingClasses(List<String> mappingClasses) {
		this.mappingClasses = mappingClasses;
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("Setting Configurations:\n")
				.append(format("Dialect: %s\n", dialect))
				.append(format("hbm2ddl: %s\n", hbm2ddl))
				.append(format("show_sql: %s\n", showSQL))
				.append(format("Current session context class: %s\n",
						currentSessionContextClass))
				.append(format("Connecting to database: %s\n", connection))
				.append(format("Mapping Classes: %s\n", mappingClasses))
				.toString();
	}
}
