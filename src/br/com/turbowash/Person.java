package br.com.turbowash;

abstract class Person implements Presentsitelf {

    private String name;
    private String phone;
    private boolean isActive;

    public Person() {
        this(null, null);
    }

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.isActive = true;
    }

    public void deactivate() {
        this.setActive(false);
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

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
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
