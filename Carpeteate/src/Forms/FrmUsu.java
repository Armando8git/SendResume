package Forms;

import Funciones.Operaciones;
import java.awt.Color;

/**
 * @author ROQUEARMANDORAMIREZP
 */
public class FrmUsu extends javax.swing.JInternalFrame {

    Operaciones Operacion = new Operaciones();

    /**
     * Creates new form FrmInicio
     */
    public FrmUsu() {
        initComponents();
        //this.setIconImage(new ImageIcon(getClass().getResource("/Ico/Load.ico")).getImage());//coloca icono al from
        //this.setLocationRelativeTo(null);//centre el formulario en el centro de la pantalla
        TxtCorreo.setText(Operacion.GetUsuar());
        TxtContra.setText(Operacion.GetContra());
        
        //String password = new String(TxtContra.getPassword());
        //System.out.println("FORMULARIO:usua:>"+TxtCorreo.getText()+"<");
        //System.out.println("FORMULARIO-variable:cont:>"+password+"<");
        //System.out.println("desde el metodo llega al formulario asi:cont:>"+Operacion.GetContra()+"<");
        //this.setLocationRelativeTo(null);//centre el formulario en el centro de la pantalla
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
        jLabel2 = new javax.swing.JLabel();
        CmdAceptar = new javax.swing.JButton();
        CmdCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        TxtCorreo = new javax.swing.JTextField();
        TxtContra = new javax.swing.JPasswordField();

        setTitle("Email de Origen");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Ico/page_edit.png"))); // NOI18N

        jLabel1.setText("Correo:");

        jLabel2.setText("Contraseña:");

        CmdAceptar.setText("Aceptar");
        CmdAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdAceptarActionPerformed(evt);
            }
        });

        CmdCancelar.setText("Cancelar");
        CmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdCancelarActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(102, 102, 102));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Asegurese de ingresar correctamente sus credenciales y configurar su servicio de correo Gmail (activar verificacion en dos pasos y contraseña para aplicaiones) para que permita el acceso de esta aplicación caso contrario, no se podrá enviar los Cv's a su nombre.");
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea1.setEnabled(false);
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        TxtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtCorreoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCorreoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(CmdAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CmdCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TxtContra))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmdAceptar)
                    .addComponent(CmdCancelar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdCancelarActionPerformed
        this.dispose();    //cierra esta ventana 
    }//GEN-LAST:event_CmdCancelarActionPerformed

    private void TxtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCorreoKeyTyped
        if (TxtCorreo.getText().length() >= 255) {
            evt.consume(); // impide que ingresen más de 255 caracteres
        }
    }//GEN-LAST:event_TxtCorreoKeyTyped

    private void TxtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCorreoKeyReleased
        //colorea si se ingres mal el correo
        if (Operacion.EsCorreo(TxtCorreo.getText())) {
            TxtCorreo.setBackground(Color.WHITE);
        } else {
            TxtCorreo.setBackground(Color.orange);
            /*TxtCorreo.setBackground(Color.getHSBColor(c8,70,90));
            el HSb no es RGB pero no logré conseguir el color que queria*/
        }
    }//GEN-LAST:event_TxtCorreoKeyReleased

    private void CmdAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdAceptarActionPerformed
        if (TxtCorreo.getText().length() > 0 && TxtContra.getPassword().length > 0 && Operacion.EsCorreo(TxtCorreo.getText())) {
            String password = new String(TxtContra.getPassword());//tiene el texto sin encriptar que el usuario ingreso
            Operacion.SetUsuario(TxtCorreo.getText(), password);
            this.dispose();    //cierra esta ventana            
        }
    }//GEN-LAST:event_CmdAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CmdAceptar;
    private javax.swing.JButton CmdCancelar;
    private javax.swing.JPasswordField TxtContra;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
