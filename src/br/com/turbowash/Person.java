package br.com.turbowash;

abstract class Person implements Presentsitelf {

    private String name;
    private String phone;

    Person() {
        this.name = null;
        this.phone = null;
    }


    abstract void receivesInput();


    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Nome: " + name + ", Telefone: " + phone + " ");
        return string.toString();
    }


    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


//        SimpleDateFormat format1 = new SimpleDateFormat("MMMM dd, yyyy");
//        Date date = birthDate.getTime();
//        string.append(format1.format(date));


//        @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", phone='" + phone + '\'' +
//                '}';
//    }
}
