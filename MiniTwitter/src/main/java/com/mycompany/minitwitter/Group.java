/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minitwitter;

/**
 *
 * @author erichuang
 */
public class Group 
{
    private String groupID;
    private String parentGroupID;
    
    Group(String inputGroupID , String inputParentGroupID)
    {
        groupID = inputGroupID;
        parentGroupID = inputParentGroupID;
    }
    
    public static void startGroupUI()
    {
        AddGroup newGroup = new AddGroup();
        newGroup.setVisible(true);
    }
}
