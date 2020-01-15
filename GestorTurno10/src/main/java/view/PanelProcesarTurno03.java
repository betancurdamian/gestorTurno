/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ProcesarTurnoController;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import model.Area;
import model.TipoTramite;

/**
 *
 * @author Ariel
 */
public class PanelProcesarTurno03 extends javax.swing.JPanel implements InterfacePanel {

    private final ValidadorDeCampos validador;

    private final ProcesarTurnoController controlador;
    
    

    /**
     * Creates new form PanelEmpresa
     *
     * @param controlador
     */
    public PanelProcesarTurno03(ProcesarTurnoController controlador) {
        
        initComponents();
        validador = new ValidadorDeCampos();
        habilitarTodosLosBotones(true);
        this.controlador = controlador;

        this.jpb_estado_procesarTurno.setValue(45);
        this.jpb_estado_procesarTurno.setForeground(new Color(220, 118, 51));
        

        this.jlbl_titulo.setBackground(new Color(30, 132, 73));
        this.jlbl_titulo.setOpaque(true);

        cargarAreas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtn_cancelar = new javax.swing.JButton();
        jlbl_paso = new javax.swing.JLabel();
        jlbl_titulo = new javax.swing.JLabel();
        jpb_estado_procesarTurno = new javax.swing.JProgressBar();
        jPanel_Contenido = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jcb_tipoTramite = new javax.swing.JComboBox<>();
        jbtn_siguiente = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(950, 750));
        setMinimumSize(new java.awt.Dimension(950, 750));

        jbtn_cancelar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jbtn_cancelar.setText("CANCELAR");
        jbtn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cancelarActionPerformed(evt);
            }
        });

        jlbl_paso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_paso.setText("TIPO DE TRAMITE DE AREA");

        jlbl_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_titulo.setText("PROCESAR TURNO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("TIPO TRAMITE");

        javax.swing.GroupLayout jPanel_ContenidoLayout = new javax.swing.GroupLayout(jPanel_Contenido);
        jPanel_Contenido.setLayout(jPanel_ContenidoLayout);
        jPanel_ContenidoLayout.setHorizontalGroup(
            jPanel_ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ContenidoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jcb_tipoTramite, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel_ContenidoLayout.setVerticalGroup(
            jPanel_ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ContenidoLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel_ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_tipoTramite, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jbtn_siguiente.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jbtn_siguiente.setText("SIGUIENTE");
        jbtn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_siguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpb_estado_procesarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_paso, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_Contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpb_estado_procesarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_paso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel_Contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jbtn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jbtn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jlbl_paso.getAccessibleContext().setAccessibleName("PASO 1");
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cancelarActionPerformed
        //Inhabilita Botones
        habilitarTodosLosBotones(false);

        //limpia todos los campos
        limpiarTodosLosCampos();

        //Habilita el Arbol de seleccion
        JFramePrincipal.getArbolModulos().setEnabled(true);
        JFramePrincipal.getjPanelContenido().removeAll();
        JFramePrincipal.getjPanelContenido().repaint();
    }//GEN-LAST:event_jbtn_cancelarActionPerformed

    private void jbtn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_siguienteActionPerformed
        TipoTramite nuevoTipoTramite = (TipoTramite) this.jcb_tipoTramite.getSelectedItem();
        this.controlador.getNuevoTurno().setUnTipoTramite(nuevoTipoTramite);
        
        //Se crea el Panel Emplesa    
        PanelProcesarTurno04 unPaneProcesarTurno04 = new PanelProcesarTurno04(this.controlador);
        unPaneProcesarTurno04.setSize(950, 750);
        unPaneProcesarTurno04.setLocation(0, 0);
        unPaneProcesarTurno04.setVisible(true);
        
        //JFramePrincipal.modificarPanelContenido(unPanelProcesarTurno02);
        JFramePrincipal.getjPanelContenido().removeAll();
        JFramePrincipal.getjPanelContenido().add(unPaneProcesarTurno04);
        JFramePrincipal.getjPanelContenido().repaint();
        JFramePrincipal.getjPanelContenido().validate();
        
    }//GEN-LAST:event_jbtn_siguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel_Contenido;
    private javax.swing.JButton jbtn_cancelar;
    private javax.swing.JButton jbtn_siguiente;
    private javax.swing.JComboBox<String> jcb_tipoTramite;
    private javax.swing.JLabel jlbl_paso;
    private javax.swing.JLabel jlbl_titulo;
    private javax.swing.JProgressBar jpb_estado_procesarTurno;
    // End of variables declaration//GEN-END:variables

    @Override
    public void habilitarTodosLosCampos(boolean estado) {
        //inhabilita campos
    }

    @Override
    public void limpiarTodosLosCampos() {
    }

    @Override
    public void habilitarTodosLosBotones(boolean estado) {
        this.validador.habilitarBoton(estado, jbtn_cancelar, Color.red, Color.WHITE, null, null);
        this.validador.habilitarBoton(estado, this.jbtn_siguiente, new Color(30, 132, 73), Color.WHITE, null, null);
    }

    /**
     * Carga las Areas el el JComboBox area
     */
    public void cargarAreas() {
        DefaultComboBoxModel mdl = new DefaultComboBoxModel(this.controlador.buscarTodosLosTramitesPorArea(this.controlador.getNuevoTurno().getUnAreaB()));
        this.jcb_tipoTramite.setModel(mdl);
    }
}