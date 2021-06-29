package io.amey;

import com.mongodb.DB;
import com.mongodb.DBCollection;

public interface DBConnect {
    
    public void connect(String db, String coll);
    //public DB getDatabase(String db);
    //public DBCollection getCollection(String collection);

}
