package com.example.dmitryterekhov.practic.Objects;

import org.bson.types.ObjectId;

/**
 * Created by Dmitry Terekhov on 04.10.2016.
 */

public class User {
    protected ObjectId id;
    protected String login;
    protected String password;
    protected String role;
    protected String fio;
    protected Object foto;
    protected String contacts;

    public User(ObjectId _id, String _login, String _password, String _role, String _fio, Object _foto, String _contacts) {
        this.id = _id;
        this.login = _login;
        this.password = _password;
        this.role = _role;
        this.fio = _fio;
        this.foto = _foto;
        this.contacts = _contacts;
    }

    public User() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Object getFoto() {
        return foto;
    }

    public void setFoto(Object foto) {
        this.foto = foto;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }
    /*
    public static explicit operator User(BsonDocument user)
    {
        User result = new User();
        result.ID = user["_id"].AsObjectId;
        result.Login = user["login"].AsString;
        result.Password = user["password"].AsString;
        result.Fio = user["fio"].AsString;
        result.Role = user["role"].AsString;
        result.Contacts = user["contacts"].AsString;
        result.Foto = null;
        return result;
    }


    public static implicit operator string(User user)
    {
        string result = JsonConvert.SerializeObject(user);
        return result;
    }


    public static implicit operator User(string json)
    {
        User result = new User();
        result = JsonConvert.DeserializeObject<User>(json);
        return result;
    }*/
}
