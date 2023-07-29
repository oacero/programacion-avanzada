public class Persona {

    private int id;
    private String cedula;
    private String nombres;
    private String telefono;
    private String email;
    private static int numPersonas;

    public Persona(){
        this.id = ++Persona.numPersonas;
    }

    public Persona(String cedula, String nombres, String telefono, String email){
        this();
        this.cedula = cedula;
        this.nombres = nombres;
        this.telefono = telefono;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", cedula='" + cedula + '\'' +
                ", nombres='" + nombres + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args){
        Persona persona1 = new Persona("1717171717", "Marco Lopez", "0987654321", "marco@mail.com");
        System.out.println(persona1);

    }



}
