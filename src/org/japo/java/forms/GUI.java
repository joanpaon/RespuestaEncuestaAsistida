/*
 * Copyright 2019 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.forms;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import org.japo.java.libraries.UtilesSwing;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public final class GUI extends JFrame {

    // Referencias
    private final Properties prp;

    // Componentes
    private JPanel pnlPpal;

    // Fuentes
    private Font fntControl;
    private Font fntBorder;

    // Tamaño Imagen Salida
    private int ancImgOut;
    private int altImgOut;

    // Constructor
    public GUI(Properties prp) {
        // Conectar Referencia
        this.prp = prp;

        // Inicialización Anterior
        initBefore();

        // Creación Interfaz
        initComponents();

        // Inicializacion Posterior
        initAfter();
    }

    // Construcción - GUI
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.ButtonGroup();
        pnlPregunta = new javax.swing.JPanel();
        lblPregunta = new javax.swing.JLabel();
        pnlOpciones = new javax.swing.JPanel();
        rbtYes = new javax.swing.JRadioButton();
        rbtNot = new javax.swing.JRadioButton();
        rbtMay = new javax.swing.JRadioButton();
        pnlRespuesta = new javax.swing.JPanel();
        lblRespuesta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Respuesta Encuesta Asistida");

        pnlPregunta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pregunta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14))); // NOI18N
        pnlPregunta.setLayout(new java.awt.GridBagLayout());

        lblPregunta.setText("¿Cree Ud. que el año que viene será exitoso?");
        pnlPregunta.add(lblPregunta, new java.awt.GridBagConstraints());

        pnlOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14))); // NOI18N

        bg.add(rbtYes);
        rbtYes.setText("Afirmativo");
        rbtYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtYesActionPerformed(evt);
            }
        });

        bg.add(rbtNot);
        rbtNot.setText("Negativo");
        rbtNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNotActionPerformed(evt);
            }
        });

        bg.add(rbtMay);
        rbtMay.setSelected(true);
        rbtMay.setText("N/S - N/C");
        rbtMay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOpcionesLayout = new javax.swing.GroupLayout(pnlOpciones);
        pnlOpciones.setLayout(pnlOpcionesLayout);
        pnlOpcionesLayout.setHorizontalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtYes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbtNot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbtMay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlOpcionesLayout.setVerticalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtYes)
                .addGap(18, 18, 18)
                .addComponent(rbtNot)
                .addGap(18, 18, 18)
                .addComponent(rbtMay)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlRespuesta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Imagen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14))); // NOI18N
        pnlRespuesta.setLayout(new java.awt.GridBagLayout());

        lblRespuesta.setBackground(new java.awt.Color(255, 255, 204));
        lblRespuesta.setOpaque(true);
        lblRespuesta.setPreferredSize(new java.awt.Dimension(100, 100));
        pnlRespuesta.add(lblRespuesta, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {pnlOpciones, pnlRespuesta});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbtYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtYesActionPerformed
        procesarEncuesta(evt);
    }//GEN-LAST:event_rbtYesActionPerformed

    private void rbtNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNotActionPerformed
        procesarEncuesta(evt);
    }//GEN-LAST:event_rbtNotActionPerformed

    private void rbtMayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtMayActionPerformed
        procesarEncuesta(evt);
    }//GEN-LAST:event_rbtMayActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblRespuesta;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JPanel pnlPregunta;
    private javax.swing.JPanel pnlRespuesta;
    private javax.swing.JRadioButton rbtMay;
    private javax.swing.JRadioButton rbtNot;
    private javax.swing.JRadioButton rbtYes;
    // End of variables declaration//GEN-END:variables
    //
    // Inicialización Anterior    
    private void initBefore() {
        // Establecer LnF
        UtilesSwing.establecerLnFProfile(prp.getProperty("look_and_feel_profile"));

        // Fuentes
        fntControl = UtilesSwing.generarFuenteRecurso(prp.getProperty("font_control_resource"));
        fntBorder = UtilesSwing.generarFuenteRecurso(prp.getProperty("font_border_resource"));

        // Panel Principal
        pnlPpal = new JPanel();

        // Ventana Principal
        setContentPane(pnlPpal);
    }

    // Inicialización Posterior
    private void initAfter() {
        // Establecer Favicon
        UtilesSwing.establecerFavicon(this, prp.getProperty("img_favicon_resource"));

        // Tipografías
        lblPregunta.setFont(fntControl.deriveFont(Font.PLAIN, 20f));
        rbtYes.setFont(fntControl.deriveFont(Font.PLAIN, 20f));
        rbtNot.setFont(fntControl.deriveFont(Font.PLAIN, 20f));
        rbtMay.setFont(fntControl.deriveFont(Font.PLAIN, 20f));
        ((TitledBorder) pnlPregunta.getBorder()).setTitleFont(fntBorder.deriveFont(Font.BOLD, 18f));
        ((TitledBorder) pnlOpciones.getBorder()).setTitleFont(fntBorder.deriveFont(Font.BOLD, 18f));
        ((TitledBorder) pnlRespuesta.getBorder()).setTitleFont(fntBorder.deriveFont(Font.BOLD, 18f));

        // Ventana Principal
        setTitle(prp.getProperty("form_title"));
        pack();
        setLocationRelativeTo(null);
    }

    // Visualizar respuesta de Selección
    private void procesarEncuesta(ActionEvent ae) {
        // Recurso Imagen
        String recurso;

        // Selección Recurso Imagen
        if (ae.getSource().equals(rbtYes)) {
            recurso = prp.getProperty("img_yes_resource");
        } else if (ae.getSource().equals(rbtNot)) {
            recurso = prp.getProperty("img_not_resource");
        } else {
            recurso = prp.getProperty("img_may_resource");
        }

        // Image ( Original ) >> Image ( Reescalada )
        Image imgAct = UtilesSwing.importarImagenRecurso(recurso, ancImgOut, altImgOut);

        // Image >> JLabel
        lblRespuesta.setIcon(new ImageIcon(imgAct));
    }
}
