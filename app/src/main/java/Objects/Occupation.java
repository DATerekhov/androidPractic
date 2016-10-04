package Objects;

import org.bson.types.ObjectId;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class Occupation {
    protected ObjectId id;
    protected ObjectId client;
    protected ObjectId trainer;
    protected Date date;
    protected Timestamp occupationStart;
    protected Timestamp occupationEnd;
    protected String status;
    protected String purpose;
    protected List<ObjectId> exercises;
    protected String mark;
    protected Double calorificValue;
    protected Double estimatedExecutionPlan;

    public Occupation(ObjectId id, ObjectId client, ObjectId trainer, Date date, Timestamp occupationStart, Timestamp occupationEnd, String status, String purpose, List<ObjectId> exercises, String mark, Double calorificValue, Double estimatedExecutionPlan) {
        this.id = id;
        this.client = client;
        this.trainer = trainer;
        this.date = date;
        this.occupationStart = occupationStart;
        this.occupationEnd = occupationEnd;
        this.status = status;
        this.purpose = purpose;
        this.exercises = exercises;
        this.mark = mark;
        this.calorificValue = calorificValue;
        this.estimatedExecutionPlan = estimatedExecutionPlan;
    }

    public  Occupation () {}
}



/*
        public static explicit operator Occupation(BsonDocument occupation)
        {
            Occupation result = new Occupation();
            result.ID = occupation["_id"].AsObjectId;
            result.Client = occupation["client"].AsObjectId;
            result.Trainer = occupation["trainer"].AsObjectId;
            result.Date = occupation["date_time"].ToUniversalTime();
            result.OccupationStart = new TimeSpan();
            result.OccupationEnd = new TimeSpan();
            result.Status = occupation["status"].AsString;
            result.Purpose = occupation["purpose"].AsString;
          //  result.Exercises = new List<ObjectId>();
         //  result.Exercises = occupation["exercises"].AsBsonArray;

            List<ObjectId> tmp = new List<ObjectId>();
            var temp = occupation["exercises"].AsBsonArray;
            for (int i = 0; i < temp.Count; i++)
            {
                tmp.Add(temp[i].AsObjectId);
            }
            result.Exercises = tmp;
            result.Mark = occupation["mark"].AsString;
            result.CalorificValue = 0;
            result.EstimatedExecutionPlan = 0;
            return result;
        }


        public static implicit operator string(Occupation occupation)
        {
            string result = JsonConvert.SerializeObject(occupation);
            return result;
        }


        public static implicit operator Occupation(string json)
        {
            Occupation result = new Occupation();
            result = JsonConvert.DeserializeObject<Occupation>(json);
            return result;
        }
*/