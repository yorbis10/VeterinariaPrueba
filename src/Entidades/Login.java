
package Entidades;


public class Login {
    
    private int idLogin,idUsuario;
    private String Usuario,Clave;

    public Login() {
    }

    public Login(int idLogin, int idUsuario, String Usuario, String Clave) {
        this.idLogin = idLogin;
        this.idUsuario = idUsuario;
        this.Usuario = Usuario;
        this.Clave = Clave;
    }

    
    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }
    
    
}
