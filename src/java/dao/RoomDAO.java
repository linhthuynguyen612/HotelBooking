/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import static dao.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import model.Room;

/**
 *
 * @author huuduc
 */
public class RoomDAO extends DAO{

    public RoomDAO() {
        super();
    }
    
    public ArrayList<Room> getAllRoom(){
        String sql = "Select * from rooms";
        try{
            ArrayList<Room> arr = new ArrayList();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                arr.add(new Room(rs.getInt("roomId"), rs.getString("roomName"), 
                rs.getString("roomType"), rs.getFloat("price"), 
                        rs.getFloat("sale")));
            }
            return arr;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

}
