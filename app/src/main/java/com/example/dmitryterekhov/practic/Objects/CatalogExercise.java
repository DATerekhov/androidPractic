package com.example.dmitryterekhov.practic.Objects;

import org.bson.types.ObjectId;

import java.util.List;

public class CatalogExercise {
    protected ObjectId id;
    protected String name;
    protected String type;
    protected String equipment;
    protected String video;
    protected String description;
    protected Double calorificValue;
    protected List<ExerciseParameter> parameters;

    public CatalogExercise(ObjectId id, String name, String type, String equipment, String video, String description, Double calorificValue, List<ExerciseParameter> parameters) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.equipment = equipment;
        this.video = video;
        this.description = description;
        this.calorificValue = calorificValue;
        this.parameters = parameters;
    }

    public CatalogExercise() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getCalorificValue() {
        return calorificValue;
    }

    public void setCalorificValue(Double calorificValue) {
        this.calorificValue = calorificValue;
    }

    public List<ExerciseParameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<ExerciseParameter> parameters) {
        this.parameters = parameters;
    }

        /*
        public static explicit operator CatalogExercise(BsonDocument doc)
        {
            CatalogExercise result = new CatalogExercise();
            result.ID = doc["_id"].AsObjectId;
            result.Name = doc["name"].AsString;
            result.Type = doc["type"].AsString;
            result.Equipment = doc["equipment"].AsString;
            result.Video = doc["video"].AsString;
            result.Description = doc["description"].AsString;
            result.CalorificValue = doc["calorificValue"].AsDouble;
            result.Parameters = null;
            return result;
        }


        public static implicit operator string(CatalogExercise exe)
        {
            string result = JsonConvert.SerializeObject(exe);
            return result;
        }


        public static implicit operator CatalogExercise(string json)
        {
            CatalogExercise result = new CatalogExercise();
            result = JsonConvert.DeserializeObject<CatalogExercise>(json);
            return result;
        }

*/

}