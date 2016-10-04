package Objects;

import java.util.Date;

public class Weight
    {
        private Date date;
        private Double value;

        public Weight(Date date, Double value) {
            this.date = date;
            this.value = value;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public Double getValue() {
            return value;
        }

        public void setValue(Double value) {
            this.value = value;
        }
    }
