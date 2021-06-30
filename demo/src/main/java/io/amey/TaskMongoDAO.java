package io.amey;

import java.util.List;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class TaskMongoDAO {
    
    String connURI = "mongodb://localhost:27017";
    MongoCollection<Document> collection;
    
    public MongoCollection<Document> getCollection() {
        return collection;
    }

    public void connect(){        
    
        MongoClient client = MongoClients.create(connURI);
        MongoDatabase mongoDb = client.getDatabase("TestOne");
        collection = mongoDb.getCollection("task");
                
    }
    //Insert record in mongo
    public void insertTask(Task taskToAdd){
        connect();
        Document taskDoc = new Document("id", taskToAdd.getId())
                                        .append("title", taskToAdd.getTitle())
                                        .append("desc", taskToAdd.getDesc())
                                        .append("state", taskToAdd.getState());
        getCollection().insertOne(taskDoc);
    }

    //get all records in DB
    public void getAllRecords(){
        connect();
        FindIterable<Document> taskList = collection.find();
        for (Document document : taskList) {
            System.out.println(document.toJson().toString());            
        }
    }
}
