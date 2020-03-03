/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ProcesarTramiteController;
import java.awt.Color;
import model.Turno;
import view.resources.TablaTurnoModelo;
import view.resources.TablaTurnoProcesarTramiteModelListener;

/**
 *
 * @author Ariel
 */
public class PanelProcesarTramite01 extends javax.swing.JPanel implements InterfacePanel {

    private final ValidadorDeCampos validador;

    private final ProcesarTramiteController controlador;
    
    
    //variables de tabla
    private final TablaTurnoModelo tablaTurnoModelo;
    
    private Turno turnoSeleccionado;

    

    /**
     * Creates new form PanelEmpresa
     *
     */
    public PanelProcesarTramite01() {
        //JTable vacio
        this.tablaTurnoModelo = new TablaTurnoModelo();

        initComponents();
        validador = new ValidadorDeCampos();
        habilitarTodosLosBotones(true);
        this.controlador = new ProcesarTramiteController();

        habilitarTodosLosCampos(false);
        habilitarTodosLosBotones(true);

        

        this.jpb_estado_procesarTurno.setStringPainted(true);
        this.jpb_estado_procesarTurno.setString("TURNO");
        this.jpb_estado_procesarTurno.setValue(15);
        this.jpb_estado_procesarTurno.setForeground(new Color(220, 118, 51));

        this.jlbl_titulo.setBackground(Color.BLACK);
        this.jlbl_titulo.setOpaque(true);

        //Actualizar el TableModel con la lista del controlador
        this.tablaTurnoModelo.setTurnos(this.controlador.buscarTodosLosTurnosDeUnEmpleadoEnElDiaActual());

        //Refrescar el modelo en la tabla
        this.tablaTurnoModelo.fireTableDataChanged();

        //agrega escuchadores de las tablas
        this.jtb_turnos.getSelectionModel().addListSelectionListener(new TablaTurnoProcesarTramiteModelListener(this));
        
        repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelProgreso = new javax.swing.JPanel();
        jlbl_titulo = new javax.swing.JLabel();
        jpb_estado_procesarTurno = new javax.swing.JProgressBar();
        jPanel_crud = new javax.swing.JPanel();
        jScrollPaneTabla = new javax.swing.JScrollPane();
        jtb_turnos = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtf_fecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtf_hora = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtf_estadoTurno = new javax.swing.JTextField();
        jtf_tipoAtencion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtf_tipoTramite = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtf_area = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jtf_apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtf_dni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtf_tipoPersona = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        jbtn_siguiente = new javax.swing.JButton();
        jbtn_volver = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(950, 750));
        setMinimumSize(new java.awt.Dimension(950, 750));
        setPreferredSize(new java.awt.Dimension(950, 750));

        jlbl_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_titulo.setText("PROCESAR TRAMITE");

        javax.swing.GroupLayout jPanelProgresoLayout = new javax.swing.GroupLayout(jPanelProgreso);
        jPanelProgreso.setLayout(jPanelProgresoLayout);
        jPanelProgresoLayout.setHorizontalGroup(
            jPanelProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProgresoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpb_estado_procesarTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelProgresoLayout.setVerticalGroup(
            jPanelProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProgresoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jpb_estado_procesarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPaneTabla.setMaximumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla.setMinimumSize(new java.awt.Dimension(950, 750));
        jScrollPaneTabla.setPreferredSize(new java.awt.Dimension(950, 750));

        jtb_turnos.setModel(tablaTurnoModelo);
        jScrollPaneTabla.setViewportView(jtb_turnos);

        javax.swing.GroupLayout jPanel_crudLayout = new javax.swing.GroupLayout(jPanel_crud);
        jPanel_crud.setLayout(jPanel_crudLayout);
        jPanel_crudLayout.setHorizontalGroup(
            jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_crudLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_crudLayout.setVerticalGroup(
            jPanel_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_crudLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("FECHA");

        jLabel2.setText("HORA");

        jLabel11.setText("ESTADO TURNO");

        jLabel10.setText("TIPO ATENCIÓN");

        jLabel8.setText("TIPO TRAMITE");

        jtf_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_areaActionPerformed(evt);
            }
        });

        jLabel7.setText("AREA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_area, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_tipoAtencion, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(jtf_hora))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtf_tipoTramite, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(jtf_estadoTurno))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtf_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtf_estadoTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_area, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtf_tipoAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jtf_tipoTramite, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );

        jTabbedPane1.addTab("DATO TURNO", jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setText("APELLIDO");

        jLabel3.setText("DNI");

        jLabel6.setText("TIPO PERSONA");

        jLabel4.setText("NOMBRE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtf_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addComponent(jtf_nombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtf_dni, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(jtf_tipoPersona))
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jtf_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_tipoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(70, 70, 70))
        );

        jTabbedPane1.addTab("DATO PERSONA", jPanel3);

        jbtn_siguiente.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jbtn_siguiente.setText("SIGUIENTE");
        jbtn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_siguienteActionPerformed(evt);
            }
        });

        jbtn_volver.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jbtn_volver.setText("VOLVER");
        jbtn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn_siguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
                            .addComponent(jbtn_volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel_crud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1))
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(9, 9, 9))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_crud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jbtn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_volverActionPerformed
        //Inhabilita Botones
        habilitarTodosLosBotones(false);

        //limpia todos los campos
        limpiarTodosLosCampos();

        //Habilita el Arbol de seleccion
        JFramePrincipal.getArbolModulos().setEnabled(true);
        JFramePrincipal.getjPanelContenido().removeAll();
        JFramePrincipal.getjPanelContenido().repaint();
    }//GEN-LAST:event_jbtn_volverActionPerformed

    private void jbtn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_siguienteActionPerformed

        //this.controlador.crearNuevoTurno(this.controlador.getNuevoTurno());
        //Inhabilita Botones
        habilitarTodosLosBotones(false);

        //limpia todos los campos
        limpiarTodosLosCampos();

        //Habilita el Arbol de seleccion
        JFramePrincipal.getArbolModulos().setEnabled(true);
        JFramePrincipal.getjPanelContenido().removeAll();
        JFramePrincipal.getjPanelContenido().repaint();

    }//GEN-LAST:event_jbtn_siguienteActionPerformed

    private void jtf_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_areaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_areaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelProgreso;
    private javax.swing.JPanel jPanel_crud;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtn_siguiente;
    private javax.swing.JButton jbtn_volver;
    private javax.swing.JLabel jlbl_titulo;
    private javax.swing.JProgressBar jpb_estado_procesarTurno;
    private javax.swing.JTable jtb_turnos;
    private javax.swing.JTextField jtf_apellido;
    private javax.swing.JTextField jtf_area;
    private javax.swing.JTextField jtf_dni;
    private javax.swing.JTextField jtf_estadoTurno;
    private javax.swing.JTextField jtf_fecha;
    private javax.swing.JTextField jtf_hora;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JTextField jtf_tipoAtencion;
    private javax.swing.JTextField jtf_tipoPersona;
    private javax.swing.JTextField jtf_tipoTramite;
    // End of variables declaration//GEN-END:variables

    @Override
    public void habilitarTodosLosCampos(boolean estado) {
        //inhabilita campos
        this.validador.habilitarCampo(estado, this.jtf_fecha);
        this.validador.habilitarCampo(estado, this.jtf_hora);
        this.validador.habilitarCampo(estado, this.jtf_estadoTurno);

        this.validador.habilitarCampo(estado, this.jtf_nombre);
        this.validador.habilitarCampo(estado, this.jtf_apellido);
        this.validador.habilitarCampo(estado, this.jtf_dni);
        this.validador.habilitarCampo(estado, this.jtf_tipoPersona);

        this.validador.habilitarCampo(estado, this.jtf_area);
        this.validador.habilitarCampo(estado, this.jtf_tipoTramite);
        this.validador.habilitarCampo(estado, this.jtf_tipoAtencion);

    }

    @Override
    public void limpiarTodosLosCampos() {

    }

    @Override
    public void habilitarTodosLosBotones(boolean estado) {
        this.validador.habilitarBoton(estado, this.jbtn_siguiente, new Color(30, 132, 73), Color.WHITE, null, null);
        this.validador.habilitarBoton(estado, this.jbtn_volver, Color.RED, Color.WHITE, null, null);
    }

    //--------------------------------------------------------------------------
    //--------------------------Metodos Adicionales-----------------------------
    //--------------------------------------------------------------------------
    
    /**
     * Selecciona una fila de la tabla, devolviendo un objeto Persona
     */
    public void seleccionarTurno() {
        //obtiene el indice de la fila seleccionada en la tabla de personas
        int filaSeleccionada = this.jtb_turnos.getSelectedRow();
        // si la fila esta seleccionada, seteamos la persona auxiliar, llamando al modelo de tabla
        if (filaSeleccionada >= 0) {
            this.turnoSeleccionado = this.tablaTurnoModelo.obtenerTurnoEn(filaSeleccionada);
            
            this.jtf_fecha.setText(this.turnoSeleccionado.getFecha().toString());
            this.jtf_hora.setText(this.turnoSeleccionado.getUnaHoraTurno().getHoraTurno());
            this.jtf_estadoTurno.setText(this.turnoSeleccionado.getUnEstadoTurno().getNombre());
            this.jtf_area.setText(this.turnoSeleccionado.getUnAreaB().getNombre());
            this.jtf_tipoAtencion.setText(this.turnoSeleccionado.getUnTipoAtencion().getNombre());
            this.jtf_tipoTramite.setText(this.turnoSeleccionado.getUnTipoTramite().getNombre());
            
            this.jtf_nombre.setText(this.turnoSeleccionado.getUnaPersona().getNombre());
            this.jtf_apellido.setText(this.turnoSeleccionado.getUnaPersona().getApellido());
            this.jtf_dni.setText(this.turnoSeleccionado.getUnaPersona().getDni());
            this.jtf_tipoPersona.setText(this.turnoSeleccionado.getUnaPersona().getUnTipoPersona().getDescripcion());
            /*
            
            */
        } else {
            this.validador.habilitarBoton(false, this.jbtn_siguiente, new Color(30, 132, 73), Color.WHITE, null, null);
            this.validador.habilitarBoton(true, this.jbtn_volver, new Color(30, 132, 73), Color.WHITE, null, null);
        }
    }
   
}
