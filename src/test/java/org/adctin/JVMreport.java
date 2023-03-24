package org.adctin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMreport {

	public static void generateJVMrep(String json) {

    File fl = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReport");

		Configuration cn = new Configuration(fl, "AdactinCucu");
		cn.addClassifications("browser", "chrome");
		cn.addClassifications("browserversion", "chrome 111.11");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(json);
		ReportBuilder re = new ReportBuilder(jsonFiles, cn);
		re.generateReports();
	}

}
