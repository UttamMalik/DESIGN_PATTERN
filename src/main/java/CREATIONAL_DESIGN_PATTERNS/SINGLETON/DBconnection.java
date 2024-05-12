package CREATIONAL_DESIGN_PATTERNS.SINGLETON;

import java.security.PrivateKey;

public class DBconnection {
    private static DBconnection singleObject = null;
    private int val;
    private DBconnection(int val){
        this.val = val;
    }
    public int getVal(){
        return val;
    }
    public static DBconnection getObject(int val){
        if(singleObject == null)
        {
            synchronized (DBconnection.class){
                if(singleObject == null)
                {
                    singleObject = new DBconnection(val);
                }
            }
        }
        return singleObject;
    }
}
