/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JFPrincipal.java
 *
 * Created on 27/08/2011, 11:53:02 AM
 */

package proyectocanvas;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author apdaza
 */
public class JFPrincipal extends javax.swing.JFrame implements MouseListener {
    MiCanvas miCanvas;
    int cont;


    /** Creates new form JFPrincipal */
    public JFPrincipal() {
        miCanvas = new MiCanvas();
        miCanvas.setBounds(0, 0, 500, 500);
        cont = 0;
        miCanvas.addMouseListener(this);
        miCanvas.setBackground(Color.yellow);
        add(miCanvas);
        initComponents();
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    public void mouseClicked(MouseEvent me) {
        if(cont % 2 == 0){
            miCanvas.xo = me.getX();
            miCanvas.yo = me.getY();
        }else{
            miCanvas.xf = me.getX();
            miCanvas.yf = me.getY();
            miCanvas.repaint();
        }
        cont++;
    }

    public void mousePressed(MouseEvent me) {
        
    }

    public void mouseReleased(MouseEvent me) {
        
    }

    public void mouseEntered(MouseEvent me) {
        
    }

    public void mouseExited(MouseEvent me) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
