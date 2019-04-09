package View;

import Controller.Main;
import Model.Attempt;
import Model.User;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.WindowConstants;

public class Frame extends javax.swing.JFrame {

    public static String currentUser;
    
    public Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        HomePnl = new javax.swing.JPanel();
        Content = new javax.swing.JPanel();
        Navigation = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        HomePnl.setBackground(new java.awt.Color(102, 102, 102));
        HomePnl.setPreferredSize(new java.awt.Dimension(801, 500));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Navigation.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        logoutBtn.setBackground(new java.awt.Color(250, 250, 250));
        logoutBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logoutBtn.setText("LOGOUT");
        logoutBtn.setFocusable(false);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NavigationLayout = new javax.swing.GroupLayout(Navigation);
        Navigation.setLayout(NavigationLayout);
        NavigationLayout.setHorizontalGroup(
            NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        NavigationLayout.setVerticalGroup(
            NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 378, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout HomePnlLayout = new javax.swing.GroupLayout(HomePnl);
        HomePnl.setLayout(HomePnlLayout);
        HomePnlLayout.setHorizontalGroup(
            HomePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePnlLayout.createSequentialGroup()
                .addComponent(Navigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomePnlLayout.setVerticalGroup(
            HomePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Navigation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(HomePnl, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(HomePnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        frameView.show(Container, "loginPnl");
        this.emptyLoginFields();
    }//GEN-LAST:event_logoutBtnActionPerformed

    public Main main;
    public Login loginPnl = new Login();
    public Register registerPnl = new Register();
    
    private AdminHome adminHomePnl = new AdminHome();
    private ManagerHome managerHomePnl = new ManagerHome();
    private StaffHome staffHomePnl = new StaffHome();
    private ClientHome clientHomePnl = new ClientHome();
    
    private CardLayout contentView = new CardLayout();
    private CardLayout frameView = new CardLayout();
    
    public void init(Main controller){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("SECURDE - SECURITY Svcs");
        this.setLocationRelativeTo(null);
        
        this.main = controller;
        loginPnl.frame = this;
        registerPnl.frame = this;
        
        adminHomePnl.init(main.sqlite);
        clientHomePnl.init(main.sqlite);
        managerHomePnl.init(main.sqlite);
        staffHomePnl.init(main.sqlite);
        
        Container.setLayout(frameView);
        Container.add(loginPnl, "loginPnl");
        Container.add(registerPnl, "registerPnl");
        Container.add(HomePnl, "homePnl");
        frameView.show(Container, "loginPnl");
        
        Content.setLayout(contentView);
        Content.add(adminHomePnl, "adminHomePnl");
        Content.add(managerHomePnl, "managerHomePnl");
        Content.add(staffHomePnl, "staffHomePnl");
        Content.add(clientHomePnl, "clientHomePnl");
        
        this.setVisible(true);
    }
    
    public void mainNav(){
        frameView.show(Container, "homePnl");
    }
    
    public void adminHome(){
        frameView.show(Container, "homePnl");
        contentView.show(Content, "adminHomePnl");
    }
    
    public void managerHome(){
        frameView.show(Container, "homePnl");
        contentView.show(Content, "managerHomePnl");
    }
    
    public void staffHome(){
        frameView.show(Container, "homePnl");
        contentView.show(Content, "staffHomePnl");
    }
    
    public void clientHome(){
        frameView.show(Container, "homePnl");
        contentView.show(Content, "clientHomePnl");
    }
    
    public void loginNav(){
        frameView.show(Container, "loginPnl");
    }
    
    public void registerNav(){
        frameView.show(Container, "registerPnl");
    }
    
    public void emptyRegisterFields(){
        registerPnl.setJLabel2Empty();
        registerPnl.setPasswordEmpty();
        registerPnl.setUsernameEmpty();
        registerPnl.setConfPassEmpty();
    }
    
    public void emptyLoginFields(){
        loginPnl.setJLabel2Empty();
        loginPnl.setJPasswordFieldTextEmpty();
        loginPnl.setJTextField1TextEmpty();
    }
    
    public void registerAction(String username, String password, String confpass){
        main.sqlite.addUser(username, main.encryptThisString(password));
    }
    
    public void updatePassword(String username, String password, String confpass){
        main.sqlite.updatePassword(username, main.encryptThisString(password));
    }
    
    public boolean checkIfUserExists(String username){
        //get list of all users to compare input with credentials
        ArrayList<User> users = main.sqlite.getUsers();
        System.out.println("hello hello hello check if user exists");
        
        //loop through all the users to compare credentials
        for(User user : users){
            //first check if username already exists
            if(user.getUsername().equals(username)){
                return true;
            }
        }
        
        //if inputted username does not match with any of the usernames in the db, then user does not exist yet
        return false;   
    }
    
    public boolean checkPassword(String password){ //check if password contains correct characters
        if(containsNumber(password) && 
           containsUpperCase(password) && 
           containsSpecial(password)&&
           password.length() >= 8){
            return true;
        }
        
        return false;
    }
    
    public boolean containsNumber(String s){
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(s);

        return m.find();
    }
    
    public boolean containsUpperCase(String s){
        Pattern p = Pattern.compile("[A-Z]");
        Matcher m = p.matcher(s);

        return m.find();
    }
    
    public boolean containsSpecial(String s){
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(s);

        return m.find();
    }
    
    //function for checking if account actually exists and if credentials are correct
    //using char[] because jPasswordFields only have the function .getPassword which returns char[]
    public boolean checkLoginCredentials(String username, String password){
        
        System.out.println("INSIDE CHECK LOGIN CREDS");
        
        //get list of all users to compare input with credentials
        ArrayList<User> users = main.sqlite.getUsers();
        ArrayList<Attempt> attempts = main.sqlite.getAttempts();
        
        //loop through all the users to compare credentials
        for(User user : users){
            //first check if username is the same
            if(user.getUsername().equals(username)){
                System.out.println("INSIDE CHECK LOGIN CREDS USERNAME THE SAME");
                //once the username is found, compare the hashed passwords
                
                if(user.getLocked() == 0) {                    
                    if(user.getPassword().equals(main.encryptThisString(password))){
                        //if password is the same, then credentials are good                        
                        for(Attempt attempt : attempts) {
                            if(attempt.getId() == user.getId()) {
                                main.sqlite.resetAttempts(user.getUsername());
                                break;
                            }
                        }                                                
                        return true;
                    } else{
                        System.out.println("INSIDE CHECK LOGIN CREDS WRONG PASSWORD");
                        //for the logging
                        String date = new Timestamp(new Date().getTime()).toString();
                        
                        main.sqlite.addLogs("NOTICE", user.getUsername(), "Attempted Login", date);
                        
                        //if username is the same but password is wrong, then user inputted the wrong password
                        for(Attempt attempt : attempts) {
                            if(attempt.getId() == user.getId()) {
                                if(attempt.getTrackedFailedAttempts() == 5) {
                                    main.sqlite.changeLockStatus(user.getUsername(), 1);
                                    System.out.println("LOCKED ACCOUNT");
                                }
                                else {
                                    System.out.println("INSIDE CHECK LOGIN CREDS ADD FAIL ATTEMPS");
                                    main.sqlite.addFailedAttempt(username);
                                }
                                break;
                            }
                        }                    
                        return false;
                    }
                }
                else {
                    // Locked!
                }
            }
        }
        
        //if inputted username does not match with any of the usernames in the db, then user does not exist
        return false;
    }
    
    public boolean isLockedOut(String username){
        //get list of all users to compare input with credentials
        ArrayList<User> users = main.sqlite.getUsers();
        System.out.println("Entered lockout function");
        //loop through all the users to compare credentials
        for(User user : users){
            System.out.println("Entered for loop");
            //first check if username already exists
            if(user.getUsername().equals(username)){
                System.out.println("Found corresponding user value in table: " + user.getUsername());
                System.out.println("Current lock status: " + user.getLocked());
                //if lock status of user is 1 (true)
                if(user.getLocked() == 1){
                    System.out.println("USER LOCK STATUS == 1");
                    
                    //for logging
                    String date = new Timestamp(new Date().getTime()).toString();
                    
                    main.sqlite.addLogs("NOTICE", user.getUsername(), "Locked Account", date);                    
                    return true;
                }
            }     
        }
        
        //if user is not locked out
        return false;        
    }
    
    public int getRole(String username){
        //get list of all users to compare input with credentials
        ArrayList<User> users = main.sqlite.getUsers();
        
        //loop through all the users to compare credentials
        for(User user : users){
            //first check if username is the same
            if(user.getUsername().equals(username)){
                //return role number
                return user.getRole();
            }
        }
        
        //if inputted username does not match with any of the usernames in the db, then user does not exist
        return 0;
    }
    
    public String getCurrentUser(){
        return currentUser;
    }
    
    public void setCurrentUser(String currentUser){
        this.currentUser = currentUser;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel Content;
    private javax.swing.JPanel HomePnl;
    private javax.swing.JPanel Navigation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutBtn;
    // End of variables declaration//GEN-END:variables
}
