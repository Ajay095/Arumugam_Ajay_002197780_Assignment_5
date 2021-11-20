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
            DefaultTableModel model = (DefaultTableModel) menuTable.getModel();
        
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
        DefaultTableModel model = (DefaultTableModel) cartTable.getModel();
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

        cardBtn = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        orderBtn1 = new javax.swing.JButton();
        RemoveBtn = new javax.swing.JButton();
        addressTxt = new javax.swing.JTextField();
        enterpriseLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cardBtn.setText("Add to Cart");
        cardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardBtnActionPerformed(evt);
            }
        });
        add(cardBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        backJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Delivery Address");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 160, 30));

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(cartTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, 100));

        menuTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(menuTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, 100));

        orderBtn1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        orderBtn1.setText("Order");
        orderBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtn1ActionPerformed(evt);
            }
        });
        add(orderBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, -1, -1));

        RemoveBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        RemoveBtn.setText("Remove From Cart");
        RemoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveBtnActionPerformed(evt);
            }
        });
        add(RemoveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, -1, -1));
        add(addressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 170, -1));

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel1.setText("Order Here:");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void cardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardBtnActionPerformed
        
        
        int selectedRow = menuTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Dishes item=(Dishes)menuTable.getValueAt(selectedRow, 0);
            
            populateCart(item);
          
        }
        
    }//GEN-LAST:event_cardBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerAreaJPanel dwjp = (CustomerAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void orderBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtn1ActionPerformed
        // TODO add your handling code here:
        String address=addressTxt.getText();
        
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
        
    }//GEN-LAST:event_orderBtn1ActionPerformed

    private void RemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveBtnActionPerformed
        // TODO add your handling code here:
         int selectedRow = cartTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Dishes item=(Dishes)cartTable.getValueAt(selectedRow, 0);
            
            items.remove(item);
            sum=sum-Integer.parseInt(item.getPrice());
            DefaultTableModel model = (DefaultTableModel) cartTable.getModel();
        model.setRowCount(0);
            Object[] row = new Object[3];
                for(Dishes dish:items){
                     row[0] = dish;
                     row[1] = dish.getDescription();
                     row[2] = dish.getPrice();
                     
                     model.addRow(row);
                }  
          
        }
        
    }//GEN-LAST:event_RemoveBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RemoveBtn;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton cardBtn;
    private javax.swing.JTable cartTable;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable menuTable;
    private javax.swing.JButton orderBtn1;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}