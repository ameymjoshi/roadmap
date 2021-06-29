package io.amey;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;

import io.amey.Task.State;

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

    public void insertTask(Task taskToAdd){
        connect();
        Document taskDoc = new Document("id", taskToAdd.getId())
                                        .append("title", taskToAdd.getTitle())
                                        .append("desc", taskToAdd.getDesc())
                                        .append("state", taskToAdd.getState());
        getCollection().insertOne(taskDoc);
    }


}
