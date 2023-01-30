
package person;

public abstract class Personn {
    public String name;
    public String address;

    public Personn(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public abstract void Yaz();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        System.out.println("Personn{" + "name=" + name + ", address=" + address + '}');
        return "";
    }
        
    
}
