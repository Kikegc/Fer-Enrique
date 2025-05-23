package mx.poo.itao;
import mx.poo.itao.objetos.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	//HOLA FERXA
    	 Documentos documento = new Documentos();
	     documento.llamarDocumentos ();
        Scanner sc = new Scanner(System.in);
        Usuario usuario = new Usuario();
        usuario.llamarUsuario();

        GeneroMusical recomendado = null;

        if (usuario.isGustaInstrumentos() && usuario.getEstadoDeAnimo().equalsIgnoreCase("Triste") && usuario.getEdad() > 25) {
            Rock rock = new Rock();
            rock.llamarRock();
            recomendado = rock;
        } else if (!usuario.isGustaInstrumentos() && usuario.getEstadoDeAnimo().equalsIgnoreCase("Feliz") && usuario.getEdad() < 30) {
            Pop pop = new Pop();
            pop.llamarPop();
            recomendado = pop;
        } else if (usuario.isPrefiereBailar() && usuario.getHoraDelDia().equalsIgnoreCase("Noche")) {
            Electronica electro = new Electronica();
            electro.llamarElectronica();
            recomendado = electro;
        } else if (usuario.getEstadoDeAnimo().equalsIgnoreCase("Relajado") && usuario.getEdad() > 30) {
            Rock rock = new Rock();
            rock.llamarRock();
            recomendado = rock;
        } else if (usuario.getEdad() < 20 && usuario.getEstadoDeAnimo().equalsIgnoreCase("Enérgico")) {
            Electronica electro = new Electronica();
            electro.llamarElectronica();
            recomendado = electro;
        } else if (usuario.isPrefiereBailar() && usuario.getEstadoDeAnimo().equalsIgnoreCase("Feliz")) {
            Pop pop = new Pop();
            pop.llamarPop();
            recomendado = pop;
        } else {
            Rock rock = new Rock();
            rock.llamarRock();
            recomendado = rock;
        }

        System.out.println("\n🎧 Recomendación musical para " + usuario.getNombre() + ":");
        recomendado.mostrarInfoGenero();
        sc.close();
    }
}
