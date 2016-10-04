package Objects;

import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

public class OccupationExercise extends CatalogExercise
    {
        protected Integer number;
        protected String mark;
        protected Double progress;
        protected ArrayList<Integer> exerciseParameters;

        public OccupationExercise(ObjectId id, String name, String type, String equipment, String video, String description, Double calorificValue, List<ExerciseParameter> parameters, Integer number, String mark, Double progress, ArrayList<Integer> exerciseParameters) {
            super(id, name, type, equipment, video, description, calorificValue, parameters);
            this.number = number;
            this.mark = mark;
            this.progress = progress;
            this.exerciseParameters = exerciseParameters;
        }

        public OccupationExercise(Integer number, String mark, Double progress, ArrayList<Integer> exerciseParameters) {
            this.number = number;
            this.mark = mark;
            this.progress = progress;
            this.exerciseParameters = exerciseParameters;
        }

        public OccupationExercise(){}

        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }

        public String getMark() {
            return mark;
        }

        public void setMark(String mark) {
            this.mark = mark;
        }

        public Double getProgress() {
            return progress;
        }

        public void setProgress(Double progress) {
            this.progress = progress;
        }

        public ArrayList<Integer> getExerciseParameters() {
            return exerciseParameters;
        }

        public void setExerciseParameters(ArrayList<Integer> exerciseParameters) {
            this.exerciseParameters = exerciseParameters;
        }

        /*
        public static explicit operator OccupationExercise(BsonDocument doc)
        {          
            OccupationExercise result = new OccupationExercise();
            try
            {
                result.ID = doc["_id"].AsObjectId;
                result.Name = doc["name"].AsString;
                result.Type = doc["type"].AsString;
                result.Equipment = doc["equipment"].AsString;
                result.Video = doc["video"].AsString;
                result.Description = doc["description"].AsString;
                result.CalorificValue = doc["calorificValue"].AsDouble;
                result.Parameters = null;
            }
            catch
            { 
            }
            result.Number = doc["number"].AsInt32;
            result.Mark = doc["mark"].AsString;
            result.Progress = doc["progress"].AsDouble;
            result.ExerciseParameters = null;
            return result;
        }


        public static implicit operator string(OccupationExercise exe)
        {
            string result = JsonConvert.SerializeObject(exe);
            return result;
        }


        public static implicit operator OccupationExercise(string json)
        {
            OccupationExercise result = new OccupationExercise();
            result = JsonConvert.DeserializeObject<OccupationExercise>(json);
            return result;
        }
*/

    }