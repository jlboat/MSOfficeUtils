/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.jlboat.msofficeutils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author J. Lucas Boatwright
 */
public class MSOfficeUtils {
    public static void main(String[] args){
        Workbook wb = new HSSFWorkbook();
        try (OutputStream fileOut = new FileOutputStream(args[0])){
            wb.write(fileOut);
        } catch (IOException ex){
            System.err.println("Error writing file");
        }// end try-catch
    }
}
