package com.example.dmitryterekhov.practic.Objects;

import org.bson.types.ObjectId;

import java.util.ArrayList;

public class Client extends User {
    protected int growth;
    protected ArrayList<Weight> weights;
    protected ArrayList<Trainer> trainers;
    protected String presenseStatus;

    public Client(ObjectId _id, String _login, String _password, String _role, String _fio, Object _foto, String _contacts, int _growth, ArrayList<Weight> _weights, ArrayList<Trainer> _trainers, String _presenseStatus) {
        super(_id, _login, _password, _role, _fio, _foto, _contacts);
        this.growth = _growth;
        this.weights = _weights;
        this.trainers = _trainers;
        this.presenseStatus = _presenseStatus;
    }

    public Client(int _growth, ArrayList<Weight> _weights, ArrayList<Trainer> _trainers, String _presenseStatus) {
        this.growth = _growth;
        this.weights = _weights;
        this.trainers = _trainers;
        this.presenseStatus = _presenseStatus;
    }

    public Client() {
    }


    public Trainer GetCurrentTrainer() {
        return trainers.get(trainers.size() - 1);
    }
/*
        public static explicit operator Client(BsonDocument user)
        {
            Client result = new Client();
            result.ID = user["_id"].AsObjectId;
            result.Login = user["login"].AsString;
            result.Password = user["password"].AsString;
            result.Fio = user["fio"].AsString;
            result.Role = user["role"].AsString;
            result.Contacts = user["contacts"].AsString;
            result.Foto = null;
            result.Growth = user["growth"].AsInt32;
            result.PresenseStatus = user["status"].AsString;
            result.Trainers = new List<Trainer>();
            result.Weights = new List<Weight>();
            return result;
        }



        public static implicit operator string(Client client)
        {
            string result = JsonConvert.SerializeObject(client);
            return result;
        }


        public static implicit operator Client(string json)
        {
            Client result = new Client();
            result = JsonConvert.DeserializeObject<Client>(json);
            return result;
        }
*/
}