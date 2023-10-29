package lld2.builder.version1;

public class Student {
    private final String name;
    private final int age;
    private final double psp;
    private final String email;
    private final String phoneNumber;
    private final int gradYear;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPsp() {
        return psp;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getGradYear() {
        return gradYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", psp=" + psp +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gradYear=" + gradYear +
                '}';
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    private Student(Builder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.email = builder.getEmail();
        this.gradYear = builder.getGradYear();
        this.phoneNumber = builder.getPhoneNumber();
    }

    public static class Builder {
        private String name;
        private int age;
        private double psp;
        private String email;
        private String phoneNumber;
        private int gradYear;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Student build() {
            if (this.getGradYear() > 2023) {
                throw new RuntimeException("Validation failed");
            }
            return new Student(this);
        }
    }

}
