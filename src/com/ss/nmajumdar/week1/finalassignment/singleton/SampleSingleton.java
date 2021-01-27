package com.ss.nmajumdar.week1.finalassignment.singleton;

import java.math.BigDecimal;
import java.sql.*;

/**
 * @author Neil Majumdar
 */
public class SampleSingleton
{
    private static Connection conn = null;

    volatile private static SampleSingleton instance = null;

    private SampleSingleton()
    {

    }

    public static SampleSingleton getInstance()
    {
        if(instance != null) {
            synchronized (instance) {
                if (instance == null)
                    instance = new SampleSingleton();
            }
        }
        else
            instance = new SampleSingleton();
            return instance;
    }

    public static void databaseQuery(BigDecimal input)
    {
        try {
            conn = DriverManager.getConnection("url of database");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select id from table");
            int x = 0;
            BigDecimal result = new BigDecimal(x);
            while(rs.next())
                result =  new BigDecimal(rs.getInt(1)).multiply(input);
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
