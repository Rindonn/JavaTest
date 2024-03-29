/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elms.bin;
import elms.po.Purchase;
import elms.po.Sell;
import elms.service.sellserviceimpl;
import elms.util.ChartBuilder;
import elms.util.ExportExcel;
import elms.util.FrameUtil2;
import java.io.File;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author YukiMuraRindon
 */
public class xsinternalframe extends javax.swing.JInternalFrame {

    /**
     * Creates new form xsinternalframe
     */
    public xsinternalframe() {
        initComponents();
    }
     public void refresh(List<Sell> list)
    {
        DefaultTableModel m = (DefaultTableModel) this.tabp.getModel();
        while(m.getRowCount()>0){
            m.removeRow(0);
        }
        for(Sell p:list){
            Vector v = new Vector();
            v.add(p.getSeid());
            v.add(p.getProname());
            v.add(p.getSellnum());
            v.add(p.getSellprice());
            BigDecimal b = new BigDecimal(p.getSellnum());
            v.add(p.getSellprice().multiply(b));
            v.add(p.getCusname());
            v.add(p.getSelldate());
            m.addRow(v);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabp = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btndatestart = new elms.util.DateChooserJButton();
        btndateend = new elms.util.DateChooserJButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("销售查询");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setText("-");

        jButton1.setText("查询");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "销售单号", "销售商品名", "销售数量", "销售价格", "销售金额", "客户", "销售时间"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabp);

        jButton2.setText("打印报表");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btndatestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndatestartActionPerformed(evt);
            }
        });

        jButton3.setText("图表");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(btndatestart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndateend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(142, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndatestart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndateend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        FrameUtil2.framemap.remove(xsinternalframe.class.getName());
    }//GEN-LAST:event_formInternalFrameClosing

    private void btndatestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndatestartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndatestartActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String start = this.btndatestart.getText();
        String end = this.btndateend.getText();
        sellserviceimpl s = new sellserviceimpl();
        List<Sell> list = s.getByEmp(start,end);
        String datetitle = start+"到"+end+"员工销售统计";
        ChartBuilder chart = new ChartBuilder(datetitle,list);
        chart.pack();
        chart.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        sellserviceimpl s = new sellserviceimpl();
        String start = this.btndatestart.getText();
        String end = this.btndateend.getText();
        String key = this.txtSearch.getText();
        List<Sell> list = s.getByEmp(start,end,key);
        refresh(list);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        sellserviceimpl s = new sellserviceimpl();
        String start = this.btndatestart.getText();
        String end = this.btndateend.getText();
        String key = this.txtSearch.getText();
        List<Sell> list = s.getByEmp(start,end,key);
        refresh(list);
        JFileChooser savefile = new JFileChooser();
        FileNameExtensionFilter  f = new FileNameExtensionFilter("Excel文件(*.xls)","*.xls");
        savefile.addChoosableFileFilter(f);
        savefile.setFileFilter(f);
        int flag = savefile.showSaveDialog(this);
        File file = null;
        if(flag == JFileChooser.APPROVE_OPTION){
            file = savefile.getSelectedFile();
            System.out.println("文件名:"+file.getAbsolutePath());
            String filename = file.getAbsolutePath();
            String filetype = filename.substring(filename.length()-4);
            if(!filetype.equals(".xls")){
                file = new File(filename+".xls");
            }
            List<Map<String,String>> ls = new ArrayList<Map<String,String>>();
            //String[] str ={"采购编号","商品名称","供应商","采购价格"
            Map<String,String> map = new LinkedHashMap<String,String>();
            map.put("销售单号", null);
            map.put("销售商品名",null);
            map.put("销售数量",null);
            map.put("销售价格",null);
            map.put("销售金额",null);
            map.put("客户",null);
            map.put("销售时间",null);
            ls.add(map);
            
            Map<String,String> mm;
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            for(Sell p1:list){
                mm = new LinkedHashMap<String,String>();
                mm.put("销售单号",String.valueOf(p1.getSeid()));
                mm.put("销售商品名",p1.getProtype());
                mm.put("销售数量",String.valueOf(p1.getSellnum()));
                mm.put("销售价格",String.valueOf(p1.getSellprice()));  
                BigDecimal b = new BigDecimal(p1.getSellnum());
                mm.put("销售金额",String.valueOf(p1.getSellprice().multiply(b)));
                mm.put("客户",String.valueOf(p1.getCusname()));
                if(p1.getSelldate()!= null){
                    mm.put("销售时间",format.format(p1.getSelldate()));
        }
                else{
                    mm.put("销售时间",null);
                }
                ls.add(mm);
            }
            ExportExcel.printSale(ls, file);
            JOptionPane.showMessageDialog(this, "打印成功");
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private elms.util.DateChooserJButton btndateend;
    private elms.util.DateChooserJButton btndatestart;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabp;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
