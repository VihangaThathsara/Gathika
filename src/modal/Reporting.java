package modal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import javax.swing.JFileChooser;
import modal.beans.Admin;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.view.JasperViewer;

public class Reporting {

    // find save folder
    private String getFolder() {
        // Create the JFileChooser instance
        JFileChooser folderChooser = new JFileChooser();
        folderChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        // Show the open dialog
        int result = folderChooser.showOpenDialog(null);

        // Check if a folder was selected
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = folderChooser.getSelectedFile();
            return selectedFolder.getAbsolutePath();
        }
        return null;
    }

    // save reports
    public boolean saveReport(String reportName, HashMap parm, JRDataSource dataSource, Admin admin) throws JRException, IOException, FileNotFoundException, ClassNotFoundException {
        String path = getFolder();
        if (path == null) {
            return false;
        }
        JasperPrint print = JasperFillManager.fillReport("src//report//" + reportName + ".jasper", parm, dataSource);
        JasperExportManager.exportReportToPdfFile(print, path + "/" + reportName + modal.SetDate.getDate("yyyy-MM-dd HH.mm").replace(" ", "_") + ".pdf");

        // send Email
        Mail.sendMail(new HomeInfo().getHome().getEmail(), "System Report Notification", "A new " + reportName + " report is Saved by " + admin.getUserName() + "\n Path: " + path);
        return true;
    }

    // save reports
    public boolean saveReport(String reportName, HashMap parm, Admin admin) throws JRException, IOException, FileNotFoundException, ClassNotFoundException {
        String path = getFolder();
        if (path == null) {
            return false;
        }
        JasperPrint print = JasperFillManager.fillReport("src//report//" + reportName + ".jasper", parm, new JREmptyDataSource());
        JasperExportManager.exportReportToPdfFile(print, path + "/" + reportName + modal.SetDate.getDate("yyyy-MM-dd HH.mm").replace(" ", "_") + ".pdf");
        // send Email
        Mail.sendMail(new HomeInfo().getHome().getEmail(), "System Report Notification", "A new " + reportName + " report is Saved by " + admin.getUserName() + "\n Path: " + path);
        return true;
    }

    // viwe reports
    public void viewReport(String reportName, HashMap parm, JRDataSource dataSourse, Admin admin) throws JRException, IOException, FileNotFoundException, ClassNotFoundException {
        JasperPrint print = JasperFillManager.fillReport("src//report//" + reportName + ".jasper", parm, dataSourse);
        JasperViewer.viewReport(print, false);

        // send Email
        Mail.sendMail(new HomeInfo().getHome().getEmail(), "System Report Notification", "A new " + reportName + " report is viewed by " + admin.getUserName());
    }

    // viwe reports
    public void viewReport(String reportName, HashMap parm, Admin admin) throws JRException, IOException, FileNotFoundException, ClassNotFoundException {
        JasperPrint print = JasperFillManager.fillReport("src//report//" + reportName + ".jasper", parm, new JREmptyDataSource());
        JasperViewer.viewReport(print, false);

        // send Email
        Mail.sendMail(new HomeInfo().getHome().getEmail(), "System Report Notification", "A new " + reportName + " report is viewed by " + admin.getUserName());
    }

    // print reports
    public boolean printReport(String reportName, HashMap parm, JRDataSource dataSourse) throws JRException {
        JasperPrint print = JasperFillManager.fillReport("src//report//" + reportName + ".jasper", parm, dataSourse);
        return JasperPrintManager.printReport(print, true);

    }

    // print reports
    public boolean printReport(String reportName, HashMap parm) throws JRException {
        JasperPrint print = JasperFillManager.fillReport("src//report//" + reportName + ".jasper", parm, new JREmptyDataSource());
        return JasperPrintManager.printReport(print, true);

    }

}
