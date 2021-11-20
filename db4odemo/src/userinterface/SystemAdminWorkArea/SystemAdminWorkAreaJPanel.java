/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;

import Business.Organization;
import Business.Restaurant.Restaurant;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author MyPC1
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        populateTree();
    }
    
    public void populateTree(){
        DefaultTreeModel model=(DefaultTreeModel)jTree.getModel();
       // Add the code for draw your system structure shown by JTree
       DefaultMutableTreeNode Restaurant=new DefaultMutableTreeNode("Restaurants");
        DefaultMutableTreeNode Customers=new DefaultMutableTreeNode("Customers");
        DefaultMutableTreeNode DeliveryMan=new DefaultMutableTreeNode("Delivery Man");
        ArrayList<Restaurant> restList = ecosystem.getRestaurantDirectory().getRestaurantList();
        DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
        root.removeAllChildren();
        root.insert(Restaurant, 0);
        DefaultMutableTreeNode restaurantNode;
        DefaultMutableTreeNode customerNode;
        Restaurant restaurant;
        
        for(int i=0;i<restList.size();i++){
            restaurant=restList.get(i);
            restaurantNode=new DefaultMutableTreeNode(restaurant.getAdminUName());
            Restaurant.insert(restaurantNode, i);
        }
        ArrayList<Customer> custList = ecosystem.getCustomerDirectory().getCustList();
        //DefaultMutableTreeNode root1=(DefaultMutableTreeNode)model.getRoot();
        //root1.removeAllChildren();
        root.insert(Customers, 1);
        
        Customer customer;
        
        for(int i=0;i<custList.size();i++){
            customer=custList.get(i);
            customerNode=new DefaultMutableTreeNode(customer.getUserName());
            Customers.insert(customerNode, i);
        }
        
        ArrayList<DeliveryMan> deliveryManList = ecosystem.getDeliveryManDirectory().getDeliveryManList();
        root.insert(DeliveryMan, 2);
        DefaultMutableTreeNode DeliveryManNode;
        DeliveryMan deliveryMan;
        
        for(int i=0;i<deliveryManList.size();i++){
            deliveryMan=deliveryManList.get(i);
            DeliveryManNode=new DefaultMutableTreeNode(deliveryMan.getUserName());
            DeliveryMan.insert(DeliveryManNode, i);
        }



       
        model.reload();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSelectedNode = new javax.swing.JLabel();
        btnManageCustomers = new javax.swing.JButton();
        btnManageRestaurments = new javax.swing.JButton();
        btnManageDeliveryMan = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 118, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        jLabel1.setText("Selected Node:");

        lblSelectedNode.setText("<View_selected_node>");

        btnManageCustomers.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnManageCustomers.setText("Manage Customers");
        btnManageCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCustomersActionPerformed(evt);
            }
        });

        btnManageRestaurments.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnManageRestaurments.setText("Manage Restaurants");
        btnManageRestaurments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRestaurmentsActionPerformed(evt);
            }
        });

        btnManageDeliveryMan.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnManageDeliveryMan.setText("Manage Deliveryman");
        btnManageDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDeliveryManActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnManageDeliveryMan)
                .addGap(70, 70, 70))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblSelectedNode))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnManageCustomers))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnManageRestaurments, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblSelectedNode))
                .addGap(66, 66, 66)
                .addComponent(btnManageCustomers)
                .addGap(49, 49, 49)
                .addComponent(btnManageRestaurments)
                .addGap(48, 48, 48)
                .addComponent(btnManageDeliveryMan)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCustomersActionPerformed
        ManageCustomers manageEnterpriseJPanel=new ManageCustomers(userProcessContainer, ecosystem);
        userProcessContainer.add("Manage Customer",manageEnterpriseJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageCustomersActionPerformed

    private void btnManageRestaurmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRestaurmentsActionPerformed
        ManageRestaurants manageEnterpriseJPanel=new ManageRestaurants(userProcessContainer, ecosystem);
        userProcessContainer.add("Manage Restaurents",manageEnterpriseJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageRestaurmentsActionPerformed

    private void btnManageDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDeliveryManActionPerformed
        ManageDeliveryMan manageEnterpriseJPanel=new ManageDeliveryMan(userProcessContainer, ecosystem);
        userProcessContainer.add("Manage DeliveryMan",manageEnterpriseJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageDeliveryManActionPerformed

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged
        
        DefaultMutableTreeNode selectedNode= (DefaultMutableTreeNode)jTree.getLastSelectedPathComponent();
        if(selectedNode!=null){
            lblSelectedNode.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_jTreeValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageCustomers;
    private javax.swing.JButton btnManageDeliveryMan;
    private javax.swing.JButton btnManageRestaurments;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JTree jTree;
    private javax.swing.JLabel lblSelectedNode;
    // End of variables declaration//GEN-END:variables
}
