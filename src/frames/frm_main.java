/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

//la chica parada esa mirandote ta biennn

import Clases.ClienteEmpresa;
import Clases.ClienteParticular;
import Clases.DestinatarioEmpresa;
import Clases.DestinatarioParticular;
import Clases.TipoArea;
import Clases.Auto;
import Clases.Camion;
import Clases.Empleado;
import Clases.Tipo_Producto;
import Clases.Moto;
import Clases.Producto;
import frames.CambiaPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.LinkedList;
import panelesMenu.pnl_activo;
import panelesMenu.pnl_almacen;
import panelesMenu.pnl_cliente;
import panelesMenu.pnl_nuevo;
import panelesMenu.pnl_rrhh;

/**
 *
 * @author Max
 */
public class frm_main extends javax.swing.JFrame {
    public static LinkedList<ClienteEmpresa> clientes_empresa = new LinkedList<>();
    public static LinkedList<ClienteParticular> clientes_particular = new LinkedList<>();
    public static LinkedList<DestinatarioEmpresa> destinatario_empresa = new LinkedList<>();
    public static LinkedList<DestinatarioParticular> destinatario_particular = new LinkedList<>();
    public static LinkedList<TipoArea> tipo_areas = new LinkedList<>();
    public static LinkedList<Tipo_Producto> tipo_productos = new LinkedList<>();
    public static LinkedList<Auto> autos = new LinkedList<>();
    public static LinkedList<Camion> camiones = new LinkedList<>();
    public static LinkedList<Empleado> empleados = new LinkedList<>();
    public static LinkedList<Moto> motos = new LinkedList<>();
    public static LinkedList<Producto> productos = new LinkedList<>();
    /**
     * Creates new form frm_Main
     */
    public frm_main() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_rrhh = new javax.swing.JLabel();
        lbl_nuevo = new javax.swing.JLabel();
        lbl_activo = new javax.swing.JLabel();
        lbl_proveedor = new javax.swing.JLabel();
        lbl_almacen = new javax.swing.JLabel();
        lbl_compra = new javax.swing.JLabel();
        lbl_venta = new javax.swing.JLabel();
        lbl_utilitarios = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        lbl_cerrar = new javax.swing.JLabel();
        lbl_minimizar = new javax.swing.JLabel();
        pnl_main = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        lbl_rrhh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_rrhh.setForeground(new java.awt.Color(153, 153, 153));
        lbl_rrhh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_rrhh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/redes.png"))); // NOI18N
        lbl_rrhh.setText(" RRHH");
        lbl_rrhh.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl_rrhhMouseMoved(evt);
            }
        });
        lbl_rrhh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_rrhhMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_rrhhMouseExited(evt);
            }
        });

        lbl_nuevo.setBackground(new java.awt.Color(204, 204, 204));
        lbl_nuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_nuevo.setForeground(new java.awt.Color(153, 153, 153));
        lbl_nuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casa.png"))); // NOI18N
        lbl_nuevo.setText("NUEVO");
        lbl_nuevo.setOpaque(true);
        lbl_nuevo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl_nuevoMouseMoved(evt);
            }
        });
        lbl_nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_nuevoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_nuevoMouseExited(evt);
            }
        });

        lbl_activo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_activo.setForeground(new java.awt.Color(153, 153, 153));
        lbl_activo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_activo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/camion-de-reparto.png"))); // NOI18N
        lbl_activo.setText(" ACTIVO");
        lbl_activo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl_activoMouseMoved(evt);
            }
        });
        lbl_activo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_activoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_activoMouseExited(evt);
            }
        });

        lbl_proveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_proveedor.setForeground(new java.awt.Color(153, 153, 153));
        lbl_proveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empresa.png"))); // NOI18N
        lbl_proveedor.setText("CLIENTE");
        lbl_proveedor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl_proveedorMouseMoved(evt);
            }
        });
        lbl_proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_proveedorMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_proveedorMousePressed(evt);
            }
        });

        lbl_almacen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_almacen.setForeground(new java.awt.Color(153, 153, 153));
        lbl_almacen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_almacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/almacen.png"))); // NOI18N
        lbl_almacen.setText("ALMACEN");
        lbl_almacen.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl_almacenMouseMoved(evt);
            }
        });
        lbl_almacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_almacenMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_almacenMouseExited(evt);
            }
        });

        lbl_compra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_compra.setForeground(new java.awt.Color(153, 153, 153));
        lbl_compra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_compra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/compras.png"))); // NOI18N
        lbl_compra.setText("COMPRA");
        lbl_compra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl_compraMouseMoved(evt);
            }
        });
        lbl_compra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_compraMouseExited(evt);
            }
        });

        lbl_venta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_venta.setForeground(new java.awt.Color(153, 153, 153));
        lbl_venta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas.png"))); // NOI18N
        lbl_venta.setText("VENTA");
        lbl_venta.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl_ventaMouseMoved(evt);
            }
        });
        lbl_venta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_ventaMouseExited(evt);
            }
        });

        lbl_utilitarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_utilitarios.setForeground(new java.awt.Color(153, 153, 153));
        lbl_utilitarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_utilitarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/herramienta.png"))); // NOI18N
        lbl_utilitarios.setText("UTILITARIOS");
        lbl_utilitarios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl_utilitariosMouseMoved(evt);
            }
        });
        lbl_utilitarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_utilitariosMouseExited(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbl_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_rrhh, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_almacen, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_utilitarios, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_rrhh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_activo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(lbl_proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
            .addComponent(lbl_almacen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_compra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_venta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_utilitarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(jSeparator4)
            .addComponent(jSeparator5)
            .addComponent(jSeparator6)
            .addComponent(jSeparator7)
        );

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        lbl_cerrar.setBackground(new java.awt.Color(0, 153, 153));
        lbl_cerrar.setForeground(new java.awt.Color(0, 153, 153));
        lbl_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn-cerrar.png"))); // NOI18N
        lbl_cerrar.setOpaque(true);
        lbl_cerrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl_cerrarMouseMoved(evt);
            }
        });
        lbl_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_cerrarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_cerrarMouseExited(evt);
            }
        });

        lbl_minimizar.setBackground(new java.awt.Color(0, 153, 153));
        lbl_minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn-minimizar.png"))); // NOI18N
        lbl_minimizar.setOpaque(true);
        lbl_minimizar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl_minimizarMouseMoved(evt);
            }
        });
        lbl_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_minimizarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_minimizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tux.png"))); // NOI18N

        javax.swing.GroupLayout pnl_mainLayout = new javax.swing.GroupLayout(pnl_main);
        pnl_main.setLayout(pnl_mainLayout);
        pnl_mainLayout.setHorizontalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_mainLayout.setVerticalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_mainLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnl_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_cerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cerrarMouseMoved
        // TODO add your handling code here:
        lbl_cerrar.setBackground(new Color(255, 0, 0));
    }//GEN-LAST:event_lbl_cerrarMouseMoved

    private void lbl_cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cerrarMouseExited
        // TODO add your handling code here:
        lbl_cerrar.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_lbl_cerrarMouseExited

    private void lbl_minimizarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_minimizarMouseMoved
        // TODO add your handling code here:
        lbl_minimizar.setBackground(new Color(0, 0, 255));
    }//GEN-LAST:event_lbl_minimizarMouseMoved

    private void lbl_minimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_minimizarMouseExited
        // TODO add your handling code here:
        lbl_minimizar.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_lbl_minimizarMouseExited

    private void lbl_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lbl_cerrarMouseClicked

    private void lbl_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_minimizarMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(1);
    }//GEN-LAST:event_lbl_minimizarMouseClicked

    private void lbl_nuevoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_nuevoMouseMoved
        // TODO add your handling code here:
        lbl_nuevo.setForeground(new Color(0, 153, 153));
        
        
        
        
        
        //JOptionPane.showMessageDialog(null, "Hola");
        
        
    }//GEN-LAST:event_lbl_nuevoMouseMoved

    private void lbl_rrhhMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_rrhhMouseMoved
        // TODO add your handling code here:
        lbl_rrhh.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_lbl_rrhhMouseMoved

    private void lbl_nuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_nuevoMouseExited
        // TODO add your handling code here:
        lbl_nuevo.setForeground(new Color(153, 153, 153));
        
        
    }//GEN-LAST:event_lbl_nuevoMouseExited

    private void lbl_rrhhMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_rrhhMouseExited
        // TODO add your handling code here:
        lbl_rrhh.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_lbl_rrhhMouseExited

    private void lbl_activoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_activoMouseMoved
        // TODO add your handling code here:
        lbl_activo.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_lbl_activoMouseMoved

    private void lbl_proveedorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_proveedorMouseMoved
        // TODO add your handling code here:
        lbl_proveedor.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_lbl_proveedorMouseMoved

    private void lbl_almacenMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_almacenMouseMoved
        // TODO add your handling code here:
        lbl_almacen.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_lbl_almacenMouseMoved

    private void lbl_compraMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_compraMouseMoved
        // TODO add your handling code here:
        lbl_compra.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_lbl_compraMouseMoved

    private void lbl_ventaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ventaMouseMoved
        // TODO add your handling code here:
        lbl_venta.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_lbl_ventaMouseMoved

    private void lbl_utilitariosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_utilitariosMouseMoved
        // TODO add your handling code here:
        lbl_utilitarios.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_lbl_utilitariosMouseMoved

    private void lbl_activoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_activoMouseExited
        // TODO add your handling code here:
        lbl_activo.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_lbl_activoMouseExited

    private void lbl_proveedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_proveedorMouseExited
        // TODO add your handling code here:
        lbl_proveedor.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_lbl_proveedorMouseExited

    private void lbl_almacenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_almacenMouseExited
        // TODO add your handling code here:
        lbl_almacen.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_lbl_almacenMouseExited

    private void lbl_compraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_compraMouseExited
        // TODO add your handling code here:
        lbl_compra.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_lbl_compraMouseExited

    private void lbl_ventaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ventaMouseExited
        // TODO add your handling code here:
        lbl_venta.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_lbl_ventaMouseExited

    private void lbl_utilitariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_utilitariosMouseExited
        // TODO add your handling code here:
        lbl_utilitarios.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_lbl_utilitariosMouseExited

    
 
    private void lbl_nuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_nuevoMouseClicked
        // TODO add your handling code here:
        pnl_nuevo p = new pnl_nuevo();
        p.setSize(980,394);
        p.setLocation(0,0);
        
        /*pnl_main.removeAll();
        pnl_main.add(p,BorderLayout.CENTER);
        pnl_main.revalidate();
        pnl_main.repaint();*/
        CambiaPanel x = new CambiaPanel(this.pnl_main, p);
        

        
    }//GEN-LAST:event_lbl_nuevoMouseClicked

    private void lbl_rrhhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_rrhhMouseClicked
        // TODO add your handling code here:
        pnl_rrhh p = new pnl_rrhh();
        p.setSize(980,394);
        p.setLocation(0,0);
        CambiaPanel x = new CambiaPanel(this.pnl_main, p);
    }//GEN-LAST:event_lbl_rrhhMouseClicked

    private void lbl_activoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_activoMouseClicked
        // TODO add your handling code here:
        pnl_activo p = new pnl_activo();
        p.setSize(980,394);
        p.setLocation(0,0);
        CambiaPanel x = new CambiaPanel(this.pnl_main, p);
    }//GEN-LAST:event_lbl_activoMouseClicked

    private void lbl_almacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_almacenMouseClicked
        // TODO add your handling code here:
        pnl_almacen p = new pnl_almacen();
        p.setSize(980,394);
        p.setLocation(0,0);
        CambiaPanel x = new CambiaPanel(this.pnl_main, p);
    }//GEN-LAST:event_lbl_almacenMouseClicked

    private void lbl_proveedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_proveedorMousePressed
        // TODO add your handling code here:
        pnl_cliente p = new pnl_cliente();
        p.setSize(980,394);
        p.setLocation(0,0);
        CambiaPanel x = new CambiaPanel(this.pnl_main, p);
        
    }//GEN-LAST:event_lbl_proveedorMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_main().setVisible(true);
                
                
            }
        });
    
         
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lbl_activo;
    private javax.swing.JLabel lbl_almacen;
    private javax.swing.JLabel lbl_cerrar;
    private javax.swing.JLabel lbl_compra;
    private javax.swing.JLabel lbl_minimizar;
    private javax.swing.JLabel lbl_nuevo;
    private javax.swing.JLabel lbl_proveedor;
    private javax.swing.JLabel lbl_rrhh;
    private javax.swing.JLabel lbl_utilitarios;
    private javax.swing.JLabel lbl_venta;
    private javax.swing.JPanel pnl_main;
    // End of variables declaration//GEN-END:variables
}
