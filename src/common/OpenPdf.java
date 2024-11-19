/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import dao.InventoryUtils;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class OpenPdf {

    public static void OpenById(String id) {

        try {
            if ((new File(InventoryUtils.billPath + id + ".pdf")).exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler "+InventoryUtils.billPath+""+id+".pdf");
            }
            else{
                JOptionPane.showMessageDialog(null, "File is not Exists");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }
}
