class Person {
    private String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public Person() {
        System.out.println("eksekusi method constractor.....");
    }
}