package MiracHoca_Practice.OOP;

public class Encapsulation01 {
    public static void main(String[] args) {

        class Laptop {
           private String model;
           private String yil;
           private String memory;
           private String processor;


            public String getModel() {
                return model;
            }


            public String getYil() {
                return yil;
            }



            public String getMemory() {
                return memory;
            }

            public void setMemory(String memory) {
                this.memory = memory;
            }

            public String getProcessor() {
                return processor;
            }

            @Override
            public String toString() {
                return "Laptop" +
                        "model=" + model +
                        "yil=" + yil +
                        "memory=" + memory +
                        "processor=" + processor;
            }
        }
    }
}
