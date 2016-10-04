package Objects;

    public class ExerciseParameter {
        protected String title;
        protected String parameterType;

        public ExerciseParameter(String title, String parameterType) {
            this.title = title;
            this.parameterType = parameterType;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getParameterType() {
            return parameterType;
        }

        public void setParameterType(String parameterType) {
            this.parameterType = parameterType;
        }
    }