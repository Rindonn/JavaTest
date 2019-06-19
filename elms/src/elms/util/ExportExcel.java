/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elms.util;

import java.io.*;
import java.util.*;

import jxl.*;
import jxl.format.Alignment;
import jxl.format.Colour;
import jxl.format.ScriptStyle;
import jxl.format.UnderlineStyle;
import jxl.write.*;

/**
 *
 * @author Administrator
 */
public class ExportExcel {

    //打印信息
    public static void printSale(List<?> list, File file) {
        try {
            //2==============创建excel文件并设置数据显示格式
            WritableWorkbook book = Workbook.createWorkbook(file); //创建特殊类型的变量使之与Excel表格对应以便于操作
            WritableSheet sheet1 = book.createSheet("第一页", 0); //在表格中创建第一页，参数指明页的名称和索引，索引从0开始
            sheet1.setColumnView(0, 20); //设置某一列的宽度

            //创建字体，7个参数分别是字体名称，字号，是否粗体，是否斜体，下划线，颜色，上下标
            WritableFont font = new WritableFont(WritableFont.TIMES, 13, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.DARK_RED, ScriptStyle.NORMAL_SCRIPT);
            WritableFont font1 = new WritableFont(WritableFont.TIMES, 10, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK, ScriptStyle.NORMAL_SCRIPT);

            WritableCellFormat format = new WritableCellFormat(font); //将字体放入单元格式中

            WritableCellFormat format1 = new WritableCellFormat(font1);

            format1.setAlignment(Alignment.CENTRE); //对齐方式的设定

            format.setAlignment(Alignment.CENTRE); //对齐方式的设定
            int row = 0;
            for (Iterator<?> iterator = list.iterator(); iterator.hasNext();) {
                Map<?, ?> map = (Map<?, ?>) iterator.next();
                int col = 0;
                for (Iterator<?> localIterator2 = map.keySet().iterator(); localIterator2.hasNext();) {
                    Object obj = localIterator2.next();
                    if (row == 0) {
                        Label label = new Label(col, row, String.valueOf(obj), format);
                        sheet1.addCell(label);
                    } else {
                        sheet1.addCell(new Label(col, row, String.valueOf(map.get(obj)), format1));
                    }
                    //设置列的宽度
                    sheet1.setColumnView(col, 16);
                    col++;
                }
                row++;
            }
            //5 ===================保存数据，存盘
            book.write();//存盘
            book.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    //打印信息

    public static void printStockInfo(List<?> list, File file) {
        try {
            //2==============创建excel文件并设置数据显示格式
            WritableWorkbook book = Workbook.createWorkbook(file); //创建特殊类型的变量使之与Excel表格对应以便于操作
            WritableSheet sheet1 = book.createSheet("第一页", 0); //在表格中创建第一页，参数指明页的名称和索引，索引从0开始
            sheet1.setColumnView(0, 20); //设置某一列的宽度

            //创建字体，7个参数分别是字体名称，字号，是否粗体，是否斜体，下划线，颜色，上下标
            WritableFont font = new WritableFont(WritableFont.TIMES, 13, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.DARK_RED, ScriptStyle.NORMAL_SCRIPT);
            WritableFont font1 = new WritableFont(WritableFont.TIMES, 10, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK, ScriptStyle.NORMAL_SCRIPT);
            WritableCellFormat format = new WritableCellFormat(font); //将字体放入单元格式中

            WritableCellFormat format1 = new WritableCellFormat(font1);
            
            WritableCellFormat format2 = new WritableCellFormat(font1);

            format1.setAlignment(Alignment.CENTRE); //对齐方式的设定

            format.setAlignment(Alignment.CENTRE); //对齐方式的设定
            
            format2.setAlignment(Alignment.CENTRE); //对齐方式的设定
            
            format2.setBackground(Colour.RED);//设置背景颜色
            int row = 0;
            for (Iterator<?> iterator = list.iterator(); iterator.hasNext();) {
                Map<?, ?> map = (Map<?, ?>) iterator.next();
                int col = 0;
                for (Iterator<?> localIterator2 = map.keySet().iterator(); localIterator2.hasNext();) {
                    Object obj = localIterator2.next();
                    Integer quantity = 0;
                    Integer storecount = 0;

                    if (row == 0) {
                        Label label = new Label(col, row, String.valueOf(obj), format);
                        sheet1.addCell(label);
                    } else {
                        quantity = Integer.parseInt((String) map.get("当前库存"));
                        storecount = Integer.parseInt((String) map.get("安全库存"));
                        if (quantity < storecount) {
                            sheet1.addCell(new Label(col, row, String.valueOf(map.get(obj)), format2));
                        }else{
                            sheet1.addCell(new Label(col, row, String.valueOf(map.get(obj)), format1));
                        }
                    }
                    //设置列的宽度
                    sheet1.setColumnView(col, 16);
                    col++;
                }
                row++;
            }
            //5 ===================保存数据，存盘
            book.write();//存盘
            book.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
