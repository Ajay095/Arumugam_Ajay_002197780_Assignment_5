/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Order.Order;
import Business.Restaurant.Dishes;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.CustomerRole.MenuPanel;

/**
 *
 * @author ajay09
 */
public class ManageOrders extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrders
     */
    EcoSystem system;
    JPanel userProcessContainer;
    UserAccount account;
    public ManageOrders(JPanel userProcessContainer,UserAccount account, EcoSystem system) {
        initComponents();
        this.account=account;
        this.system=system;
        this.userProcessContainer=userProcessContainer;
        populateTable();
    }
    
     private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblManageOrders.getModel();
        
        model.setRowCount(0);
        
       
        for (Restaurant restro:system.getRestaurantDirectory().getRestaurantList()) {
           
            if (restro.getAdminUName().equals(account.getUsername())) {
                //System.out.println(restro.getOrderList());
               for(Order menu:restro.getOrderList()){
                Object[] row = new Object[5];
                row[0] = menu;
                row[1] = menu.getCustomerName();
                row[2] = menu.getDeliveryAddress();
                row[3] = menu.getCost();
                row[4] = menu.getStatus();
                model.addRow(row);
               }
                
            }
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageOrders = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnReadyToDeliver = new javax.swing.JButton();
        btnAssignDeliveryMan = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblManageOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Customer Name", "Delivery Address", "Amount", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblManageOrders);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 580, 87));

        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnReadyToDeliver.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnReadyToDeliver.setText("Ready to Deliver");
        btnReadyToDeliver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadyToDeliverActionPerformed(evt);
            }
        });
        add(btnReadyToDeliver, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        btnAssignDeliveryMan.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAssignDeliveryMan.setText("Assign to Delivery Man ");
        btnAssignDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDeliveryManActionPerformed(evt);
            }
        });
        add(btnAssignDeliveryMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        btnRefresh.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Manage Orders");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnReadyToDeliverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadyToDeliverActionPerformed
        int selectedRow = tblManageOrders.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Order order  = (Order)tblManageOrders.getValueAt(selectedRow, 0);  
            if(order.getStatus().equals("Ready to Deliver")){
                JOptionPane.showMessageDialog(null,"Already Ready ","Warning",JOptionPane.WARNING_MESSAGE);
            }else{
                OrderDetails viewOrder=new OrderDetails(userProcessContainer,account,order,system);
                userProcessContainer.add("View Order",viewOrder);
                CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
    }//GEN-LAST:event_btnReadyToDeliverActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAssignDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDeliveryManActionPerformed
        int selectedRow = tblManageOrders.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Order order  = (Order)tblManageOrders.getValueAt(selectedRow, 0);
            if(order.getStatus().equals("Assign to Deliveryman")){
                JOptionPane.showMessageDialog(null,"Already Assigned Order","Warning",JOptionPane.WARNING_MESSAGE);
            }else{
                AssignDeliveryMan viewOrder=new AssignDeliveryMan(userProcessContainer,account,order,system);
                userProcessContainer.add("View Order",viewOrder);
                CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
    }//GEN-LAST:event_btnAssignDeliveryManActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignDeliveryMan;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReadyToDeliver;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblManageOrders;
    // End of variables declaration//GEN-END:variables
}
