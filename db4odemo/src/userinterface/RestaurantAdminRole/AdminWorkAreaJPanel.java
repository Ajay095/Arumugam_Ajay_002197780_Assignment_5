

package userinterface.RestaurantAdminRole;


import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.ManageRestaurants;

/**
 *
 * @author  raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount account;
    
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer,UserAccount account, EcoSystem system) {
        initComponents();
        this.account=account;
        this.userProcessContainer = userProcessContainer;
        this.system=system;
        //this.account=account;
      
        valueLabel.setText(account.getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnManageRestaurantInfo = new javax.swing.JButton();
        brnManageMenu = new javax.swing.JButton();
        btnManageOrders = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        btnManageRestaurantInfo.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnManageRestaurantInfo.setText("Manage Restaurant");
        btnManageRestaurantInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRestaurantInfoActionPerformed(evt);
            }
        });
        add(btnManageRestaurantInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 200, -1));

        brnManageMenu.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        brnManageMenu.setText("Manage menu");
        brnManageMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnManageMenuActionPerformed(evt);
            }
        });
        add(brnManageMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 150, -1));

        btnManageOrders.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnManageOrders.setText("Manage Orders");
        btnManageOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrdersActionPerformed(evt);
            }
        });
        add(btnManageOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Restaurant :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, 30));

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageRestaurantInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRestaurantInfoActionPerformed
        // TODO add your handling code here:
        
        ManageRestaurantInfo manageInfo=new ManageRestaurantInfo(userProcessContainer,account,system);
        userProcessContainer.add("Manage Restaurents",manageInfo);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
        
    }//GEN-LAST:event_btnManageRestaurantInfoActionPerformed

    private void brnManageMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnManageMenuActionPerformed
         ManageMenu manageMenu=new ManageMenu(userProcessContainer,account,system);
        userProcessContainer.add("Manage Restaurents",manageMenu);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_brnManageMenuActionPerformed

    private void btnManageOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrdersActionPerformed
        ManageOrders manageOrder=new ManageOrders(userProcessContainer,account,system);
        userProcessContainer.add("Manage Restaurents",manageOrder);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageOrdersActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnManageMenu;
    private javax.swing.JButton btnManageOrders;
    private javax.swing.JButton btnManageRestaurantInfo;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
