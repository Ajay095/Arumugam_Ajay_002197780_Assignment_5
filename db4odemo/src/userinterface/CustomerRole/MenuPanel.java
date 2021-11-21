/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Organization;
import Business.Restaurant.Dishes;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class MenuPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    int sum=0;
    private UserAccount userAccount;
    Restaurant restro;
    EcoSystem system;
    ArrayList<Dishes> items=new ArrayList<Dishes>();
    /**
     * Creates new form RequestLabTestJPanel
     */
    public MenuPanel(JPanel userProcessContainer, UserAccount account,EcoSystem system,Restaurant restro) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.restro=restro;
       this.system=system;
        this.userAccount = account;
        populateTable();
        valueLabel.setText(restro.getName());
       
    }
     public void populateTable(){
            DefaultTableModel model = (DefaultTableModel) tblAddCart.getModel();
        
            model.setRowCount(0);
                Object[] row = new Object[3];
                for(Dishes dish:restro.getMenu()){
                     row[0] = dish;
                     row[1] = dish.getDescription();
                     row[2] = dish.getPrice();
                     model.addRow(row);
                }  
    }
     
     public void populateCart(Dishes item){
        DefaultTableModel model = (DefaultTableModel) tblRemoveCart.getModel();
        model.setRowCount(0);
        
         items.add(item);
         Object[] row = new Object[3];
                for(Dishes dish:items){
                     row[0] = dish;
                     row[1] = dish.getDescription();
                     row[2] = dish.getPrice();
                     sum=sum+Integer.parseInt(dish.getPrice());
                     model.addRow(row);
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

        btnAddCart = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRemoveCart = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAddCart = new javax.swing.JTable();
        btnOrder = new javax.swing.JButton();
        btnRemoveCart = new javax.swing.JButton();
        txtAddress = new javax.swing.JTextField();
        enterpriseLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddCart.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAddCart.setText("Add to Cart");
        btnAddCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCartActionPerformed(evt);
            }
        });
        add(btnAddCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Delivery Address");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 160, 30));

        tblRemoveCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Dish Name", "Description", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRemoveCart);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, 100));

        tblAddCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Dish Name", "Description", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAddCart);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, 100));

        btnOrder.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, -1, -1));

        btnRemoveCart.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnRemoveCart.setText("Remove From Cart");
        btnRemoveCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveCartActionPerformed(evt);
            }
        });
        add(btnRemoveCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, -1, -1));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 170, -1));

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel1.setText("Order Here:");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCartActionPerformed
        
        
        int selectedRow = tblAddCart.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Dishes item=(Dishes)tblAddCart.getValueAt(selectedRow, 0);
            
            populateCart(item);
          
        }
        
    }//GEN-LAST:event_btnAddCartActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerAreaJPanel dwjp = (CustomerAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        String address=txtAddress.getText();
        
        try {
             if(address==null || address.isEmpty()){
                throw new NullPointerException("Address field is Empty");
                
                
            }else if(address.length()<5){
                throw new Exception("Please enter valid address ");
                
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Address is Empty");
           
            return;
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, " Address is invalid");
       
            return;
        }
        
        
        restro.addOrder(restro.getName(), userAccount.getUsername(), null, items, String.valueOf(sum) , address);
        for(Customer cust:system.getCustomerDirectory().getCustList()){
            if(userAccount.getUsername().equals(cust.getUserName())){
                cust.addOrder(restro.getName(), userAccount.getUsername(), null, items, String.valueOf(sum) , address);
            }
        }
        
        
        JOptionPane.showMessageDialog(null,"Your Order is placed","Thank You",JOptionPane.WARNING_MESSAGE);
        sum=0;
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerAreaJPanel dwjp = (CustomerAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnRemoveCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveCartActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblRemoveCart.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Dishes item=(Dishes)tblRemoveCart.getValueAt(selectedRow, 0);
            
            items.remove(item);
            sum=sum-Integer.parseInt(item.getPrice());
            DefaultTableModel model = (DefaultTableModel) tblRemoveCart.getModel();
        model.setRowCount(0);
            Object[] row = new Object[3];
                for(Dishes dish:items){
                     row[0] = dish;
                     row[1] = dish.getDescription();
                     row[2] = dish.getPrice();
                     
                     model.addRow(row);
                }  
          
        }
        
    }//GEN-LAST:event_btnRemoveCartActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnRemoveCart;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAddCart;
    private javax.swing.JTable tblRemoveCart;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
