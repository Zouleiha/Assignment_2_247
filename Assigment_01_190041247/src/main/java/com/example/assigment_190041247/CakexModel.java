package com.example.assigment_190041247;

public class CakexModel {
        private String CakeName;
        private String CakeId;
        private String CakeType;

        public String getId() {
            return CakeId;
        }

        public void setId(String id) {
            this.CakeId = id;
        }

        public String getName() {
            return CakeName;
        }

        public void setName(String name) {
            this.CakeName = name;
        }

        public String getType() {
            return CakeType;
        }

        public void setType(String type) {
            this.CakeType = type;
        }
}
