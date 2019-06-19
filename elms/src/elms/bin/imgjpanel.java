/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elms.bin;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

/**
 *
 * @author YukiMuraRindon
 */
public class imgjpanel extends javax.swing.JPanel {

    private Image img;
    /**
     * Creates new form imgjpanel
     */
    private void setImgURL(URL imgURL){
        img = Toolkit.getDefaultToolkit().createImage(imgURL);
    }
    
    /**
     *
     * @param g
     */
    @Override
    public void paintComponent(Graphics g){
        if(img == null)
            return;
        g.drawImage(img,0,0,this.getParent().getWidth(),this.getParent().getHeight(),this);
    }
    
    public imgjpanel() {
        initComponents();
        this.setImgURL(this.getClass().getResource("imgs/elms.jpg"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}